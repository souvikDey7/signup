package com.cts.mfpe.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cts.mfpe.model.userData;
import com.cts.mfpe.service.signServiceImpls;


//@RestController
@Controller
//@RequestMapping("welcome")
public class signController {
	
	@Autowired
	signServiceImpls SignServiceImpls;
	
	@GetMapping("/")
	public String enter()
	{	
		return "front";
	}
	@GetMapping("/login")
	public String log(Model m)
	{
		m.addAttribute("error","Login in");		
		return "login";
	}
	@GetMapping("/signup")
	public String signUp()
	{
	return "signUp";
	}
	@PostMapping("/showNew")
	public String show(@RequestParam String name,@RequestParam String password,Model m)
	{
		userData userdata=new userData(name,password);
		if(SignServiceImpls.save(userdata))
		{
		m.addAttribute("status","created");
		m.addAttribute("name",name);
		return "welcome";
		}
		else
		{
			//ModelAndView mv=new ModelAndView("signUp");
			m.addAttribute("error","Username is already pressent");
			//return mv;
			return "signUp";
		}
	}
	
	@PostMapping("/show")
	public String shownew(@RequestParam String name,@RequestParam String password,Model m)
	{
		userData userdata=new userData(name,password);
		List<userData> l=SignServiceImpls.findByName(userdata);
			if(l.size()==0)
			{
				m.addAttribute("status","Username is not pressent");
				return "login";
			}
			else if(l.get(0).getPassword().equals(password))
			{
				m.addAttribute("name",name);
				m.addAttribute("status","login");
				return "welcome";	
			}
			else
			{
				m.addAttribute("status","password is not wrong");
				return "login";
			}
}
}
