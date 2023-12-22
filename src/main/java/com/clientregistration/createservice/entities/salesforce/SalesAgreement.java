package com.clientregistration.createservice.entities.salesforce;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalesAgreement {

	private String productOfInterest;
    private String price;
    private String discountPercentage;
    private String finalPrice;
	public String getProductOfInterest() {
		return productOfInterest;
	}
	public void setProductOfInterest(String productOfInterest) {
		this.productOfInterest = productOfInterest;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public String getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}
    
}
