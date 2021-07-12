package com.cts.mfpe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cts.mfpe.model.Todo;

@Service
public interface TodoService {
	public Todo find(int id);
	public List<Todo> getAll(String name);
	public boolean save(Todo todo);
	public void delete(int id);
	public Optional<Todo> Update(int id);
}
