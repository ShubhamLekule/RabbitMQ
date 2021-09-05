package com.rabbitmqcourse.rabbitmq.consumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HelloRabbitMQConsumer {

	@RabbitListener(queues= "RabbitMQ.Hello")
	public void listen(String msg) {
		System.out.println("\n Listened Message is :"+msg);
	}
}
