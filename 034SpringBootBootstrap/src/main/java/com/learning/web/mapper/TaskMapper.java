package com.learning.web.mapper;

import java.util.List;

import com.learning.web.model.Task;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.27
 */
public interface TaskMapper {
	
	public List<Task> findAll();

	public Task findOne(int id);

	public void save(Task task);

	public void delete(int id);

}
