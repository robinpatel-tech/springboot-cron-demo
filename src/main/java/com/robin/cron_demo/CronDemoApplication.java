package com.robin.cron_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronDemoApplication.class, args);
	}

}
