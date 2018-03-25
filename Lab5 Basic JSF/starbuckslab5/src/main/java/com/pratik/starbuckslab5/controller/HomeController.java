package com.pratik.starbuckslab5.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pratik.starbuckslab5.data.DataFacade;


/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("user")
public class HomeController {
	@Autowired
	ServletContext context;
	
	@RequestMapping("/home")
	public String home(Model model){
		Map<String, String> roastMap = new HashMap<String, String>();
		roastMap.put("Light", "light");
		roastMap.put("Medium", "medium");
		roastMap.put("Dark", "dark");
		model.addAttribute("roasts", roastMap);
		return "home";
		
	}
	
	
	@RequestMapping(value="/advicelist",method = RequestMethod.GET)
	public String advice(@RequestParam("roast") String roast,Model model){
		DataFacade data = (DataFacade) context.getAttribute("dataSource");
		List<String> advice = data.getAdvice(roast);
		model.addAttribute("roastList", advice);
		model.addAttribute("roast",roast);
		return "advice";
		
	}

	

	
}
