package com.fintrack.service;

import com.fintrack.model.Transaction;
import java.util.List;

/**
 * Service class for Transaction business logic
 */
public class TransactionService {
    
    public double calculateBalance(List<Transaction> transactions) {
        double balance = 0;
        for (Transaction transaction : transactions) {
            if ("income".equalsIgnoreCase(transaction.getType())) {
                balance += transaction.getAmount();
            } else if ("expense".equalsIgnoreCase(transaction.getType())) {
                balance -= transaction.getAmount();
            }
        }
        return balance;
    }

    public double calculateExpenses(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> "expense".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public double calculateIncome(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> "income".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }
}
