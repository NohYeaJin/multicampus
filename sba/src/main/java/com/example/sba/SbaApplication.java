package com.example.sba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value= {"com.example.sba.mapper"})
@SpringBootApplication
public class SbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaApplication.class, args);
	}

}
