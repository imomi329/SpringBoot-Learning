package com.learning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 這裡使用 @RestController (等同於 @Controller 和 @ResponseBody)
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@RestController
public class HelloController {

	/**
	 * 這裡使用 @RequestMapping 建立請求映射 http://127.0.0.1:8080/hello
	 * 
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "Hello world!!!!!";
	}

	@RequestMapping("/hello2")
	public String hello2() {
		return "66666";
	}

}