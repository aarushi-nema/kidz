package application.kidz.servlet;

import application.kidz.defined.helper.SightWordCategoryTypeHelper;
import application.kidz.defined.helper.WordFamilyHelper;
import application.kidz.defined.resource.SightWordCategoryType;
import application.kidz.defined.resource.WordFamily;
import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.*;


public class SightWordCategoryTypeServlet extends AmrSingleColumnDBApplicationServlet {
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
		BaseResource[] resources = SightWordCategoryTypeHelper.getInstance().getAll(new String[]{"name"});
		TR tr = new TR();
		int index = 0;
		for(BaseResource r : resources) {
			SightWordCategoryType type = (SightWordCategoryType) r;
			TD td = new TD();
			td.addStyle("text-align","center");
			H2 h2 = new H2("");
			A a = new A();
			a.setHref("/sight_word_category?type="+type.getId());
			a.setText(type.getName());
			h2.addChild(a);
			td.addChild(h2);
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
