package com.login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.login.service.UserService;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfiguration {
	
	
//	/**
//	 * Locates the user based on the username. In the actual implementation, the search
//	 * may possibly be case sensitive, or case insensitive depending on how the
//	 * implementation instance is configured. In this case, the <code>UserDetails</code>
//	 * object that comes back may have a username that is of a different case than what
//	 * was actually requested..
//	 * @param username the username identifying the user whose data is required.
//	 * @return a fully populated user record (never <code>null</code>)
//	 * @throws UsernameNotFoundException if the user could not be found or the user has no
//	 * GrantedAuthority
//	 */
//	
//     //	first and simple way to login 
//	@Bean
//	public UserDetailsService userDetailsService() {
//		
//		/**
//		 * Non-persistent implementation of {@code UserDetailsManager} which is backed by an
//		 * in-memory map.
//		 * <p>
//		 * Mainly intended for testing and demonstration purposes, where a full blown persistent
//		 * system isn't required.
//		 *
//		 */
//		var userDetailsManager =	new InMemoryUserDetailsManager();
//		
//		var user = User.withUsername("gokul")
//		.password("123")
//		.authorities("read")
//		.build();
//		
//		
//		userDetailsManager.createUser(user);
//		
//		return userDetailsManager;
//	}
//	
	


	
//	@@@@@@@@@@@@@@@@@@@@@@@@ 2 way @@@@@@@@@@@@@@@@
	
	 //	first and simple way to login 
	@Bean
	public UserDetailsService userDetailsService() {
		
		
		return new UserService();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	protected void configure (AuthenticationManagerBuilder auth) throws Exception{
//		auth.inMemoryAuthentication()
//		.withUser("user").password("password").roles("USER")
//		.and()
//		.withUser("manager").password("password").roles("USER","MANAGER")
//		.and()
//		.withUser("admin").password("password").roles("USER","ADMIN");
//	}
	
	
//	@SuppressWarnings("removal")
//	protected void configure(HttpSecurity http) throws Exception{
//        http
//                .authorizeRequests(requests -> requests
//                        .requestMatchers("/user").hasRole("USER")
//                        .requestMatchers("/manager").hasAnyRole("MANAGER", "ADMIN")
//                        .requestMatchers("/admin").hasRole("ADMIN"))
//                .formLogin(withDefaults())
//                .logout(logout -> logout
//                        .logoutSuccessUrl("/api")
//                        .permitAll());
//	}

//
//	private Customizer<FormLoginConfigurer<HttpSecurity>> withDefaults() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
	
	
	
	@Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
