package net.degiere;

import net.degiere.views.HelpView;
import net.degiere.views.LoginView;
import net.degiere.views.MainView;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.Navigator.ComponentContainerViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class NavigationExampleUI extends UI {

	public Navigator navigator;

	public static final String MAINVIEW = "main";
	public static final String HELPVIEW = "help";

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		layout.setSpacing(true);
		setContent(layout);
		ComponentContainerViewDisplay viewDisplay = new ComponentContainerViewDisplay(layout);
		navigator = new Navigator(UI.getCurrent(), viewDisplay);
		navigator.addView("", new LoginView());
		navigator.addView(MAINVIEW, new MainView());
		navigator.addView(HELPVIEW, new HelpView());
	}

}
