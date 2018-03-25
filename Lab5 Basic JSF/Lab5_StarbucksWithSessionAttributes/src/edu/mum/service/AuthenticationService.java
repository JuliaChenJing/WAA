package edu.mum.service;

import edu.mum.domain.User;

public interface AuthenticationService {
	
	boolean authenticate(User user);
}
