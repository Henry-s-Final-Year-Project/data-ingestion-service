package com.example.dataingestionservice.service;

import com.example.dataingestionservice.model.mobilepayment.MobilePayment;
import com.example.dataingestionservice.kafka.MobilePaymentProducer;
import com.example.dataingestionservice.repository.MobilePaymentRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobilePaymentService {

    private final MobilePaymentRepository repository;
    private final MobilePaymentProducer producer;

    public MobilePaymentService(MobilePaymentRepository repository, MobilePaymentProducer producer) {
        this.repository = repository;
        this.producer = producer;
    }
//
//    @Scheduled(fixedRate = 15000)
//    public void fetchAndSendData() {
//        List<MobilePayment> payments = repository.findAll();
//
//        if (!payments.isEmpty()) {
//            MobilePayment payment = payments.get(0);
////            producer.sendMobilePayment(payment.toString());
//            System.out.println();
//            System.out.println("Sent: " + payment);
//            System.out.println();
//
//        }
//    }
}
