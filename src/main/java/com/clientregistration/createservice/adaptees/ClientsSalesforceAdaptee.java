package com.clientregistration.createservice.adaptees;

import com.clientregistration.createservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.createservice.entities.salesforce.ResponseSalesforce;
import com.clientregistration.createservice.interfaces.IClientProviderAdaptee;
import com.clientregistration.createservice.utilities.RequestAPI;


public class ClientsSalesforceAdaptee implements IClientProviderAdaptee{

	public ClientsSalesforceAdaptee() {}
	
	@Override
	public ResponseSalesforce CreateClient(RequestSalesforce request) {
		// TODO Auto-generated method stub
		RequestAPI requestAPI = new RequestAPI();
		return requestAPI.enviarPeticiónPost(request);
	}

}
