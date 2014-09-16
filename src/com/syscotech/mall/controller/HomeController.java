package com.syscotech.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syscotech.mall.entity.Test;
import com.syscotech.mall.events.test.AllTestsEvent;
import com.syscotech.mall.events.test.RequestAllTestsEvent;
import com.syscotech.mall.services.TestService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private TestService	testService;

	@RequestMapping(value = "/test.json", method = RequestMethod.GET)
	@ResponseBody
	public List<Test> listEmployees() {
		AllTestsEvent ev = testService.getAllTests(new RequestAllTestsEvent());
 
		return ev.getTests();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public List<Test> getAllTests() {
		System.out.println("I was here!");
		AllTestsEvent ev = testService.getAllTests(new RequestAllTestsEvent());

		return ev.getTests();
	}

}
