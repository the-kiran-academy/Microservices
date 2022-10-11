package com.jbk.supplier.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.supplier.enitity.Supplier;

@Repository
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveSupplier(Supplier supplier) {
		Session session = null;
		Transaction transaction = null;
		boolean isAdded = false;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Supplier s = session.get(Supplier.class, supplier.getSupplierId());
			if (s==null) {
				session.save(supplier);
				transaction.commit();
				isAdded = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();

			}
		}

		return isAdded;
	}


	@Override
	public Supplier getSupplier(int supplierId) {
		Session session = null;
		Supplier supplier = null;
		try {
			session = sessionFactory.openSession();
			supplier = session.get(Supplier.class, supplierId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return supplier;
	}

}
