package com.syscotech.mall.events.test;

import java.util.Collections;
import java.util.List;

import com.syscotech.mall.entity.Test;
import com.syscotech.mall.events.ReadEvent;

public class AllTestsEvent extends ReadEvent {
	private final List<Test>	tests;

	public AllTestsEvent(List<Test> tests) {
		this.tests = Collections.unmodifiableList(tests);
	}

	public List<Test> getTests() {
		return tests;
	}

}
