package com.learning.demoResult.bean;

import java.sql.Date;

/**
 * 實體測試類
 * 
 * @author yuan
 *
 */
public class DemoNew {
	private int id;
	private String name;
	private String email;
	private Date updateTime; // 修改時間

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
