package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Entity
@Table // if table name and domain class name is same no need to specify name here
@Component
public class Category {
	
	//id,name,description are the fields in the table
	@Id
	private String id;
	private String name;
	private String description;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
		
	

}
