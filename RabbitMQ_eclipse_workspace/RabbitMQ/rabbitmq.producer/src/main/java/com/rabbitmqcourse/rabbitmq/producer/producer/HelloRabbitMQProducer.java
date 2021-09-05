package com.rabbitmqcourse.rabbitmq.producer.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloRabbitMQProducer {

	@Autowired
	private RabbitTemplate helloRabbitMQTemplate;
	
	public void sendHello(String str) {
		helloRabbitMQTemplate.convertAndSend("RabbitMQ.Hello",str);
	}
	
}
