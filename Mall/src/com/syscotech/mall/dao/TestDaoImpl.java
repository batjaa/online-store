package com.syscotech.mall.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.syscotech.mall.entity.Test;

public class TestDaoImpl implements TestDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Test> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Test").list();
	}

}
