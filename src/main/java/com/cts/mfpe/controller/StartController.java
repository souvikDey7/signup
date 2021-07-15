package com.cts.mfpe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StartController {

	@GetMapping("/")
	public ModelAndView enter()
	{	
		ModelAndView mv=new ModelAndView("front");
		return mv;
	}
}
