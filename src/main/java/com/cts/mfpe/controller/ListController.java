package com.cts.mfpe.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
	public ModelAndView listAdd(Model m,@RequestParam String todo,ModelMap li)
	{
		ModelAndView mv=new  ModelAndView("welcome");
		Todo td=new Todo(signcontroller.getUserName(),todo);
		if(!todo.equals("null"))
		{
		if(todoServiceImpls.save(td))
		m.addAttribute("m","succesfully saved");
		else
			m.addAttribute("m","could not save!! internel error");
		}
		li.addAttribute("list",this.RecentData());
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
	
	private Map<Integer,String> getData()
	{ 
		a.clear();
		for(Todo i:todoServiceImpls.getAll(signcontroller.getUserName()))
			a.put(i.getId(),i.getTodo());
		return a;
	}
	protected Map<Integer,String> RecentData()
	{ 
		a.clear();
		List<Todo>rec =todoServiceImpls.getAll(signcontroller.getUserName());
		Collections.reverse(rec);
		int j=0;
		for(Todo i:rec)
		{
			a.put(i.getId(),i.getTodo());
			j++;
			if(j>4)
				break;
		}
		return a;
	}
}
