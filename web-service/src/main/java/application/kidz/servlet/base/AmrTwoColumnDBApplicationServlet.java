package application.kidz.servlet.base;

import org.springframework.web.servlet.ModelAndView;
import platform.webservice.WebServiceContants;
import platform.webservice.ui.BaseUIServlet;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseEasTableView;
import platform.webservice.ui.component.ExcelBuilder;
import platform.webservice.ui.component.ExcelContext;
import platform.webservice.ui.html.BaseHTMLComponent;


public abstract class AmrTwoColumnDBApplicationServlet extends BaseUIServlet {
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
	public  BaseHTMLComponent getListView(UIServletContext context) {
			// TODO Auto-generated method stub
			BaseEasTableView view = getListViewObject(context);
			view.setShow_download(true);
			if (view != null) {
				view.buildUI();
				return view.getView();
			}
			return null;
	}
	public abstract BaseHTMLComponent getView(UIServletContext context);
	public BaseEasTableView getListViewObject(UIServletContext context) {
		return null;
	}

	@Override
	public ModelAndView download_excel(UIServletContext context) {
		try{
			BaseEasTableView list = getListViewObject(context);
			if (list != null) {
				list.prepareExcelContext();
				ExcelContext excelContext = list.getExcelContext();
				return new ModelAndView(new ExcelBuilder(), "context", excelContext);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

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
		AmrTwoColumnLayout layout = new AmrTwoColumnLayout(context);
		AmrHeaderView headerView = new AmrHeaderView(context);
		headerView.buildUI();
		layout.getHeader().addChild(headerView.getView());
		layout.getLeftColumn().addChild(getWebLeftDisplay(context));
		layout.getContent().addChild(getWebContentView(context));
		context.getPageBuilder().setLayout(layout);
		return context.getPageBuilder().getEasPageContent();
			
	}
}
