package application.kidz.servlet;

import application.kidz.defined.helper.SightWordCategoryHelper;
import application.kidz.defined.helper.SightWordHelper;
import application.kidz.defined.resource.SightWord;
import application.kidz.defined.resource.SightWordCategory;
import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.*;


public class SightWordServlet extends AmrSingleColumnDBApplicationServlet {
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
		String _category = context.getParamValue("category");
		div.addAttribute("align","center");
		TABLE table = new TABLE("","default_table");
		SightWordCategory category = (SightWordCategory)SightWordCategoryHelper.getInstance().getById(_category);
		Expression e = new Expression(SightWordCategory.FIELD_ID, REL_OP.IN,category.getWords());
		BaseResource[] resources = SightWordHelper.getInstance().getByExpression(e, new String[]{"name"});
		TR tr = new TR();
		int index = 0;
		for(BaseResource r : resources) {
			SightWord word = (SightWord) r;
			TD td = new TD();
			td.addAttribute("align","center");
			td.addStyle("text-align","center");
			H2 h2 = new H2("");
			A a = new A();
			a.setText(word.getName());
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
		a.setHref("/sight_word_category?type="+category.getType());
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