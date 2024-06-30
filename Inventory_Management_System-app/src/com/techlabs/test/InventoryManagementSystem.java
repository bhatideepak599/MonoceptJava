package com.techlabs.test;

import java.util.List;
import java.util.Scanner;

import com.techlabs.custom_exception.FileHandler;
import com.techlabs.custom_exception.InsufficientStockException;
import com.techlabs.custom_exception.InvalidProductException;
import com.techlabs.model.IDGenerator;
import com.techlabs.model.Inventory;
import com.techlabs.model.Product;
import com.techlabs.model.Supplier;
import com.techlabs.model.Transaction;

public class InventoryManagementSystem {

	 private static Inventory inventory = new Inventory();

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	        
	        showMenu(scanner);
	    }

	    private static void showMenu(Scanner scanner) {
	       
	        int choice;
	        do {
	            System.out.println("Welcome to the Inventory Management System");
	            System.out.println("1. Product Management");
	            System.out.println("2. Supplier Management");
	            System.out.println("3. Transaction Management");
	            System.out.println("4. Save Data");
	            System.out.println("5. Load Data");
	            System.out.println("6. Generate Reports");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    productManagementMenu(scanner);
	                    break;
	                case 2:
	                    supplierManagementMenu(scanner);
	                    break;
	                case 3:
	                    transactionManagementMenu(scanner);
	                    break;
	                case 4:
	                    saveData();
	                    break;
	                case 5:
	                    loadData();
	                    break;
	                case 6:
	                    generateReports();
	                    break;
	                case 7:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 7);
	    }

	    private static void productManagementMenu(Scanner scanner) {
	        
	        int choice;
	        do {
	            System.out.println("Product Management");
	            System.out.println("1. Add Product");
	            System.out.println("2. Update Product");
	            System.out.println("3. Delete Product");
	            System.out.println("4. View Product Details");
	            System.out.println("5. View All Products");
	            System.out.println("6. Back to Main Menu");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addProduct(scanner);
	                    break;
	                case 2:
	                    updateProduct(scanner);
	                    break;
	                case 3:
	                    deleteProduct(scanner);
	                    break;
	                case 4:
	                    viewProductDetails(scanner);
	                    break;
	                case 5:
	                    viewAllProducts();
	                    break;
	                case 6:
	                    System.out.println("Returning to main menu...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 6);
	    }

	    private static void addProduct(Scanner scanner) {
	        
	        
	        
	        String productId = IDGenerator.generateID();
	        System.out.print("Enter product name: ");
	        String name = scanner.next();
	        System.out.print("Enter product description: ");
	        String description = scanner.next();
	        System.out.print("Enter product quantity: ");
	        int quantity = scanner.nextInt();
	        System.out.print("Enter product price: ");
	        double price = scanner.nextDouble();

	        Product product = new Product(productId, name, description, quantity, price);
	        inventory.addProduct(product);
	        System.out.println("Product added successfully.");
	    }

	    private static void updateProduct(Scanner scanner) {
	       
	        System.out.print("Enter product ID to update: ");
	        String productId = scanner.next();
	        Product existingProduct = inventory.getProduct(productId);
	        if (existingProduct == null) {
	            System.out.println("Product not found.");
	            return;
	        }

	        System.out.print("Enter new product name: ");
	        String name = scanner.next();
	        System.out.print("Enter new product description: ");
	        String description = scanner.next();
	        System.out.print("Enter new product quantity: ");
	        int quantity = scanner.nextInt();
	        System.out.print("Enter new product price: ");
	        double price = scanner.nextDouble();

	        Product updatedProduct = new Product(productId, name, description, quantity, price);
	        inventory.updateProduct(productId, updatedProduct);
	        System.out.println("Product updated successfully.");
	    }

	    private static void deleteProduct(Scanner scanner) {
	       
	        System.out.print("Enter product ID to delete: ");
	        String productId = scanner.next();
	        inventory.deleteProduct(productId);
	        System.out.println("Product deleted successfully.");
	    }

	    private static void viewProductDetails(Scanner scanner) {
	        
	        System.out.print("Enter product ID to view: ");
	        String productId = scanner.next();
	        Product product = inventory.getProduct(productId);
	        if (product != null) {
	            System.out.println(product);
	        } else {
	            System.out.println("Product not found.");
	        }
	    }

	    private static void viewAllProducts() {
	        List<Product> products = inventory.getAllProducts();
	        if (!products.isEmpty()) {
	            for (Product product : products) {
	                System.out.println(product);
	            }
	        } else {
	            System.out.println("No products available.");
	        }
	    }

	    private static void supplierManagementMenu(Scanner scanner) {
	       
	        int choice;
	        do {
	            System.out.println("Supplier Management");
	            System.out.println("1. Add Supplier");
	            System.out.println("2. Update Supplier");
	            System.out.println("3. Delete Supplier");
	            System.out.println("4. View Supplier Details");
	            System.out.println("5. View All Suppliers");
	            System.out.println("6. Back to Main Menu");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addSupplier(scanner);
	                    break;
	                case 2:
	                    updateSupplier(scanner);
	                    break;
	                case 3:
	                    deleteSupplier(scanner);
	                    break;
	                case 4:
	                    viewSupplierDetails(scanner);
	                    break;
	                case 5:
	                    viewAllSuppliers();
	                    break;
	                case 6:
	                    System.out.println("Returning to main menu...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 6);
	    }

	    private static void addSupplier(Scanner scanner) {
	       
	       
	        String supplierId =IDGenerator.generateID();
	        System.out.print("Enter supplier name: ");
	        String name = scanner.next();
	        System.out.print("Enter supplier contact information: ");
	        String contactInfo = scanner.next();

	        Supplier supplier = new Supplier(supplierId, name, contactInfo);
	        inventory.addSupplier(supplier);
	        System.out.println("Supplier added successfully.");
	    }

	    private static void updateSupplier(Scanner scanner) {
	       
	        System.out.print("Enter supplier ID to update: ");
	        String supplierId = scanner.nextLine();
	        Supplier existingSupplier = inventory.getSupplier(supplierId);
	        if (existingSupplier == null) {
	            System.out.println("Supplier not found.");
	            return;
	        }

	        System.out.print("Enter new supplier name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter new supplier contact information: ");
	        String contactInfo = scanner.nextLine();

	        Supplier updatedSupplier = new Supplier(supplierId, name, contactInfo);
	        inventory.updateSupplier(supplierId, updatedSupplier);
	        System.out.println("Supplier updated successfully.");
	    }

	    private static void deleteSupplier(Scanner scanner) {
	       
	        System.out.print("Enter supplier ID to delete: ");
	        String supplierId = scanner.nextLine();
	        inventory.deleteSupplier(supplierId);
	        System.out.println("Supplier deleted successfully.");
	    }

	    private static void viewSupplierDetails(Scanner scanner) {
	       
	        System.out.print("Enter supplier ID to view: ");
	        String supplierId = scanner.nextLine();
	        Supplier supplier = inventory.getSupplier(supplierId);
	        if (supplier != null) {
	            System.out.println(supplier);
	        } else {
	            System.out.println("Supplier not found.");
	        }
	    }

	    private static void viewAllSuppliers() {
	        List<Supplier> suppliers = inventory.getAllSuppliers();
	        if (!suppliers.isEmpty()) {
	            for (Supplier supplier : suppliers) {
	                System.out.println(supplier);
	            }
	        } else {
	            System.out.println("No suppliers available.");
	        }
	    }

	    private static void transactionManagementMenu(Scanner scanner) {
	        
	        int choice;
	        do {
	            System.out.println("Transaction Management");
	            System.out.println("1. Add Stock");
	            System.out.println("2. Remove Stock");
	            System.out.println("3. View Transaction History");
	            System.out.println("4. Back to Main Menu");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addStock(scanner);
	                    break;
	                case 2:
	                    removeStock(scanner);
	                    break;
	                case 3:
	                    viewTransactionHistory(scanner);
	                    break;
	                case 4:
	                    System.out.println("Returning to main menu...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);
	    }

	    private static void addStock(Scanner scanner) {
	       
	        System.out.print("Enter product ID to add stock: ");
	        String productId = scanner.nextLine();
	        System.out.print("Enter quantity to add: ");
	        int quantity = scanner.nextInt();

	        try {
	            inventory.addStock(productId, quantity);
	            System.out.println("Stock added successfully.");
	        } catch (InvalidProductException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    private static void removeStock(Scanner scanner) {
	       
	        System.out.print("Enter product ID to remove stock: ");
	        String productId = scanner.nextLine();
	        System.out.print("Enter quantity to remove: ");
	        int quantity = scanner.nextInt();

	        try {
	            inventory.removeStock(productId, quantity);
	            System.out.println("Stock removed successfully.");
	        } catch (InvalidProductException | InsufficientStockException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    private static void viewTransactionHistory(Scanner scanner) {
	       
	        System.out.print("Enter product ID to view transaction history: ");
	        String productId = scanner.next();
	        List<Transaction> transactions = inventory.getTransactionHistory(productId);
	        if (!transactions.isEmpty()) {
	            for (Transaction transaction : transactions) {
	                System.out.println(transaction);
	            }
	        } else {
	            System.out.println("No transactions found for the specified product.");
	        }
	    }

	    private static void saveData() {
	        try {
	            FileHandler.saveData(inventory);
	            System.out.println("Data saved successfully.");
	        } catch (Exception e) {
	            System.out.println("Error saving data: " + e.getMessage());
	        }
	    }

	    private static void loadData() {
	        try {
	            inventory = FileHandler.loadData();
	            System.out.println("Data loaded successfully.");
	        } catch (Exception e) {
	            System.out.println("Error loading data: " + e.getMessage());
	        }
	    }

	    private static void generateReports() {
	        int totalProducts = inventory.getAllProducts().size();
	        double totalStockValue = inventory.getAllProducts().stream().mapToDouble(p -> p.getQuantity() * p.getPrice()).sum();
	        System.out.println("Total number of products: " + totalProducts);
	        System.out.println("Total stock value: $" + totalStockValue);
	    }

	    private static void loadInitialData() {
	        // Load initial data from files (if any)
	    }
}
