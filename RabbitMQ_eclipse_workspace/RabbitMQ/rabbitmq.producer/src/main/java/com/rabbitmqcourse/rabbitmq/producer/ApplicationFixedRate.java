package com.rabbitmqcourse.rabbitmq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.rabbitmqcourse.rabbitmq.producer.producer.HelloRabbitMQProducer;

@SpringBootApplication
@EnableScheduling
public class ApplicationFixedRate {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationFixedRate.class, args);
	}

}
