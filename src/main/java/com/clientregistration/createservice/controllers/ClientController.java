package com.clientregistration.createservice.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clientregistration.createservice.adaptees.ClientsSalesforceAdaptee;
import com.clientregistration.createservice.adapters.ClientAdapter;
import com.clientregistration.createservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.createservice.entities.salesforce.ResponseSalesforce;

@RestController
public class ClientController {

	@PostMapping("/createClient")
	public ResponseSalesforce createClient(@RequestBody RequestSalesforce request) {
		ClientsSalesforceAdaptee clientSalesforceAdaptee = new ClientsSalesforceAdaptee();
		ClientAdapter clientAdapter = new ClientAdapter(clientSalesforceAdaptee);
		clientAdapter.createClient(request);
		return clientAdapter.createClientResponse();
	}
}