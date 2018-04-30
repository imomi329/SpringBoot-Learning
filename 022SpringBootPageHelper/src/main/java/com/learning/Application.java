package com.learning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 這裡使用 @SpringBootApplication 指定是一個 Spring Boot 的應用程序。
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@SpringBootApplication // same as @Configuration, @EnableAutoConfiguration(禁用自動配置項目), @ComponentScan
@MapperScan(basePackages = { "com.learning.*" }) // 掃描該包下相應的 class ，主要是 MyBatis 持久化類
public class Application {

	/*  
	 * 在 main 方法進行啟動我們的應用程序
	 */
	public static void main(String[] args){
		// 啟動
		System.out.println("<<<<<  Spring Boot!!!  >>>>>");
		SpringApplication.run(Application.class,args);
	}
	
	// Hello World 示例位置 http://localhost:8080/hello

}
