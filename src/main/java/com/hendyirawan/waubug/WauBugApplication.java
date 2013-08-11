/**
 * 
 */
package com.hendyirawan.waubug;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * @author ceefour
 *
 */
public class WauBugApplication extends WebApplication {

	@Override
	protected void init() {
		super.init();
		mountPage("hel_lo", UnderscorePage.class);
	}
	
	/* (non-Javadoc)
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

}
