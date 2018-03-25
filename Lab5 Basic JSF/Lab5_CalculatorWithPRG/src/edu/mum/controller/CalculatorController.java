package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.domain.Calculator;
import edu.mum.service.CalculatorService;

@Controller
@RequestMapping({"/", "calculator.do"})
public class CalculatorController {
	
	@Autowired
	CalculatorService calculatorService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String inputProduct() {
		return "calculator";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String compute(Calculator calculator, RedirectAttributes redirectAttributes) {
		calculator = calculatorService.compute(calculator);
		redirectAttributes.addFlashAttribute("calculator",  calculator);
		redirectAttributes.addAttribute("greeting", "Hi User");
			
		return "redirect:/result";

	}

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String result() {
		return "result";

	}
}
