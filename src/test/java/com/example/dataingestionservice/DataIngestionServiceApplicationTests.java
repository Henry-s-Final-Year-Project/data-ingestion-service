package com.example.dataingestionservice;

import com.example.dataingestionservice.model.cardtransaction.CardTransaction;
import com.example.dataingestionservice.repository.CardTransactionRepository;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DataIngestionServiceApplicationTests {
    @Autowired
    private CardTransactionRepository repository;
    @Test
    void contextLoads() {
    }

    @Test
    void testGeoFraudTransactionDB(){
        CardTransaction transaction = repository.findById(new ObjectId("67e052d58cf1967c909c31b5")).orElse(null);
        System.out.println(transaction);
    }

}
