package application.kidz.servlet;

import application.kidz.defined.helper.SentenceCategoryHelper;
import application.kidz.defined.helper.SentenceHelper;
import application.kidz.defined.helper.SightWordCategoryHelper;
import application.kidz.defined.helper.SightWordHelper;
import application.kidz.defined.resource.Sentence;
import application.kidz.defined.resource.SentenceCategory;
import application.kidz.defined.resource.SightWord;
import application.kidz.defined.resource.SightWordCategory;
import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.*;


public class SentenceServlet extends AmrSingleColumnDBApplicationServlet {
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
		String _category = context.getParamValue("category");
		div.addAttribute("align","center");
		TABLE table = new TABLE("","default_table");
		SentenceCategory category = (SentenceCategory) SentenceCategoryHelper.getInstance().getById(_category);
		BaseResource[] resources;
		if ("all".equalsIgnoreCase(_category)) {
			resources = SentenceHelper.getInstance().getAll(new String[]{"name"});
		} else {
			Expression e = new Expression(SightWordCategory.FIELD_ID, REL_OP.IN, category.getSentences());
			resources = SentenceHelper.getInstance().getByExpression(e, new String[]{"name"});
		}
		TR tr = new TR();
		int index = 0;
		for(BaseResource r : resources) {
			Sentence sentence = (Sentence) r;
			TD td = new TD();
			td.addAttribute("align","center");
			td.addStyle("text-align","center");
			H2 h2 = new H2("");
			A a = new A();
			a.setText(sentence.getName());
			h2.addChild(a);
			td.addChild(h2);
			tr.addChild(td);
			index++;
			if (index == 2) {
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
		a.setHref("/sentence_category?type="+category.getType());
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
