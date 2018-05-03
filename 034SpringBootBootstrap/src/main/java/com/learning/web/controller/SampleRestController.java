package com.learning.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.web.model.Task;
import com.learning.web.service.TaskService;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.27
 */
@RestController
public class SampleRestController {

	@Autowired
	private TaskService taskService;
	

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/all")
	public List<Task> allTasks() {
		return taskService.findAll();
	}

}
