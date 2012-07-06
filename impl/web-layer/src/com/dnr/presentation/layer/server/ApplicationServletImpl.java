package com.dnr.presentation.layer.server;

import java.io.Serializable;
import java.util.Map;

import com.dnr.presentation.layer.client.ApplicationServlet;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ApplicationServletImpl extends RemoteServiceServlet implements
		ApplicationServlet {

	/**
	 * Send Request to the server side
	 */
	@Override
	public void sendRequest(Map<String, Serializable> requestParameters,
			Map<String, Serializable> responseParameters) {
		// TODO Auto-generated method stub

	}

}
