package com.clientregistration.createservice.adapters;

import com.clientregistration.createservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.createservice.entities.salesforce.ResponseSalesforce;
import com.clientregistration.createservice.interfaces.IClientProviderAdaptee;
import com.clientregistration.createservice.interfaces.IClientTarget;

public class ClientAdapter implements IClientTarget{

	private IClientProviderAdaptee _clientAdaptee;
	private ResponseSalesforce responseSalesforce;
	
	public ClientAdapter(IClientProviderAdaptee adaptee) {
		this._clientAdaptee = adaptee;
	}
	
	@Override
	public void createClient(RequestSalesforce request) {
		this.responseSalesforce = this._clientAdaptee.CreateClient(request);
	}

	@Override
	public ResponseSalesforce createClientResponse() {
		return this.responseSalesforce;
	}


}
