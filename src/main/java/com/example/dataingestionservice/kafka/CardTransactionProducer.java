package com.example.dataingestionservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CardTransactionProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public CardTransactionProducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendCardTransaction(String cardTransaction){
        kafkaTemplate.send("card-raw-data-topic", cardTransaction);
    }
 }
