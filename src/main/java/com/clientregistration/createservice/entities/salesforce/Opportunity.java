package com.clientregistration.createservice.entities.salesforce;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Opportunity {

	private String productFamily;
	private String productOfInterest;
    private String closeDate;
    private String numberOfBeneficiaries;
    private String estimatedBV;
	public String getProductFamily() {
		return productFamily;
	}
	public void setProductFamily(String productFamily) {
		this.productFamily = productFamily;
	}
	public String getProductOfInterest() {
		return productOfInterest;
	}
	public void setProductOfInterest(String productOfInterest) {
		this.productOfInterest = productOfInterest;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getNumberOfBeneficiaries() {
		return numberOfBeneficiaries;
	}
	public void setNumberOfBeneficiaries(String numberOfBeneficiaries) {
		this.numberOfBeneficiaries = numberOfBeneficiaries;
	}
	public String getEstimatedBV() {
		return estimatedBV;
	}
	public void setEstimatedBV(String estimatedBV) {
		this.estimatedBV = estimatedBV;
	}
    
}
