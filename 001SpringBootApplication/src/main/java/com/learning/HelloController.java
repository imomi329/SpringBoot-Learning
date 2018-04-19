package com.learning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld案例
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@RestController // @Controller && @ResponseBody
public class HelloController {

	/**
	 * 這裡我們使用 @RequestMapping 建立請求映射：
	 * http://127.0.0.1:8080/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
	
}