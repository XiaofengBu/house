package com.xiaofeng.house.web;

import com.xiaofeng2.house.autoconfig.EnableHttpClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.xiaofeng.house.biz.mapper")
@ComponentScan("com.xiaofeng.house")
@EnableHttpClient
@EnableAsync
public class HouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseApplication.class, args);
	}

}
