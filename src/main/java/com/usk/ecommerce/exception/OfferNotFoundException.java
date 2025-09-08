package com.usk.ecommerce.exception;

public class OfferNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public OfferNotFoundException(String code) {
		super("Offer code not found: " + code);
	}
}
