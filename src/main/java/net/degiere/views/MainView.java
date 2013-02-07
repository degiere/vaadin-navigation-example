package net.degiere.views;

import net.degiere.ui.Menu;
import net.degiere.ui.TableExample;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainView extends VerticalLayout implements View {

	public MainView() {
		setSizeFull();
		setSpacing(true);
		addComponent(new Menu());
		addComponent(headingLabel());
		addComponent(new TableExample());
	}

	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Showing view: Main!");
	}
	
	private Label headingLabel() {
		return new Label("Main");
	}
	

}
