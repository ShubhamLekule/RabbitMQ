package com.rabbitmqcourse.rabbitmq.consumer.consumer;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class FixedRateMultipleConsumer {

		private static final Logger Log=LoggerFactory.getLogger(FixedRateMultipleConsumer.class);
		
		@RabbitListener(queues = "rabbitmq.fixedrate",concurrency = "3-7")
		public void listen(String message) throws InterruptedException {
			TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextLong(1000,2000));
			Log.info("{}: Consuming {} : "+Thread.currentThread().getName()+" { "+ message +" }");
		}
}
