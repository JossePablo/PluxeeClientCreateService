package com.clientregistration.createservice.interfaces;

import com.clientregistration.createservice.entities.salesforce.RequestSalesforce;
import com.clientregistration.createservice.entities.salesforce.ResponseSalesforce;

public interface IClientProviderAdaptee {

	ResponseSalesforce CreateClient(RequestSalesforce request);
}
