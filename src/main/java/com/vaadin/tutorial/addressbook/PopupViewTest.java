package com.vaadin.tutorial.addressbook;


import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("testvaadinproject")
public class PopupViewTest extends HorizontalLayout {

    public PopupViewTest() {

        setSpacing(true);

        Label content = new Label("Simple Label");
        
        content.setWidth("300px");
        content.setHeight("100px");

        PopupView popup = new PopupView("Static HTML content", content);
        popup.setHideOnMouseOut(false);
       
        addComponent(popup);


    }

}