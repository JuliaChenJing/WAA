package com.pratik.calculatorlab5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pratik.calculatorlab5.domain.Calculator;
import com.pratik.calculatorlab5.service.CalculatorService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CalculatorController {
	
	@Autowired
	CalculatorService calculateService;
	

	
	@RequestMapping(value={"/","/form"},method=RequestMethod.GET)
	public String renderForm(Model model){
		model.addAttribute("calculator", new Calculator());
		return "form";
		
	}
	
	@RequestMapping(value="/form",method=RequestMethod.POST)
	public String processForm(@ModelAttribute("calculator")  Calculator calculator,BindingResult result,RedirectAttributes redirectAttributes){
		if(!result.hasErrors()){
			calculator.setSum(calculateService.sum(calculator.getAdd1(), calculator.getAdd2()));
			calculator.setProduct(calculateService.product(calculator.getMult1(), calculator.getMult2()));
			redirectAttributes.addFlashAttribute("formProcessed","The result is displayed");
		}else{
			return "form";		
			
		}
		redirectAttributes.addAttribute("greeting","Hi guest");
		redirectAttributes.addFlashAttribute("calculator",calculator);

		return"redirect:/result";

		
		
	}
	
	@RequestMapping(value="/result")
	public String renderResult(@ModelAttribute("calculator") Calculator calculator, Model model){
		return "form";
	}
	
	
	
	
	
	
	

	
}
