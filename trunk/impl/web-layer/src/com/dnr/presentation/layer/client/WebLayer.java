package com.dnr.presentation.layer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WebLayer implements EntryPoint {

	private final ApplicationServletAsync applicationServlet = GWT
			.create(ApplicationServlet.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

	}
}
