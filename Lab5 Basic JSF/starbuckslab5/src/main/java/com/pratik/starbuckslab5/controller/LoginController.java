package com.pratik.starbuckslab5.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.pratik.starbuckslab5.data.DataFacade;
import com.pratik.starbuckslab5.domain.UserForm;

@Controller
@SessionAttributes("user")
public class LoginController {
	
	@Autowired
	ServletContext context;
	
	@RequestMapping(value={"/","/login"}, method = RequestMethod.GET)
	public String login(Model model){
		model.addAttribute("userForm",new UserForm());
		if(model.asMap().get("user")!=null){
			Map<String, String> roastMap = new HashMap<String, String>();
			roastMap.put("Light", "light");
			roastMap.put("Medium", "medium");
			roastMap.put("Dark", "dark");
			model.addAttribute("roasts", roastMap);
		}
		return "home";
		
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String authenticate(@ModelAttribute("userForm") UserForm userForm, Model model){
		DataFacade data = (DataFacade) context.getAttribute("dataSource");
		if(userForm.authenticate(data)){
			
			model.addAttribute("user",userForm);
			
			return "redirect:/home";
		}
		return "home";
}
	
	@RequestMapping(value={"/logout"}, method = RequestMethod.GET)
	public String logout(SessionStatus status){
		status.setComplete();
		return "redirect:/login";		
	}
	

		
	

}
