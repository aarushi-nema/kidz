package application.kidz.servlet;

import application.kidz.defined.helper.SightWordCategoryHelper;
import application.kidz.defined.helper.WordFamilyWordHelper;
import application.kidz.defined.resource.SightWordCategory;
import application.kidz.defined.resource.WordFamilyWord;
import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.*;


public class SightWordCategoryServlet extends AmrSingleColumnDBApplicationServlet {
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
		String type = context.getParamValue("type");
		div.addAttribute("align","center");
		TABLE table = new TABLE("","default_table");
		Expression e = new Expression(SightWordCategory.FIELD_TYPE, REL_OP.EQ,type);
		BaseResource[] resources = SightWordCategoryHelper.getInstance().getByExpression(e, new String[]{"name"});
		TR tr = new TR();
		int index = 0;
		for(BaseResource r : resources) {
			SightWordCategory category = (SightWordCategory) r;
			TD td = new TD();
			td.addAttribute("align","center");
			td.addStyle("text-align","center");
			H2 h2 = new H2("");
			A a = new A();
			a.setHref("/sight_word?category="+category.getId());
			a.setText(category.getName());
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
		a.setHref("/sight_word_category_type");
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
