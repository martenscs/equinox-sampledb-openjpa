package net.martenscs.osgi.example.repository;

import net.martenscs.osgi.example.domain.OrderEntity;
import net.martenscs.osgi.example.domain.api.Order;
import net.martenscs.osgi.example.domain.api.Repository;

public class OrderRepository extends GenericRepository<Order, Integer>
		implements Repository<Order, Integer> {

	public void init() {
	}

	@Override
	public String getDeleteNamedQuery() {
		return "deleteOrderById";
	}

	@Override
	public String getFindNamedQuery() {
		return "findOrderById";
	}

	@Override
	public String getFindAllNamedQuery() {
		return "findAllOrders";
	}

	@Override
	public Class<?> getEntityClass() {
		return OrderEntity.class;
	}

}
