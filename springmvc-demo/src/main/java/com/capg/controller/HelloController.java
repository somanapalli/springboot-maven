package com.capg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.model.Student;


@Controller
public class HelloController {
	/*
	 * @RequestMapping("/hello") public ModelAndView sayHello() { ModelAndView mv =
	 * new ModelAndView(); mv.setViewName("welcome"); return mv; }
	 * 
	 * @RequestMapping("/getStudent") public ModelAndView getStudentInfo() { Student
	 * obj = new Student(); obj.setStid(100); obj.setStname("nikhil");
	 * 
	 * ModelAndView mv = new ModelAndView();
	 * 
	 * mv.addObject("capg", obj);
	 * 
	 * mv.setViewName("welcome");
	 * 
	 * return mv; }
	 */
	/*
	 * @RequestMapping("/hello") public String display(@RequestParam("name") String
	 * name, @RequestParam("pass") String pass ,Model m) {
	 * 
	 * Student obj = new Student(); obj.setStname(name); obj.setStpass(pass);
	 * 
	 * //adding student object to the model object
	 * 
	 * m.addAttribute("message", obj);
	 * 
	 * return "viewpage";
	 * 
	 * }
	 */
	
	@RequestMapping("/hello")
	public String display(@ModelAttribute("message") Student stu)
	{
		return "viewpage";
	}
}

