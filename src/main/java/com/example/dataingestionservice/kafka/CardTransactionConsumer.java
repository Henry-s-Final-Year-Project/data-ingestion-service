package com.example.dataingestionservice.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
//
//@Service
//public class CardTransactionConsumer {
//    private static final Logger logger = LoggerFactory.getLogger(CardTransactionConsumer.class);
//    @KafkaListener(topics = "card-raw-data-topic", groupId = "card-transaction-group")
//    public void consume(String message){
//        logger.info("Received card transaction details: {}", message);
//    }
//}
