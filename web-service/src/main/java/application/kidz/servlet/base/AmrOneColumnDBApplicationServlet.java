package application.kidz.servlet.base;

import platform.webservice.WebServiceContants;
import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;

public abstract class AmrOneColumnDBApplicationServlet extends BaseUIServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMobilePage(UIServletContext context) {
		return "";
	}

	public abstract BaseHTMLComponent getAddView(UIServletContext context);
	public abstract BaseHTMLComponent getModifyView(UIServletContext context);
	public abstract BaseHTMLComponent getDeleteView(UIServletContext context);
	public abstract BaseHTMLComponent getListView(UIServletContext context);
	public abstract BaseHTMLComponent getView(UIServletContext context);

	public BaseHTMLComponent getWebContentView(UIServletContext context) {
		String op = context.getParamValue("op");
		if (op != null) {
			if (WebServiceContants.OPERATION_ADD.equalsIgnoreCase(op)) {
				return getAddView(context);
			} else if(WebServiceContants.OPERATION_MODIFY.equalsIgnoreCase(op)) {
				return getModifyView(context);
			} else if(WebServiceContants.OPERATION_MODIFY.equalsIgnoreCase(op)) {
				return getModifyView(context);
			} else if(WebServiceContants.OPERATION_DELETE.equalsIgnoreCase(op)) {
				return getDeleteView(context);
			} else if(WebServiceContants.OPERATION_VIEW.equalsIgnoreCase(op)) {
				return getView(context);
			}
		}
		return getListView(context);
	}

	public abstract BaseHTMLComponent getWebLeftDisplay(UIServletContext context) ;
	
	@Override
	public String getWebPage(UIServletContext context) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		AmrOneColumnLayout layout = new AmrOneColumnLayout(context);
		ATMDashboardHeaderView headerView = new ATMDashboardHeaderView(context);
		headerView.buildUI();
		layout.getHeader().addChild(headerView.getView());
		layout.getContent().addChild(getWebContentView(context));
		context.getPageBuilder().setLayout(layout);
		return context.getPageBuilder().getEasPageContent();
			
	}

}
