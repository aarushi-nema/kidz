package application.kidz.servlet;

import application.kidz.servlet.base.AmrTwoColumnDBApplicationServlet;
import application.kidz.servlet.base.menu.AmrImageCardView;
import application.kidz.servlet.menu.AnalyticsLeftMenuView;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;


public class MyAreaAnalysisServlet extends AmrTwoColumnDBApplicationServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		
	@Override
	public BaseHTMLComponent getAddView(UIServletContext context) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public BaseHTMLComponent getModifyView(UIServletContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseHTMLComponent getListView(UIServletContext context) {
		// TODO Auto-generated method stub
		return new Div();

	}


	@Override
	public BaseHTMLComponent getDeleteView(UIServletContext context) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BaseHTMLComponent getView(UIServletContext context) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BaseHTMLComponent getWebLeftDisplay(UIServletContext context) {
		// TODO Auto-generated method stub
		Div div = new Div();
		AmrImageCardView view = new AmrImageCardView(context);
		view.buildUI();
		div.addChild(view.getView());
		AnalyticsLeftMenuView leftMenu = new AnalyticsLeftMenuView(context);
		leftMenu.buildUI();
		div.addChild(leftMenu.getView());
		return div;
	}

}
