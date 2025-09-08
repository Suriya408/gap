
package com.usk.ecommerce.dto;

import java.time.LocalDateTime;

public class ProductDto {

	private String name;

	private String category;

	private String description;

	private double price;

	private String size;

	private int avaibaleCount;

	private boolean availability;

	private double carbonFootprint;

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getAvaibaleCount() {
		return avaibaleCount;
	}

	public void setAvaibaleCount(int avaibaleCount) {
		this.avaibaleCount = avaibaleCount;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public double getCarbonFootprint() {
		return carbonFootprint;
	}

	public void setCarbonFootprint(double carbonFootprint) {
		this.carbonFootprint = carbonFootprint;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
