package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchLead {

	@RequestMapping("/searchleads")
	public String searchLead() {
		return "search_lead";
		
	}
}
