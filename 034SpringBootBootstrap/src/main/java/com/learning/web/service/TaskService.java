package com.learning.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.web.mapper.TaskMapper;
import com.learning.web.model.Task;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.27
 */
@Service
public class TaskService {

	@Autowired
	private TaskMapper taskMapper;

	public List<Task> findAll() {
		return taskMapper.findAll();
	}

	public Task findTask(int id) {
		return taskMapper.findOne(id);
	}

	public void save(Task task) {
		taskMapper.save(task);
	}

	public void delete(int id) {
		taskMapper.delete(id);
	}

}
