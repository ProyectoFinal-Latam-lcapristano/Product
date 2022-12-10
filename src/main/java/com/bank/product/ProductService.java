package com.bank.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Product> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Product findUpdate(Product product) {
		return repository.save(product);
	}

	@Override
	public Product save(Product product) {
		return repository.save(product);
	}

	@Override
	public void delete(Product product) {
		repository.delete(product);		
	}

}
