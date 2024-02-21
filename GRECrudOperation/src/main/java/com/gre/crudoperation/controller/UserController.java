package com.gre.crudoperation.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gre.crudoperation.DTO.UserDTO;
import com.gre.crudoperation.Entity.User;

import com.gre.crudoperation.service.UserService;

import ch.qos.logback.core.model.Model;
import jakarta.validation.Valid;

@RequestMapping("/api")
@RestController

@Validated
public class UserController {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserService userServices;

	/**
	 * // ADD NEW USER DETAILS
	 */
	@PostMapping("/saveuser")
	public ResponseEntity<User> saveUserDetails(@Valid @RequestBody User user) {
		User u = null;
		try {
			u = this.userServices.saveUserDetails(user);

			return ResponseEntity.of(Optional.of(u));

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
		// userServices.saveUserDetails(user);
		// return user.getUserid();
	}

	/**
	 * // GET ALL USER DETAILS
	 * 
	 * Get all user details.
	 *
	 * @return List of user details wrapped in a ResponseEntity
	 */

	@GetMapping("/get")
	public ResponseEntity<List<User>> getAllUserDetails() {

		List<User> list = userServices.getAllUserDetails();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		return ResponseEntity.of(Optional.of(list));
		// return userServices.getAllUserDetails();

	}

	/**
	 * Retrieves all user details using Data Transfer Object (DTO) class.
	 */
	@GetMapping("/getdto")
	public List<UserDTO> getAllUserDetailsDTO() {
		// Configure the modelMapper to use a loose matching strategy
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);

		// Retrieve all user details using DTO and map them to UserDTO using modelMapper
		return userServices.getAllUserDetailsDTO().stream().map(user -> modelMapper.map(user, UserDTO.class))
				.collect(Collectors.toList());
	}

	/**
	 * // GET USER DETAILS USING BY ID
	 */
	@GetMapping("/getuserbyid/{userid}")
	public ResponseEntity<User> getUserById(@PathVariable("userid") int userid) {
		User user = userServices.getUserById(userid);

		if (user == null) {
			String errorMessage = "User with ID " + userid + " not found";
			ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		}

		return ResponseEntity.ok(user);
	}

	/**
	 * // DELETE USER DETAILS USING BY ID
	 */

	@DeleteMapping("/deletebyid/{userid}")
	public ResponseEntity<String> deleteUser(@PathVariable int userid) {
		try {
			userServices.deleteUser(userid);
			return ResponseEntity.ok("User Deleted Successfully");
		} catch (EmptyResultDataAccessException e) {
			// User with the given ID not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
		} catch (Exception e) {
			// Handle other unexpected exceptions
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
		}
	}

	/**
	 * Updates user details by user ID.
	 */
	@PutMapping("/update/{userid}")
	public ResponseEntity<User> updateUser(@PathVariable int userid, @RequestBody User user) {
		try {
			User updatedUser = userServices.updateUser(user, userid);
			return ResponseEntity.ok(updatedUser);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
