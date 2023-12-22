package com.clientregistration.createservice.entities.salesforce;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseSalesforce {

	@JsonProperty("Response")
	private Response response;
	@JsonProperty("Customer")
	private Customer customer;
	@JsonProperty("Opportunity")
	private Opportunity opportunity;
	@JsonProperty("SalesAgreement")
	private SalesAgreement salesAgreement;
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Opportunity getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(Opportunity opportunity) {
		this.opportunity = opportunity;
	}
	public SalesAgreement getSalesAgreement() {
		return salesAgreement;
	}
	public void setSalesAgreement(SalesAgreement salesAgreement) {
		this.salesAgreement = salesAgreement;
	}
	
}
