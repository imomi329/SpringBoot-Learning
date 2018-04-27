package com.learning.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/likeName")
	public List<Demo> likeName(String name) {
		return demoService.likeName(name);
	}
	
	@RequestMapping("/getById")
	public Demo getById(long id) {
		return demoService.getById(id);
	}

	@RequestMapping("/getNameById")
	public String getNameById(long id) {
		return demoService.getNameById(id);
	}
	
	@RequestMapping("/save")
	public Demo save() {
		Demo demo = new Demo();
		demo.setName("001926");
		demoService.save(demo);
		return demo;
	}
	
}
