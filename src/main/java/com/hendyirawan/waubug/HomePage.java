package com.hendyirawan.waubug;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage {

	public HomePage() {
		super();
		add(new BookmarkablePageLink<UnderscorePage>("underscore", UnderscorePage.class));
	}
	
}
