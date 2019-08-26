package com.hujia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//针对所有的mybatis做一个扫描
@MapperScan(basePackages = "com.hujia.mapper")
@EnableScheduling
@EnableAsync
public class WebChatApplication {

	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(WebChatApplication.class, args);
	}

}
