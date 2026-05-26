package com.fintrack.dao;

import com.fintrack.model.Transaction;
import java.util.List;

/**
 * Data Access Object interface for Transaction
 */
public interface TransactionDAO {
    void insert(Transaction transaction);
    void update(Transaction transaction);
    void delete(int id);
    Transaction getById(int id);
    List<Transaction> getAll();
}
