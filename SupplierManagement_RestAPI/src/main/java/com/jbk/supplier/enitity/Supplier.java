package com.jbk.supplier.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	
	@Id
	private int supplierId;
	private String supplierName;
	private String supplierCompany;
	private String supplierAddress;
	
	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Supplier(int supplierId, String supplierName, String supplierCompany, String supplierAddress) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierCompany = supplierCompany;
		this.supplierAddress = supplierAddress;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierCompany() {
		return supplierCompany;
	}

	public void setSupplierCompany(String supplierCompany) {
		this.supplierCompany = supplierCompany;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierCompany="
				+ supplierCompany + ", supplierAddress=" + supplierAddress + "]";
	}
	
	

}
