package com.gre.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.User;
import com.gre.crudoperation.UserRepository.UserRepository;

@Service

public class UserService {

//     private User user;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	/**
	 * // ADD NEW USER DETAILS
	 */
	public User saveUserDetails(User user) {
		return userRepo.save(user);
	}


		/**
	 * Save user details data transfer object.
	 *
	 * @param  user  the user details data transfer object
	 * @return       the saved user details data transfer object
	 */
	public User saveUserDetailsDTO(User user) {
		return userRepo.save(user);
	}

//           public void saveDetails( String username, String password) {
//        	   String encodedPassword = passwordEncoder.encode(password);
//        	   User user =new User(username, password);
//        	   userRepo.save(user);
//           }
//	 

	/**
	 * // GET ALL USER DETAILS
	 */
	public List<User> getAllUserDetails() {

		return userRepo.findAll();
	}

		/**
	 * Retrieves all user details as a list of User objects.
	 *
	 * @return         the list of User objects containing all user details
	 */
	public List<User> getAllUserDetailsDTO() {

		return userRepo.findAll();
	}

	/**
	 * // GET USER DETAILS USING USER ID HERE
	 
	 * Retrieves a user by their ID.
	 *
	 * @param  userid  the ID of the user to retrieve
	 * @return         the user with the specified ID
	 */

	public User getUserById(int userid) {
		return userRepo.findById(userid).get();
	}

	
	/**
	 * // DELETE USER DETAILS USING USER ID HERE	
	 * Deletes a user by the given user id.
	 *
	 * @param  userid  the id of the user to be deleted
	 * @return         void
	 */

	public void deleteUser(int userid) {
		userRepo.deleteById(userid);
	}

	/**
	 * // Update USER DETAILS USING USER ID HERE
	 */
	public User updateUser(User user, int userid) {
		User useraleadyExist = getUserById(userid);
		if (useraleadyExist != null) {
			useraleadyExist.setFullname(user.getFullname());
			useraleadyExist.setUsername(user.getUsername());
			useraleadyExist.setUserrole(user.getUserrole());
			useraleadyExist.setPassword(user.getPassword());

			return userRepo.save(useraleadyExist);
		}
		return useraleadyExist;
	}

}
