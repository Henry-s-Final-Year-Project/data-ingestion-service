package com.example.dataingestionservice.repository;

import com.example.dataingestionservice.model.cardtransaction.CardTransaction;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardTransactionRepository extends MongoRepository<CardTransaction, ObjectId> {
}
