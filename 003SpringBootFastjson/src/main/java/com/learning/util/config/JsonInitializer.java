package com.learning.util.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Fast json 初始化 (第三方框架)
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.15
 */
@Configuration
public class JsonInitializer extends WebMvcConfigurerAdapter {

	/**
	 * Fast Json
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		/*
		 * 1. 需要先定義一個 convert 轉換消息的對象; 
		 * 2. 添加 fastJson 的配置訊息。比如：是否要格式化回傳 json數據;
		 * 3. 在 convert 中添加配置訊息; 
		 * 4. 將 convert 添加到 converters 當中;
		 */
		
		// 1. 需要先定義一個 convert 轉換消息的對象;
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		// 2. 添加 fastJson 的配置訊息。比如：是否要格式化回傳 json數據;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		// 处理中文乱码问题
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		fastConverter.setSupportedMediaTypes(fastMediaTypes);
		// 3. 在 convert 中添加配置訊息;
		fastConverter.setFastJsonConfig(fastJsonConfig);
		// 4. 將 convert 添加到 converters 當中;
		converters.add(fastConverter);
	}

}
