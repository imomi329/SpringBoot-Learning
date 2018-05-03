package com.learning;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/index")
	public String index(Map<String, Object> map) {
		map.put("name", "Andy");
		return "index";
	}

}
