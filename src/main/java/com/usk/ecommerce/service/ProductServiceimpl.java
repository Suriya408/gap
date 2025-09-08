package com.usk.ecommerce.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usk.ecommerce.dto.ApplicationResponseDto;
import com.usk.ecommerce.dto.ProductDto;
import com.usk.ecommerce.model.Product;
import com.usk.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceimpl implements ProductService {

	Logger logger = LoggerFactory.getLogger(ProductServiceimpl.class);

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> searchByName(String keyword) {
		logger.info("ProductServiceimpl searchByname");
		return productRepository.findByNameContainingIgnoreCase(keyword);
	}

	@Override
	public List<Product> searchByCategory(String category) {
		logger.info("ProductServiceimpl searchByCategory");
		return productRepository.findByCategoryContainingIgnoreCase(category);
	}

	@Override
	public List<Product> searchByPriceRange(double min, double max) {
		logger.info("ProductServiceimpl searchByPriceRange");
		return productRepository.findByPriceBetween(min, max);
	}

	@Override
	public ApplicationResponseDto addProducts(ProductDto request) {
		Product product = new Product();
		BeanUtils.copyProperties(request, product);
		ApplicationResponseDto response = new ApplicationResponseDto();
		productRepository.save(product);
		response.setStatusCode(200);
		response.setMessage("Product Saved Successfully");
		response.setData(product);
		return response;

	}
}
