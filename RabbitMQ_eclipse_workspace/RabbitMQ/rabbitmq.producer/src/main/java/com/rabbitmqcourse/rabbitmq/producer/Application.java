package com.rabbitmqcourse.rabbitmq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rabbitmqcourse.rabbitmq.producer.producer.HelloRabbitMQProducer;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private HelloRabbitMQProducer producer;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		producer.sendHello("Hello Awesome Shubham, No: "+Math.random());
	}

}
