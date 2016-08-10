package com.niit.ShoppingCart;

public class LoginDAO {
public static boolean isValidUser(String id,String password)
{
	if(id.equals("id")&& password.equals("password"))
	{
		return true;
		
	}
	else
	{
		return false;
	}
}
}
