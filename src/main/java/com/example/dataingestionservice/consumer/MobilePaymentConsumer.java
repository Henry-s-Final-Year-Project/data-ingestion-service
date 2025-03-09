package com.example.dataingestionservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MobilePaymentConsumer {
    private static final Logger logger = LoggerFactory.getLogger(MobilePaymentConsumer.class);
    @KafkaListener(topics = "mobile-payments-topic", groupId = "mobile-payments-group")
    public void consume(String message) {
        logger.info("Received mobile payment details: {}", message);
    }
}
