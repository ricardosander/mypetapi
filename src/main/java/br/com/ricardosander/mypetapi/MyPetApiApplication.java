package br.com.ricardosander.mypetapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class MyPetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPetApiApplication.class, args);
	}
}
