package com.jjjsins.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControl {
	@RequestMapping("/test")
	public String test() {
		System.out.println("gogogo!");
		return "test";
	}

}
