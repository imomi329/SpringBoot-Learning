package com.learning.web.model;

import java.util.Date;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.27
 */
public class Task {

	private int id;
	private String name;
	private String description;
	private Date dateCreated;
	private boolean finshed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public boolean isFinshed() {
		return finshed;
	}

	public void setFinshed(boolean finshed) {
		this.finshed = finshed;
	}

}
