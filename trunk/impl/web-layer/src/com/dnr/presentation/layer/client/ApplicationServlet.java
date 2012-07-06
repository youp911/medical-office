package com.dnr.presentation.layer.client;

import java.io.Serializable;
import java.util.Map;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("applicationServlet")
public interface ApplicationServlet extends RemoteService {

	void sendRequest(Map<String, Serializable> requestParameters,
			Map<String, Serializable> responseParameters);
}
