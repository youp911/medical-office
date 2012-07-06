package com.dnr.presentation.layer.client;

import java.io.Serializable;
import java.util.Map;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface ApplicationServletAsync {

	void sendRequest(Map<String, Serializable> requestParameters,
			Map<String, Serializable> responseParameters,
			AsyncCallback<Void> callback);
}
