package com.training.product;

public class Product {
	
	private int productId;
	private String productName;
	private int ratePerUnit;
	
	
	public Product(int productId, String productName, int ratePerUnit) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}


	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}


	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}


	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}


	/**
	 * @return the ratePerUnit
	 */
	public int getRatePerUnit() {
		
		return ratePerUnit;
	}


	/**
	 * @param ratePerUnit the ratePerUnit to set
	 */
	public void setRatePerUnit(int ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", ratePerUnit=" + ratePerUnit
				+ "]";
	}
	
	

}
