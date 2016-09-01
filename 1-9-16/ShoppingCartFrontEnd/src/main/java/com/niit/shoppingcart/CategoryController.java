package com.niit.shoppingcart;

import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopingcart.dao.CategoryDAO;

public class CategoryController {

	@Autowired
	private Product product;

	@Autowired
	private Supplier supplier;

	@Autowired
	private Category category;

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private SupplierDAO supplierDAO;

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping("/manageCategories")
	public ModelAndView categories(){
	ModelAndView mv= new ModelAndView("/home");
	mv.addObject("category",category);
	mv.addObject("isAdminClickedCategories", "true");
	mv.addObject("categoryList",categoryDAO.list());
	return mv;
	}

	@RequestMapping("/manageProducts")
	public ModelAndView suppliers(){
	ModelAndView mv= new ModelAndView("/home");
	mv.addObject("product",product);
	mv.addObject("isAdminClickedProducts", "true");
	mv.addObject("productList",productDAO.list());
	return mv;
	}

	@RequestMapping("/manageSuppliers")
	public ModelAndView products(){
	ModelAndView mv= new ModelAndView("/home");
	mv.addObject("supplier",supplier);
	mv.addObject("isAdminClickedSuppliers", "true");
	mv.addObject("supplierList",supplierDAO.list());
	return mv;
	}

	
	
}
