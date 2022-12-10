package com.bank.product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {
	@Autowired
	private Environment env;
	
	@Autowired
	private IProductService service;
	
	@GetMapping("/list")
	public List<Product> findAll(){
		return service.findAll().stream().map(p-> {
			p.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			return p;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/{id}")
	public Optional<Product> findById(@PathVariable String id){
		return service.findById(id);
	}
	
	@PostMapping("/save")
	public Product save(Product product) {
		return service.save(product);
	}
}
