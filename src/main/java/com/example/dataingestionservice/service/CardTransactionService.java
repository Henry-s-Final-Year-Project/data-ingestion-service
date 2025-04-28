package com.example.dataingestionservice.service;

import com.example.dataingestionservice.kafka.CardTransactionProducer;
import com.example.dataingestionservice.model.cardtransaction.CardTransaction;
import com.example.dataingestionservice.repository.CardTransactionRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Random;

@Service
public class CardTransactionService {

    private final CardTransactionRepository repository;
    private final CardTransactionProducer producer;

    public CardTransactionService(CardTransactionRepository repository, CardTransactionProducer producer) {
        this.repository = repository;
        this.producer = producer;
    }

    @Scheduled(fixedRate = 10000)
    public void fetchAndSendData() {
        List<CardTransaction> cardTransactions = repository.findAll();

        if (!cardTransactions.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(cardTransactions.size());  // random index
            CardTransaction ct = cardTransactions.get(randomIndex);    // pick random one
            producer.sendCardTransaction(ct);
            System.out.println();
            System.out.println("Sent: " + ct);
            System.out.println();
        }
    }
}
