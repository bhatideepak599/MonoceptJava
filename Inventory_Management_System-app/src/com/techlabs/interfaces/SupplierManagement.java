package com.techlabs.interfaces;

import java.util.List;

import com.techlabs.model.Supplier;

public interface SupplierManagement {
	 	void addSupplier(Supplier supplier);
	    void updateSupplier(String supplierId, Supplier updatedSupplier);
	    void deleteSupplier(String supplierId);
	    Supplier getSupplier(String supplierId);
	    List<Supplier> getAllSuppliers();
}
