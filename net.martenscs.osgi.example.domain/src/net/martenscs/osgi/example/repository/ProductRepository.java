package net.martenscs.osgi.example.repository;

import net.martenscs.osgi.example.domain.ProductEntity;
import net.martenscs.osgi.example.domain.api.Product;
import net.martenscs.osgi.example.domain.api.Repository;

public class ProductRepository extends GenericRepository<Product, String>
		implements Repository<Product, String> {

	public void init() {
		System.out.println();
	}

	@Override
	public String getDeleteNamedQuery() {
		return "deleteProductById";
	}

	@Override
	public String getFindNamedQuery() {
		return "findProductById";
	}

	@Override
	public String getFindAllNamedQuery() {
		return "findAllProducts";
	}

	@Override
	public Class<?> getEntityClass() {
		return ProductEntity.class;
	}

}
