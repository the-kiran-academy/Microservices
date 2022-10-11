package com.jbk.supplier.service;

import com.jbk.supplier.enitity.Supplier;

public interface SupplierService {
	public boolean saveSupplier(Supplier supplier);
	public Supplier getSupplier(int supplierId);
	

}
