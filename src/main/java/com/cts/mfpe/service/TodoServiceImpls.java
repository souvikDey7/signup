package com.cts.mfpe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.mfpe.dao.TodoDao;
import com.cts.mfpe.model.Todo;

@Service
public class TodoServiceImpls implements TodoService {

	@Autowired
	TodoDao todoDao;
	
	@Override
	public Todo find(int id) {
		// TODO Auto-generated method stub
		return todoDao.getById(id);
	}

	@Override
	public List<Todo> getAll(String name) {
		return todoDao.findByName(name); 
	}

	@Override
	public boolean save(Todo todo) {
		try {
		todoDao.save(todo);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}

	}

	@Override
	public void delete(int id) {
	todoDao.deleteById(id);
	}

	@Override
	public Optional<Todo> Update(int id) {
		return null;
	}
}
