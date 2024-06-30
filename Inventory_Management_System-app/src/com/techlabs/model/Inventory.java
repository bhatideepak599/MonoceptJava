package com.techlabs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.techlabs.custom_exception.InsufficientStockException;
import com.techlabs.custom_exception.InvalidProductException;
import com.techlabs.interfaces.ProductManagement;
import com.techlabs.interfaces.SupplierManagement;
import com.techlabs.interfaces.TransactionManagement;

public class Inventory implements ProductManagement, SupplierManagement, TransactionManagement {
	private Map<String, Product> products = new HashMap<>();
    private Map<String, Supplier> suppliers = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    @Override
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    @Override
    public void updateProduct(String productId, Product updatedProduct) {
        products.put(productId, updatedProduct);
    }

    @Override
    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    @Override
    public Product getProduct(String productId) {
        return products.get(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    // Supplier management methods...

    @Override
    public void addSupplier(Supplier supplier) {
        suppliers.put(supplier.getSupplierId(), supplier);
    }

    @Override
    public void updateSupplier(String supplierId, Supplier updatedSupplier) {
        suppliers.put(supplierId, updatedSupplier);
    }

    @Override
    public void deleteSupplier(String supplierId) {
        suppliers.remove(supplierId);
    }

    @Override
    public Supplier getSupplier(String supplierId) {
        return suppliers.get(supplierId);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return new ArrayList<>(suppliers.values());
    }

    // Transaction management methods...

    @Override
    public void addStock(String productId, int quantity) throws InvalidProductException {
        lock.lock();
        try {
            Product product = products.get(productId);
            if (product == null) {
                throw new InvalidProductException("Product not found: " + productId);
            }
            product.setQuantity(product.getQuantity() + quantity);
            transactions.add(new Transaction(UUID.randomUUID().toString(), productId, "add", quantity, new Date()));
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void removeStock(String productId, int quantity) throws InsufficientStockException, InvalidProductException {
        lock.lock();
        try {
            Product product = products.get(productId);
            if (product == null) {
                throw new InvalidProductException("Product not found: " + productId);
            }
            if (product.getQuantity() < quantity) {
                throw new InsufficientStockException("Insufficient stock for product: " + productId);
            }
            product.setQuantity(product.getQuantity() - quantity);
            transactions.add(new Transaction(UUID.randomUUID().toString(), productId, "remove", quantity, new Date()));
        } finally {
            lock.unlock();
        }
    }

    @Override
    public List<Transaction> getTransactionHistory(String productId) {
        List<Transaction> history = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getProductId().equals(productId)) {
                history.add(transaction);
            }
        }
        return history;
    }
    @Override
    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }
    @Override
	
    public void addTransaction(Transaction transaction) {
    	        transactions.add(transaction);
    	    }
		
	
}

