package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 這裡使用 @SpringBootApplication 指定是一個 Spring Boot 的應用程序。
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@SpringBootApplication // same as @Configuration, @EnableAutoConfiguration(禁用自動配置項目), @ComponentScan
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class}) // 如果您發現不需要的特定自動配置類正在應用，則可以使用exclude屬性@EnableAutoConfiguration來禁用它們
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
