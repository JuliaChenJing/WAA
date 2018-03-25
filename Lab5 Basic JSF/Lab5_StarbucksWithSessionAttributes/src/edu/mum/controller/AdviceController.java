package edu.mum.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.service.AdviceService;

@Controller
@RequestMapping("/advice")
public class AdviceController {
	
	@Autowired
	AdviceService adviceService;

	@RequestMapping(method = RequestMethod.GET)
	public String inputAdvice(Model model){
		Map< String, String > roastMap = new HashMap<String, String>();
		roastMap.put("light", "Light");
		roastMap.put("medium", "Medium");
		roastMap.put("dark", "Dark");
 
		model.addAttribute("roasts", roastMap);
		model.addAttribute("roast", "-");
		
		return "advice";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveAdvice(String roast, Model model){
 		List<String> advice = adviceService.getAdvice(roast);
 		model.addAttribute("roastList", advice);
		return "display";
	}
}
