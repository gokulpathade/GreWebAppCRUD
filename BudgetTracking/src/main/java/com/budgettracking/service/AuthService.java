package com.budgettracking.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.budgettracking.model.AuthenticationResponse;
import com.budgettracking.model.User;
import com.budgettracking.repository.UserRepository;

@Service
public class AuthService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	private final JWTServiceImpl jwtService;
	private final AuthenticationManager authManager;




	/**
	 * @param userRepository
	 * @param passwordEncoder
	 * @param jwtService
	 * @param authResponse
	 */
	public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, JWTServiceImpl jwtService,
			AuthenticationManager authManager) {

		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtService = jwtService;
		this.authManager = authManager;
	}






	/**
	 * Save user information to the database and return authentication response.
	 *
	 * @param  signup  user object containing signup information
	 * @return        authentication response with token
	 */

	public AuthenticationResponse saveUser(User signup) {
		User newsignup = new User();
//		user.setEmail_id(signup.getEmail_id());
//		user.setFullname(signup.getFullname());
//		
//		user.setAddress(sign);
//		user.setRoles(signup.getRoles());
//		user.setUsername(signup.getUsername());
//		user.
//		
//		
		
		
		
		newsignup.setUsername(signup.getUsername()); // Update the signupname
		newsignup.setFullname(signup.getFullname()); // Update the fullname
		newsignup.setRoles(signup.getRoles()); // Update the role
		newsignup.setPassword(passwordEncoder.encode(signup.getPassword()));
		newsignup.setAddress(signup.getAddress());
		newsignup.setCity(signup.getCity());
		newsignup.setCountry(signup.getCountry());
		newsignup.setDepartment(signup.getDepartment());
		newsignup.setEmail(signup.getEmail());
		newsignup.setDesignation(signup.getDesignation());
		newsignup.setMobile_no(signup.getMobile_no());
		newsignup.setPhone(signup.getPhone());
		newsignup.setState(signup.getState());
		newsignup.setZip(signup.getZip());
		
		
		
		
		signup = userRepository.save(newsignup);
//		return ResponseEntity.ok(signupRepository.save(signup)); 
		String token = jwtService.generateToken(signup);
		return new AuthenticationResponse(token);
	}








		/**
	 * Authenticates the user and generates an authentication token.
	 *
	 * @param  signin  the user information for authentication
	 * @return        an authentication response containing the generated token
	 */
	public AuthenticationResponse authenticate(User signin) {
		authManager.authenticate(new UsernamePasswordAuthenticationToken(signin.getEmail(), signin.getPassword()));

		User user = userRepository.findByEmail(signin.getEmail()).orElseThrow();
		String token = jwtService.generateToken(user);

		return new AuthenticationResponse(token);
	}

}
