package com.example.practise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class fromcontroller {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

}
