package com.example.dataingestionservice.kafka;

import com.example.dataingestionservice.model.cardtransaction.CardTransaction;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CardTransactionProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    @Autowired
    public CardTransactionProducer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper){
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendCardTransaction(CardTransaction ct){
        try{
            String json = objectMapper.writeValueAsString(ct);
            kafkaTemplate.send("card-raw-data-topic", json);
        }
        catch(JsonProcessingException e){
            System.out.println("Json Failure " + e.getMessage());
        }

    }
 }
