package com.techlabs.interfaces;

import java.util.List;

import com.techlabs.custom_exception.InsufficientStockException;
import com.techlabs.custom_exception.InvalidProductException;
import com.techlabs.model.Transaction;

public interface TransactionManagement {
	void addTransaction(Transaction transaction);
	void addStock(String productId, int quantity) throws InvalidProductException;
    void removeStock(String productId, int quantity) throws InsufficientStockException, InvalidProductException;
    List<Transaction> getTransactionHistory(String productId);
    public List<Transaction> getAllTransactions();
}
