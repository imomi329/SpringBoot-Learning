package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 這裡使用 @SpringBootApplication 指定是一個 Spring Boot 的應用程序。
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@SpringBootApplication // same as @Configuration, @EnableAutoConfiguration(禁用自動配置項目), @ComponentScan
public class App {

	/*  
	 * 在 main 方法進行啟動我們的應用程序
	 */
	public static void main(String[] args) throws Exception {
		// 啟動
		System.out.println("<<<<<  Spring Boot!!!  >>>>>");
		SpringApplication.run(App.class, args);
		// 熱部署(關閉)
//		System.setProperty("spring.devtools.restart.enabled", "false");
		
		// 應用重啟頁面會刷新
		System.setProperty("spring.thymeleaf.cache", "false");
	}
}
