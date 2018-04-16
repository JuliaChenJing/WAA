package com.students.contoller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.students.domain.Student;

@Controller
public class StudentController {
//
//	@InitBinder
//	public void initBinder(WebDataBinder webDataBinder) {
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm/dd/yyyy");
//		simpleDateFormat.setLenient(true);
//		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
//
//	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String showForm(@ModelAttribute("student") Student student, Model model) {
		Map<String, String> genderMap = new HashMap<>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		model.addAttribute("genderMap", genderMap);

		return "registration";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model,RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return "registration";
		}
		redirectAttributes.addFlashAttribute("student",student);
		

		return "redirect:/success";

	}
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String showForm( Model model) {
	
		return "success";
	}

}
