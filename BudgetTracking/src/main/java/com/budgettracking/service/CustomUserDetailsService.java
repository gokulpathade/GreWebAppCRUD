//package com.budgettracking.service;
//
//import java.sql.Array;
//import java.util.Collection;
//import java.util.List;
//import java.util.Optional;
//
//import org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.budgettracking.model.CustomUserDetail;
//import com.budgettracking.model.User;
//import com.budgettracking.repository.UserRepository;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
// 
//	 
//	
//	private final UserRepository userRepository;
//
//    /**
//	 * @param userRepository
//	 */
//	public CustomUserDetailsService(UserRepository userRepository) {
////		super();
//		this.userRepository = userRepository;
//	}
//
//	@Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//        if(user==null) {
//        	throw new UsernameNotFoundException("username or password not found");
//        }
//        return new CustomUserDetail(
//        		user.getUsername(),
//        		user.getPassword(), 
//        	       authorities(),
//        		user.getFullname());
//        }
////                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
//
////        List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList("ROLE_USER"); // Replace with actual roles
//
////        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
////    }
//    
//    
//    
//    public Collection<? extends GrantedAuthority > authorities()
//    {
//    	return Array.asList(new SimpleGrantedAuthority("USER"));
//    }
//
//
//}
