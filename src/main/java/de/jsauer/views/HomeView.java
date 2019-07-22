package de.jsauer.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * Basic view. The empty route name makes it the root view.
 *
 * @author Julian Sauer
 * @since 1.0
 */
@Route(HomeView.VIEW_NAME)
public class HomeView extends Div {
    public static final String VIEW_NAME = "";

    public HomeView() {
        setText("Hello World!");
    }
}
