package application.kidz.servlet;

import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import application.kidz.servlet.base.AmrTwoColumnDBApplicationServlet;
import application.kidz.servlet.base.menu.AmrImageCardView;
import application.kidz.servlet.menu.SuperAdminSetupLeftMenuView;
import com.lowagie.text.Table;
import platform.resource.user;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.*;


public class HomeServlet extends AmrSingleColumnDBApplicationServlet {
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
		Div div = new Div();
		div.addAttribute("align","center");
		TABLE table = new TABLE("","default_table");
		TR tr = new TR();

		TD td = new TD();
		td.addStyle("text-align","center");
		H2 h2 = new H2("");
		A a = new A();
		a.setHref("/word_family");
		a.setText("Word Families");
		h2.addChild(a);
		td.addChild(h2);
		tr.addChild(td);

		td = new TD();
		td.addStyle("text-align","center");
		h2 = new H2("");
		a = new A();
		a.setHref("/sight_word_category_type");
		a.setText("Sight Words");
		h2.addChild(a);
		td.addChild(h2);
		tr.addChild(td);

		table.addChild(tr);
		div.addChild(table);
		return div;

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


}
