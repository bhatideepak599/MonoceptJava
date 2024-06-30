package com.techlabs.interfaces;

import java.util.List;

import com.techlabs.model.Product;

public interface ProductManagement {
	void addProduct(Product product);
    void updateProduct(String productId, Product updatedProduct);
    void deleteProduct(String productId);
    Product getProduct(String productId);
    List<Product> getAllProducts();
}
