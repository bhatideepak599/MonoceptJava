package com.techlabs.custom_exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.techlabs.model.Inventory;
import com.techlabs.model.Product;
import com.techlabs.model.Supplier;
import com.techlabs.model.Transaction;

public class FileHandler {
	 private static final String PRODUCT_FILE = "products.txt";
	    private static final String SUPPLIER_FILE = "suppliers.txt";
	    private static final String TRANSACTION_FILE = "transactions.txt";

	    public static void saveData(Inventory inventory) throws IOException {
	        saveProducts(inventory.getAllProducts());
	        saveSuppliers(inventory.getAllSuppliers());
	        saveTransactions(inventory.getAllTransactions());
	    }

	    private static void saveProducts(List<Product> products) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PRODUCT_FILE))) {
	            for (Product product : products) {
	                writer.write(product.toFileFormat());
	                writer.newLine();
	            }
	        }
	    }

	    private static void saveSuppliers(List<Supplier> suppliers) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SUPPLIER_FILE))) {
	            for (Supplier supplier : suppliers) {
	                writer.write(supplier.toFileFormat());
	                writer.newLine();
	            }
	        }
	    }

	    private static void saveTransactions(List<Transaction> transactions) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TRANSACTION_FILE))) {
	            for (Transaction transaction : transactions) {
	                writer.write(transaction.toFileFormat());
	                writer.newLine();
	            }
	        }
	    }

	    public static Inventory loadData() throws IOException {
	        Inventory inventory = new Inventory();
	        loadProducts(inventory);
	        loadSuppliers(inventory);
	        loadTransactions(inventory);
	        return inventory;
	    }

	    private static void loadProducts(Inventory inventory) throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(PRODUCT_FILE))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                Product product = Product.fromFileFormat(line);
	                inventory.addProduct(product);
	            }
	        }
	    }

	    private static void loadSuppliers(Inventory inventory) throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(SUPPLIER_FILE))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                Supplier supplier = Supplier.fromFileFormat(line);
	                inventory.addSupplier(supplier);
	            }
	        }
	    }

	    private static void loadTransactions(Inventory inventory) throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(TRANSACTION_FILE))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                Transaction transaction = Transaction.fromFileFormat(line);
	                inventory.addTransaction(transaction);
	            }
	        }
	    }
}
