package com.niit.shoppingcartcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class TestCategory {
public static void main(String[] args){
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	context.scan("com.niit");
	context.refresh();
	context.getBean("category");
	System.out.println("Bean created successfully");
	
	
	
}
}
