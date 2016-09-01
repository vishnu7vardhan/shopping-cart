package com.niit.shopingcart.dao;

import java.util.List;

import com.niit.shopingcart.model.UserDetails;

public interface UserDetailsDAO {
	void addUser (UserDetails userDetails);

    UserDetails getUserById (int userId);

    List<UserDetails> getAllUsers();

    UserDetails getUserByUsername (String username);
    
    public UserDetails isValidUser(String id,String password); 
}
