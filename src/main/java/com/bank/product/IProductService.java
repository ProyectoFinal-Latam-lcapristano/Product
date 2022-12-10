package com.bank.product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
	List<Product> findAll();

	Optional<Product> findById(String id);

	Product findUpdate(Product product);

	Product save(Product product);

	void delete(Product product);
}
