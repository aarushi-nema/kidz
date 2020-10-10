package application.kidz.servlet;

import application.kidz.servlet.base.AmrSingleColumnDBApplicationServlet;
import platform.util.ApplicationException;
import platform.webservice.manager.BoltViewManager;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseEasTableView;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.parser.UIResourceUtil;


public class BoltSingleServlet extends AmrSingleColumnDBApplicationServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public BaseHTMLComponent getAddView(UIServletContext context) {
        // TODO Auto-generated method stub
        return BoltViewManager.getInstance().getAddView(context);
    }

    @Override
    public BaseHTMLComponent getModifyView(UIServletContext context) {
        // TODO Auto-generated method stub
        return BoltViewManager.getInstance().getModifyView(context);
    }

    public BaseEasTableView getListViewObject(UIServletContext context) {
        return BoltViewManager.getInstance().getListViewObject(context);
    }

    @Override
    public BaseHTMLComponent getListView(UIServletContext context) {
        // TODO Auto-generated method stub
        return BoltViewManager.getInstance().getListView(context);
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


