package com.rabbitmqcourse.rabbitmq.producer.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FixedRateProducer {

	@Autowired
	private RabbitTemplate rabbitMqFixedRateProducer;
	
	private int i=0;
	
	private static final Logger Log= LoggerFactory.getLogger(FixedRateProducer.class);
	
	@Scheduled(fixedRate = 500)//In millisecond
	private void sendMessage()
	{
		i++;
		Log.info("I is { "+i+" }");
		rabbitMqFixedRateProducer.convertAndSend("rabbitmq.fixedrate","Fixed Rate : "+ i );
	}
}
