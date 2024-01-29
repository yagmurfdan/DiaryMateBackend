package com.yf.diarymate;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DiarymateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiarymateApplication.class, args);
	}
	
	@Bean
	public ModelMapper mapper(){
		return new ModelMapper();
	}

}
