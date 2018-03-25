package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.mum.domain.User;
import edu.mum.service.AuthenticationService;

@Controller
@SessionAttributes("user")
public class AuthenticationController {
	
	@Autowired
	AuthenticationService authenticationService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticate(User user, Model model){
		if(!authenticationService.authenticate(user)) {
			return "redirect:login";
		} 
		else {
			model.addAttribute("user", user);
			return "forward:advice";
		}
	}
	
	
	@RequestMapping(value = "/logout")
	public String logout(Model model, SessionStatus status)	{
		status.setComplete();
		return "redirect:/";
	}

}
