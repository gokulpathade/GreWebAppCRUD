package com.budgettracking.config;


import java.io.IOException;

import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.budgettracking.service.JWTServiceImpl;
import com.budgettracking.service.UserService;

//import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import lombok.RequiredArgsConstructor;

@Component
//@RequiredArgsConstructor
public class JWTAuthenticationFilter extends OncePerRequestFilter {

	private final UserService userServiceDetails;

	private final JWTServiceImpl jwtService;

	/**
	 * @param jwtService
	 * @param userServiceDetails
	 */
	public JWTAuthenticationFilter(UserService userServiceDetails, JWTServiceImpl jwtService) {
//		super();

		this.userServiceDetails = userServiceDetails;
		this.jwtService = jwtService;
	}



	
	/**
 * This method is an implementation of the doFilterInternal method of the Filter interface.
 * It checks for the presence of an Authorization header in the HTTP request, and if it's not present or does not start with "Bearer ",
 * it proceeds to the next filter in the chain.
 * If the Authorization header is present and starts with "Bearer ", it extracts the token and then attempts to extract the username from the token.
 * If the username is not null and the current security context does not have an authenticated user, it loads the user details using the username,
 * validates the token, creates an authentication token, sets the authentication details, and sets it in the security context.
 * Finally, it proceeds to the next filter in the chain.
 *
 * @param request      the HTTP servlet request
 * @param response     the HTTP servlet response
 * @param filterChain  the filter chain
 * @throws ServletException  if a servlet-specific error occurs
 * @throws IOException       if an I/O error occurs
 */


//	@Override
//	protected void doFilterInternal(HttpServletRequest request,
//	HttpServletResponse response,
//	FilterChain filterChain)
//	throws ServletException, IOException {
//		String authHeader = request.getHeader("Authorization");
//		if (authHeader != null && authHeader.startsWith("Bearer ")) {
//			String token = authHeader.substring(7);
//			String username = jwtService.extractUsername(token);
//			if (username != null || SecurityContextHolder.getContext().getAuthentication() != null) {
//				UserDetails userDetails = userServiceDetails.loadUserByUsername(username);
//				if (jwtService.isValid(token, userDetails)) {
//					UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails,
//							null, userDetails.getAuthorities());
//					authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//					SecurityContextHolder.getContext().setAuthentication(authToken);
//				}
//			}
//		}
//		filterChain.doFilter(request, response);
//	}
//
//	
//	
	
	
	
	
	
	@Override
	protected void doFilterInternal(
			@NonNull HttpServletRequest request,
			@NonNull HttpServletResponse response, 
			@NonNull FilterChain filterChain
			)
	        throws ServletException, IOException {
	    // Extract the Authorization header from the HTTP request
	    String authHeader = request.getHeader("Authorization");

	    // Check if the Authorization header is present and starts with "Bearer "
	    if (authHeader != null && authHeader.startsWith("Bearer ")) {
	        // Extract the token from the Authorization header
	        String token = authHeader.substring(7);

	        // Extract the username from the JWT token
	        String username = jwtService.extractUsername(token);

	        // Check if the username is not null and if the current SecurityContext has no authenticated user
	        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
	            // Load user details from the user service based on the extracted username
	            UserDetails userDetails = userServiceDetails.loadUserByUsername(username);

	            // Check if the JWT token is valid for the extracted user details
	            if (jwtService.isValid(token, userDetails)) {
	                // If valid, create an authentication token with the user details and authorities
	                UsernamePasswordAuthenticationToken authToken = 
	                		new UsernamePasswordAuthenticationToken(
	                        userDetails, null,
	                        userDetails.getAuthorities());

	                // Set details of the authentication token based on the incoming HTTP request
	                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

	                // Set the authentication token in the SecurityContext
	                SecurityContextHolder.getContext().setAuthentication(authToken);
	            }
	        }
	    }

	    // Continue the filter chain to process the request
	    filterChain.doFilter(request, response);
	}



	

}


