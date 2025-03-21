package com.example.dataingestionservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MobilePaymentProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public MobilePaymentProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMobilePayment(String mobilePayment) {
        kafkaTemplate.send("mobile-payments-topic", mobilePayment);
    }
}
