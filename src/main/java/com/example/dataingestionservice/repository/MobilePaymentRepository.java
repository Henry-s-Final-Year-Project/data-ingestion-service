package com.example.dataingestionservice.repository;

import com.example.dataingestionservice.model.MobilePayment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MobilePaymentRepository extends MongoRepository<MobilePayment, String> {
}
