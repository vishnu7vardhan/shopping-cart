package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Category;

@Repository(value="CategoryDAO")

public class CategoryDAOimpl implements CategoryDAO {
	//CategoryDAOimpl is the instance
	@Autowired
	private SessionFactory sessionFactory;
	private CategoryDAOimpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
@Transactional
	public boolean save(Category categorey) {
		try {
			sessionFactory.getCurrentSession().save(categorey);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			// TODO: handle exception
		
		return false;
		}
	}
@Transactional
	public boolean update(Category categorey) {
		try {
			sessionFactory.getCurrentSession().update(categorey);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			
		return false;
	}
	}
@Transactional
	public boolean delete(Category categorey) {
		try {
			sessionFactory.getCurrentSession().delete(categorey);
			return true;
     } catch (HibernateException e) {
      e.printStackTrace();
		return false;
	}
	}
@Transactional
	public Category get(String id) {
		// select * from category where id='101'
		String hql = "from Category where id = "+"'"+ id +"'"; 
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> list = query.list();
		if(list==null){
			return null;
			}
		else
		{
			return list.get(0);
		}

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Category> list() {
         String hql = "from Category";
         Query query=sessionFactory.getCurrentSession().createQuery(hql);
 		return query.list();
	}

}
