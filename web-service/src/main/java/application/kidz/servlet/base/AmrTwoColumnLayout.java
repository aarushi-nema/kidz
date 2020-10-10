package application.kidz.servlet.base;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.layout.BaseLayout;

public class AmrTwoColumnLayout extends BaseLayout {
	Div mLayoutContainer;
	Div mLayoutHeader;
	Div mLayoutLeft;
	Div mLayoutFooter;
	Div mLayoutContent;
	Div mLayoutMainContent;
	Div mLayoutMenuContent;
	
	public AmrTwoColumnLayout(UIServletContext ctx) {
		mLayoutContainer =  new Div();
		mLayoutHeader = new Div() ;
		mLayoutContainer.addChild(mLayoutHeader);		
		mLayoutMainContent = new Div(null,"main_container");		
		mLayoutContainer.addChild(mLayoutMainContent);	
		mLayoutMenuContent = new Div(null,"container-fluid bg-white text-center no-padding");
		mLayoutMainContent.addChild(mLayoutMenuContent);	
		Div div = new Div(null,"container no-padding  margin-top-10");
		div.addAttribute("style","width:90%;margin-top:50px;");
		mLayoutMainContent.addChild(div);
		mLayoutLeft = new Div(null,"col-lg-3 col-md-3 col-md-left");
		mLayoutLeft.addAttribute("style" ,"margin-top:20px");
		if (!"Y".equalsIgnoreCase(ctx.getParamValue("hide_side_menu"))) {
			mLayoutContent = new Div(null,"col-lg-9 col-md-9 col-sm-12 col-md-center-and-right");
			div.addChild(mLayoutLeft);
		} else {
			mLayoutContent = new Div(null,"col-lg-12 col-md-12 col-sm-12 col-md-center-and-right");
		}
		div.addChild(mLayoutContent);
	}
	
	public BaseHTMLComponent getLayout() {
		return mLayoutContainer;
	}
	
	public Div getMenu() {
		return mLayoutMenuContent;
	}
	
	
	public Div getHeader() {
		return mLayoutHeader;
	}
	
	public Div getFooter() {
		return mLayoutFooter;
	}
	
	public Div getMainContent() {
		return mLayoutMainContent;
	}
	
	public Div getLeftColumn() {
		return mLayoutLeft;
	}
	
	public Div getContent() {
		return mLayoutContent;
	}

}
