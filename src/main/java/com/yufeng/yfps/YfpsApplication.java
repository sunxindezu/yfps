package com.yufeng.yfps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.yufeng.yfps.mapper")
@ComponentScan(basePackages = "com.yufeng.yfps.*")
public class YfpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(YfpsApplication.class, args);
	}

}

