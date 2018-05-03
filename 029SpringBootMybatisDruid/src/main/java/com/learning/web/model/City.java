package com.learning.web.model;

/**
 * 城市實體類
 * 
 * @author yuan
 */
public class City {

	/**
	 * 城市編號
	 */
	private Long id;

	/**
	 * 省份編號
	 */
	private Long provinceId;

	/**
	 * 城市名稱
	 */
	private String cityName;

	/**
	 * 描述
	 */
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
