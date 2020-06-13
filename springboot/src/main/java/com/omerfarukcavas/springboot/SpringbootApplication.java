package com.omerfarukcavas.springboot;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.omerfarukcavas.webservice"})
@ComponentScan(basePackages = {"com.omerfarukcavas.pojo"})
public class SpringbootApplication {

	public static void main(String[] args){

		
		SpringApplication.run(SpringbootApplication.class, args);
	}


	
	 
}
