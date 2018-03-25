package edu.mum.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.User;
import edu.mum.repository.DataFacade;
import edu.mum.service.AuthenticationService;

@Service
public class AuthenticationServiceImp implements AuthenticationService {
	
	@Autowired
	DataFacade dataFacade;

	@Override
	public boolean authenticate(User user) {
		String expectedPassword = dataFacade.findPassword(user.getName());
		
		if(expectedPassword == null || !expectedPassword.equals(user.getPassword())) {
			return false;
		} else {
			return true;
		}
	}

}
