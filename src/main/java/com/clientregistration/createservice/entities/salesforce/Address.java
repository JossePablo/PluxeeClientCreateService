package com.clientregistration.createservice.entities.salesforce;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

	private String name;
	private String invoiceRole;
	private String deliveryRole;
	private String countryRegion;
	private String zipCode;
	private String street;
	private String streetNumber;
	private String buildingCompliment;
	private String county;
	private String state;
	private String city;
	private String bankAffiliationNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvoiceRole() {
		return invoiceRole;
	}
	public void setInvoiceRole(String invoiceRole) {
		this.invoiceRole = invoiceRole;
	}
	public String getDeliveryRole() {
		return deliveryRole;
	}
	public void setDeliveryRole(String deliveryRole) {
		this.deliveryRole = deliveryRole;
	}
	public String getCountryRegion() {
		return countryRegion;
	}
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getBuildingCompliment() {
		return buildingCompliment;
	}
	public void setBuildingCompliment(String buildingCompliment) {
		this.buildingCompliment = buildingCompliment;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBankAffiliationNumber() {
		return bankAffiliationNumber;
	}
	public void setBankAffiliationNumber(String bankAffiliationNumber) {
		this.bankAffiliationNumber = bankAffiliationNumber;
	}
	
}
