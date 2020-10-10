package application.kidz.servlet;

import application.kidz.defined.helper.WordFamilyHelper;
import application.kidz.defined.resource.WordFamily;
import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import application.kidz.servlet.base.AmrTwoColumnDBApplicationServlet;
import application.kidz.servlet.base.menu.AmrImageCardView;
import application.kidz.servlet.menu.SuperAdminSetupLeftMenuView;
import platform.resource.BaseResource;
import platform.resource.user;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.*;


public class WordFamilyServlet extends AmrSingleColumnDBApplicationServlet {
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
		div.addAttribute("align","center");
		TABLE table = new TABLE("","default_table");
		BaseResource[] resources = WordFamilyHelper.getInstance().getAll(new String[]{"name"});
		TR tr = new TR();
		int index = 0;
		for(BaseResource r : resources) {
			WordFamily family = (WordFamily) r;
			TD td = new TD();
			td.addAttribute("align","center");
			A a = new A();
			a.addStyle("font-size","72px");
			a.setHref("/word_family_word?family="+family.getId());
			a.setText(family.getName());
			td.addChild(a);
			tr.addChild(td);
			index++;
			if (index == 4) {
				index = 0;
				table.addChild(tr);
				tr = new TR();
			}
		}
		if (index > 0) {
			table.addChild(tr);
		}

		div.addChild(table);

		div.addChild(new BR());
		div.addChild(new BR());
		div.addChild(new BR());
		div.addChild(new BR());

		A a = new A();
		a.addStyle("font-size","24px");
		a.setHref("/");
		a.setText("Go Back");
		div.addChild(a);


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
