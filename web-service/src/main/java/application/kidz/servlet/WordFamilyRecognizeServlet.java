package application.kidz.servlet;

import application.kidz.defined.helper.WordFamilyWordHelper;
import application.kidz.defined.resource.WordFamilyWord;
import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.*;

import java.util.Date;


public class WordFamilyRecognizeServlet extends AmrSingleColumnDBApplicationServlet {
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
		BaseResource[] resources = WordFamilyWordHelper.getInstance().getAll();
		int index = (int)new Date().getTime()%resources.length;
		WordFamilyWord word = (WordFamilyWord) resources[index];
		Div wordDiv = new Div();
		div.addChild(new BR());
		div.addChild(new BR());
		div.addChild(new BR());
		div.addChild(new BR());
		wordDiv.addAttribute("align", "center");
		wordDiv.addAttribute("style","font-size: 200px;");
		wordDiv.addChild(new TEXT(word.getName()));
		div.addChild(wordDiv);
		div.addChild(new BR());
		div.addChild(new BR());

		A a = new A();
		a.addStyle("font-size","24px");
		a.setHref("/word_family_word_recognize");
		a.setText("New Word");
		div.addChild(a);

		div.addChild(new BR());
		div.addChild(new BR());

		a = new A();
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
