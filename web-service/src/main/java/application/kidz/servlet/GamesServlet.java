package application.kidz.servlet;

import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.*;


public class GamesServlet extends AmrSingleColumnDBApplicationServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected boolean isLoginRequired() {
		return false;
	}

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
		H2 h2;
		A a;
		div.addAttribute("align","center");
		TABLE table = new TABLE("","default_table");
		TR tr = new TR();

		TD td = new TD();
		td.addStyle("text-align","center");
		h2 = new H2("");
		a = new A();
		a.setHref("/word_family_word_recognize");
		a.setText("Word Recognize");
		h2.addChild(a);
		td.addChild(h2);
		tr.addChild(td);

		td = new TD();
		td.addStyle("text-align","center");
		h2 = new H2("");
		a = new A();
		a.setHref("/word_family_missing_character");
		a.setText("Family Missing Character");

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
