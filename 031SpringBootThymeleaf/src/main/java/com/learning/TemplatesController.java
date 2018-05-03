package com.learning;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注意：
 * 開發過程建議關閉緩存：application.properties -> spring.thymeleaf.cache=false
 * -----------------------
 * 1. 在 Thymeleaf 模板文件中，標籤是需要閉合的(before 3.0)
 * 2. thymeleaf 3.0+ 是可以不強制閉合的
 * 
 * 3. 支持使用多個模板引擎，比如：thymeleaf 和 freemarker 可以並存
 * 
 * @author yuan
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {
	
	/**
	 * 映射地址是：/templates/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(Map<String, Object> map) {
		map.put("name", "Andy");
		return "hello";
	}
	
	/**
	 * 可映射所有 /templates/XXXXX.html
	 * @param html
	 * @return
	 * 
	 * sample : http://localhost:8080/templates/Html?html=hello
	 */
	@RequestMapping("/Html")
	public String htmlTransFrom(String html) {
		return html;
	}
	
	@GetMapping("/")
    public String home() {
        return "index";
    }

}
