package com.learning;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注意：
 * 開發過程建議關閉緩存：application.properties -> spring.freemarker.cache=false
 * -----------------------
 * 3. 支持使用多個模板引擎，比如：thymeleaf 和 freemarker 可以並存
 * 
 * @author yuan
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {
	
	/**
	 * 映射地址是：/templates/helloFtl
	 * @return
	 */
	@RequestMapping("/helloFtl")
	public String helloFtl(Map<String, Object> map) {
		map.put("name", "Andy");
		return "helloFtl";
	}

}
