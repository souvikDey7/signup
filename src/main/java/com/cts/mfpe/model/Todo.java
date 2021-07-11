package com.cts.mfpe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	private String name; 
	private String todo;
	public Todo(String name,String todo)
	{
		this.name=name;
		this.todo=todo;
	}
}
