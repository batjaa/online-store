package com.syscotech.mall.services;

import com.syscotech.mall.events.test.AllTestsEvent;
import com.syscotech.mall.events.test.RequestAllTestsEvent;

public interface TestService {
	public AllTestsEvent getAllTests(RequestAllTestsEvent ev);
}
