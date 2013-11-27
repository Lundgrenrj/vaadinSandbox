package com.vaadin.tutorial.addressbook;


import com.vaadin.annotations.Theme;
import com.vaadin.server.ClassResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import org.tepi.filtertable.FilterTable;

@SuppressWarnings("serial")
@Theme("testvaadinproject")
public class PopupViewTest extends HorizontalLayout {
	public static Table table;

    public PopupViewTest() {
    	Table table = new Table("This is my Table");

    	/* Define the names and data types of columns.
    	 * The "default value" parameter is meaningless here. */
    	table.addContainerProperty("First Name", String.class,  null);
    	table.addContainerProperty("Last Name",  String.class,  null);
    	table.addContainerProperty("Year",       Integer.class, null);
    	//table.addContainerProperty("Picture",    Image.class, null);

    	/* Add a few items in the table. */
    	Image image = new Image("Yes, logo:", new ClassResource("photo.jpg"));
    	
    	table.addItem(new Object[] {"Nicolaus","Copernicus",new Integer(1473)}, new Integer(1));
    	table.addItem(new Object[] {"Tycho",   "Brahe",     new Integer(1546)}, new Integer(2));
    	table.addItem(new Object[] {"Giordano","Bruno",     new Integer(1548)}, new Integer(3));
    	table.addItem(new Object[] {"Galileo", "Galilei",   new Integer(1564)}, new Integer(4));
    	table.addItem(new Object[] {"Johannes","Kepler",    new Integer(1571)}, new Integer(5));
    	table.addItem(new Object[] {"Isaac",   "Newton",    new Integer(1643)}, new Integer(6));
    	
    	
    	
    		
    	
    	
    	table.setColumnWidth("First Name", 100);
    	table.setColumnWidth("Last Name", 100);
    	table.setColumnWidth("Year", 75);
    	
        //setSpacing(true);

        Label content = new Label("Simplsd asdfas asdf asdfa sdfa sdfsdafsdf fasdfasdfas dfasdfasdfasdfas dfasdf asdfasdfasdfe Label");
      
        Integer width1 = (int)(image.getWidth());
        String hello = width1.toString();
        System.out.println(image.getWidth());
        
        table.setWidth("900px");
        table.setHeight("700px");

        PopupView popup = new PopupView("Static HTML content", table);
        popup.setHideOnMouseOut(false);
       
        addComponent(popup);


    }

}