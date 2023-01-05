package com.matdoring.matzido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@EnableAspectJAutoProxy
@EnableConfigurationProperties
@SpringBootApplication
public class MatzidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatzidoApplication.class, args);
	}

}
