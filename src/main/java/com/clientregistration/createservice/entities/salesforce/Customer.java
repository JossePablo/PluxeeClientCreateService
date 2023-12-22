package com.clientregistration.createservice.entities.salesforce;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

	private String companyId;
	private String companyType;
	private String siteId;
	private String type;
	private String clientGroupId;
	private String clientId;
	private String rfc;
	private String clientName;
	private String taxRegime;
	private String numberOfEmployees;
	private String language;
	private String invoicePeriodDay;
	private String validityPeriod;
	private String operationType;
	private String paymentType;
	private String sttlementFrequency;
	private String identificationNumber;
	private List<Address> adresses;
	private List<Contact> contacts;
	private List<BankInfo> bankDetails;
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getClientGroupId() {
		return clientGroupId;
	}
	public void setClientGroupId(String clientGroupId) {
		this.clientGroupId = clientGroupId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getTaxRegime() {
		return taxRegime;
	}
	public void setTaxRegime(String taxRegime) {
		this.taxRegime = taxRegime;
	}
	public String getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(String numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getInvoicePeriodDay() {
		return invoicePeriodDay;
	}
	public void setInvoicePeriodDay(String invoicePeriodDay) {
		this.invoicePeriodDay = invoicePeriodDay;
	}
	public String getValidityPeriod() {
		return validityPeriod;
	}
	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getSttlementFrequency() {
		return sttlementFrequency;
	}
	public void setSttlementFrequency(String sttlementFrequency) {
		this.sttlementFrequency = sttlementFrequency;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public List<Address> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Address> adresses) {
		this.adresses = adresses;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public List<BankInfo> getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(List<BankInfo> bankDetails) {
		this.bankDetails = bankDetails;
	}
	
}
