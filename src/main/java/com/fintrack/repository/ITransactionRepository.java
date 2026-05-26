package com.fintrack.repository;

import com.fintrack.model.Transaction;
import java.util.List;

/**
 * Repository interface for Transaction persistence
 */
public interface ITransactionRepository {
    void save(Transaction transaction);
    void update(Transaction transaction);
    void delete(int id);
    Transaction findById(int id);
    List<Transaction> findAll();
}
