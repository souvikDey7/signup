package com.cts.mfpe.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cts.mfpe.model.userData;
import com.cts.mfpe.service.signServiceImpls;

@RestController
public class signController {
	
	@Autowired
	private signServiceImpls SignServiceImpls;
	
	@Autowired
	private ListController listController;
	
	private String Username;
	
	@GetMapping("/")
	public ModelAndView enter()
	{	
		ModelAndView mv=new ModelAndView("front");
		return mv;
	}
	@GetMapping("/login")
	public ModelAndView log(Model m)
	{
		ModelAndView mv=new ModelAndView("login");
		m.addAttribute("error","Login in");		
		return mv;
	}
	@GetMapping("/signup")
	public ModelAndView signUp()
	{
		ModelAndView mv=new ModelAndView("signUp");
	return mv;
	}
	@PostMapping("/showNew")
	public ModelAndView show(@RequestParam String name,@RequestParam String password,Model m)
	{
		userData userdata=new userData(name,password);
		if(SignServiceImpls.save(userdata))
		{
			ModelAndView mv=new ModelAndView("welcome");
		m.addAttribute("status","successfully created");
		m.addAttribute("name",name);
		Username=name;
		return mv;
		}
		else
		{
			ModelAndView mv=new ModelAndView("signUp");
			m.addAttribute("error","Username is already pressent");
			return mv;
		}
	}
	@PostMapping("/show")
	public ModelAndView shownew(@RequestParam String name,@RequestParam String password,Model m,ModelMap li)
	{
		userData userdata=new userData(name,password);
		List<userData> l=SignServiceImpls.findByName(userdata);
			if(l.size()==0)
			{
				ModelAndView mv=new ModelAndView("login");
				m.addAttribute("status","Username is not pressent");
				return mv;
			}
			else if(l.get(0).getPassword().equals(password))
			{
				ModelAndView mv=new ModelAndView("welcome");
				m.addAttribute("name",name);
				Username=name;
				li.addAttribute("list",listController.RecentData());
				m.addAttribute("status","successfully login");
				return mv;	
			}
			else
			{
				ModelAndView mv=new ModelAndView("login");
				m.addAttribute("status","password is not wrong");
				return mv;
			}
	}
	protected String  getUserName()
	{
		return Username;
	}
}