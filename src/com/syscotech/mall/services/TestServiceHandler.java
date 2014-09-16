package com.syscotech.mall.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.syscotech.mall.dao.TestDao;
import com.syscotech.mall.entity.Test;
import com.syscotech.mall.events.test.AllTestsEvent;
import com.syscotech.mall.events.test.RequestAllTestsEvent;

public class TestServiceHandler implements TestService {

	@Autowired
	private TestDao	testDao;

	@Override
	@Transactional
	public AllTestsEvent getAllTests(RequestAllTestsEvent ev) {
		List<Test> tests = testDao.getAll();
		AllTestsEvent allTestsEvent = new AllTestsEvent(tests);
		return allTestsEvent;
	}

}
