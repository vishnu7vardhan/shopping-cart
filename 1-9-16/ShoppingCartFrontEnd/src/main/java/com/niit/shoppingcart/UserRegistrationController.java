package com.niit.shoppingcart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shopingcart.dao.UserDetailsDAO;
import com.niit.shopingcart.model.UserDetails;

import javax.validation.Valid;
import java.util.List;


/*
 * This Controller is used to register user into the system
 */
@Controller
public class UserRegistrationController {

    @Autowired
    private UserDetailsDAO userDetailsDAO;
    
    /*
     * registerUserPost method is used to register user into  the system and to show registration related errors
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUserPost( @ModelAttribute("userDetails") UserDetails userDetails, Model model) {

        


        userDetails.setEnabled(true);
//userDetails.setrole("role_adminb");

        userDetailsDAO.addUser(userDetails);

        return "Index";

    }
    @RequestMapping("/Register")
    public String registrationUser(Model model){
    	
    	UserDetails userDetails = new UserDetails();
    	model.addAttribute("userDetails", userDetails);
    	return "Register";
    }

}
