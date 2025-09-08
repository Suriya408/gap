package com.usk.ecommerce.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.usk.ecommerce.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	List<Product> findByNameContainingIgnoreCase(String keyword);

	List<Product> findByCategoryContainingIgnoreCase(String category);

	List<Product> findByPriceBetween(double min, double max);

	List<Product> findById(long productId);

}
