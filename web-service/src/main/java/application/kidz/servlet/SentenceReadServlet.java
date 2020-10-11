package application.kidz.servlet;

import application.kidz.defined.helper.SentenceHelper;
import application.kidz.defined.helper.SightWordHelper;
import application.kidz.defined.resource.Sentence;
import application.kidz.defined.resource.SightWord;
import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.*;

import java.util.Date;


public class SentenceReadServlet extends AmrSingleColumnDBApplicationServlet {
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
		BaseResource[] resources = SentenceHelper.getInstance().getAll();
		int index = (int)new Date().getTime()%resources.length;
		Sentence sentence = (Sentence) resources[index];
		Div wordDiv = new Div();
		div.addChild(new BR());
		div.addChild(new BR());
		div.addChild(new BR());
		div.addChild(new BR());
		wordDiv.addAttribute("align", "center");
		wordDiv.addAttribute("style","font-size: 200px;");
		wordDiv.addChild(new TEXT(sentence.getName()));
		div.addChild(wordDiv);
		div.addChild(new BR());
		div.addChild(new BR());

		A a = new A();
		a.addStyle("font-size","24px");
		a.setHref("/sentence_read");
		a.setText("New Sentence");
		div.addChild(a);

		div.addChild(new BR());
		div.addChild(new BR());

		a = new A();
		a.addStyle("font-size","24px");
		a.setHref("/games");
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
