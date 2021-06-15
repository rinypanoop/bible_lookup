package com.church.scriptures.biblelookup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BibleLookupMvcController {

	@GetMapping("/bible")
	
	public String greeting(Model model) {
		
		return "bible";
	}
}
