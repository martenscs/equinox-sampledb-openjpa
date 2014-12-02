package net.martenscs.osgi.example.repository;

import net.martenscs.osgi.example.domain.CustomerEntity;
import net.martenscs.osgi.example.domain.api.Customer;
import net.martenscs.osgi.example.domain.api.Repository;


public class CustomerRepository extends GenericRepository<Customer, Integer>
		implements Repository<Customer, Integer> {

	public void init() {
	}

	@Override
	public String getDeleteNamedQuery() {
		return "deleteCustomerById";
	}

	@Override
	public String getFindNamedQuery() {
		return "findCustomerById";
	}

	@Override
	public String getFindAllNamedQuery() {
		return "findAllCustomers";
	}

	@Override
	public Class<?> getEntityClass() {
		return CustomerEntity.class;
	}

}
