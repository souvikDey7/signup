package com.cts.mfpe.dao;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.mfpe.model.Todo;

@Repository
public interface TodoDao extends JpaRepository<Todo,Integer> {
	
	public List<Todo> findByName(String name);
}
