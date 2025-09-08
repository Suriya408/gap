package com.usk.ecommerce.service;

import java.util.List;

import com.usk.ecommerce.dto.ApplicationResponseDto;
import com.usk.ecommerce.dto.ProductDto;
import com.usk.ecommerce.model.Product;

public interface ProductService {

	List<Product> searchByName(String keyword);

	List<Product> searchByCategory(String category);

	List<Product> searchByPriceRange(double min, double max);

	ApplicationResponseDto addProducts(ProductDto request);

}
