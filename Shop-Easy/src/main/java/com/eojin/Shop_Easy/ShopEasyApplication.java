package com.eojin.Shop_Easy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class) //로그인화면 방지
public class ShopEasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopEasyApplication.class, args);
	}
}
