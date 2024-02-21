package com.budgettracking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budgettracking.model.AuthenticationResponse;
import com.budgettracking.model.User;
import com.budgettracking.service.AuthService;

@RestController
@RequestMapping("/register")
//@RequiredArgsConstructor
public class AuthController {

//  private final UserService userService;

	private final AuthService authService;

	/**
	 * @param authService
	 */
	public AuthController(AuthService authService) {

		this.authService = authService;
	}





		/**
	 * Save user data.
	 *
	 * @param  signup	the user data to be saved
	 * @return         	the authentication response for the saved user
	 */

	@PostMapping("/save")
	public ResponseEntity<AuthenticationResponse> saveUser(@RequestBody User signup) {

		return ResponseEntity.ok(authService.saveUser(signup));
	}



		/**
	 * A description of the entire Java function.
	 *
	 * @param  signin	description of parameter
	 * @return         	description of return value
	 */
	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> login(@RequestBody User signin) {

		return ResponseEntity.ok(authService.authenticate(signin));
	}

}
