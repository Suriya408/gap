package com.usk.ecommerce.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usk.ecommerce.dto.ApplicationResponseDto;
import com.usk.ecommerce.dto.ProductDto;
import com.usk.ecommerce.model.Product;
import com.usk.ecommerce.service.ProductService;

@RestController
public class ProductController {

	Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;

	@GetMapping("/search/name")
	public List<Product> searchByName(@RequestParam String keyword) {

		logger.info("ProductController   search/name");
		return productService.searchByName(keyword);
	}

	@GetMapping("/search/category")
	public List<Product> searchByCategory(@RequestParam String category) {

		logger.info("ProductController   search/category");
		return productService.searchByCategory(category);
	}

	@GetMapping("/search/price")
	public List<Product> searchByPriceRange(@RequestParam double min, @RequestParam double max) {

		logger.info("ProductController   /search/price");
		return productService.searchByPriceRange(min, max);
	}

	@PostMapping("/addProducts")
	public ApplicationResponseDto addProducts(@Valid @RequestBody ProductDto request) {
		logger.info("addProduct");
		return productService.addProducts(request);
	}

}
