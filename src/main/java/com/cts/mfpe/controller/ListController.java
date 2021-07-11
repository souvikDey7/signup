package com.cts.mfpe.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cts.mfpe.model.Todo;
import com.cts.mfpe.service.TodoServiceImpls;

@RestController
public class ListController {

	@Autowired
	private TodoServiceImpls todoServiceImpls;

	private Map<Integer,String> a=new HashMap<>();
	
	@Autowired
	private signController signcontroller;
	
	@PostMapping("/save")
	public ModelAndView listAdd(Model m,@RequestParam String todo)
	{
		ModelAndView mv=new  ModelAndView("welcome");
		Todo td=new Todo(signcontroller.getUserName(),todo);
		todoServiceImpls.save(td);
		m.addAttribute("m","success");
		return mv;
	}
	@GetMapping("/todo")
	public ModelAndView getTodo(ModelMap li)
	{
		li.addAttribute("list",this.getData());
		ModelAndView mv=new ModelAndView("Todo");
		return mv;
	}
	
	@PostMapping("/delete")
	public ModelAndView deleteData(@RequestParam int delete,ModelMap mp)
	{
		todoServiceImpls.delete(delete);
		ModelAndView mv=new ModelAndView("Todo");
		mp.addAttribute("list",this.getData());
		return mv;
	}
	@PostMapping("/update")
	public ModelAndView updateData(@RequestParam int update,Model m)
	{
	m.addAttribute("i",todoServiceImpls.find(update).getTodo());
	todoServiceImpls.delete(update);
	return new ModelAndView("welcome");
	}
	
	public Map<Integer,String> getData()
	{ 
		a.clear();
		for(Todo i:todoServiceImpls.getAll(signcontroller.getUserName()))
			a.put(i.getId(),i.getTodo());
		return a;
	}
}
