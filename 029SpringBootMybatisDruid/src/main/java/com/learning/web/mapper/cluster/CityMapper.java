package com.learning.web.mapper.cluster;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.learning.web.model.City;

/**
 * 城市 DAO 接口類
 * 
 * @author yuan
 */
@Mapper
public interface CityMapper {

	/**
	 * 根据城市名称，查询城市信息
	 *
	 * @param cityName
	 *            城市名
	 */
	// @Select("SELECT * FROM city")
	// // 返回 Map 结果集
	// @Results({
	// @Result(property = "id", column = "id"),
	// @Result(property = "provinceId", column = "province_id"),
	// @Result(property = "cityName", column = "city_name"),
	// @Result(property = "description", column = "description"),
	// })
	City findByName(@Param("cityName") String cityName);

}
