package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Supplier;

@Repository(value="SupplierDAO")
public class SupplierDAOimpl {

	private SessionFactory sessionFactory;
	private SupplierDAOimpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
@Transactional
	public boolean save(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		
		return false;
		}
	}
@Transactional
	public boolean update(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			
		return false;
	}
	}
@Transactional
	public boolean delete(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
     } catch (HibernateException e) {
      e.printStackTrace();
		return false;
	}
	}
@Transactional
	public Supplier get(String id) {
		// select * from category where id='101'
		String hql = "from Category where id = "+"'"+ id +"'"; 
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Supplier> list = query.list();
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
	public List<Supplier> list() {
         String hql = "from Category";
         Query query=sessionFactory.getCurrentSession().createQuery(hql);
 		return query.list();
	}

}

