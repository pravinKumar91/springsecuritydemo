package com.prsolutions.springsecuritydemo.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository myUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("username : "+username);
		Optional<User> user = myUserRepository.findByUserName(username);
		System.out.println("User data: "+user.toString());
		
		user.orElseThrow(() -> new UsernameNotFoundException("INVALID_USERNAME : "+username));
		
		return user.map(MyUserDetails::new).get();
	}	
}
