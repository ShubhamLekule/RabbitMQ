package com.rabbitmqcourse.rabbitmq.consumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class FixedRateConsumer {

		private static final Logger Log=LoggerFactory.getLogger(FixedRateConsumer.class);
		
		@RabbitListener(queues = "rabbitmq.fixedrate")
		public void listen(String message) {
			Log.info("Fixed Rate : { "+message+" }");
		}
}
