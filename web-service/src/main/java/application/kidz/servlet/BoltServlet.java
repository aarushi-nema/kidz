package application.kidz.servlet;

import application.kidz.servlet.base.AmrTwoColumnDBApplicationServlet;
import application.kidz.servlet.base.menu.AmrImageCardView;
import application.kidz.servlet.menu.ActivityLeftMenuView;
import application.kidz.servlet.menu.AnalyticsLeftMenuView;
import application.kidz.servlet.menu.SetupLeftMenuView;
import application.kidz.servlet.menu.SuperAdminSetupLeftMenuView;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.webservice.manager.BoltViewManager;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseEasTableView;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.parser.UIResourceUtil;


public class BoltServlet extends AmrTwoColumnDBApplicationServlet {
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


    @Override
    public BaseHTMLComponent getWebLeftDisplay(UIServletContext context) {
        // TODO Auto-generated method stub
        Div div = new Div();
        AmrImageCardView view = new AmrImageCardView(context);
        view.buildUI();
        div.addChild(view.getView());
        String menu_context = "";
        try {
            menu_context = UIResourceUtil.getInstance().getMenuContext(context);
        } catch (ApplicationException e) {
            e.printStackTrace();
        }
        if (menu_context.equalsIgnoreCase("setup")) {
            if (user.USER_TYPE_CUSTOMER_ADMIN.equals(context.getUserType()) || user.USER_TYPE_USER.equals(context.getUserType())) {
                SetupLeftMenuView leftMenu = new SetupLeftMenuView(context);
                leftMenu.buildUI();
                div.addChild(leftMenu.getView());
            } else if (user.USER_TYPE_C4T_ADMIN.equals(context.getUserType()) || user.USER_TYPE_USER.equals(context.getUserType())) {
                SuperAdminSetupLeftMenuView leftMenu = new SuperAdminSetupLeftMenuView(context);
                leftMenu.buildUI();
                div.addChild(leftMenu.getView());
            }
        } else if (menu_context.equalsIgnoreCase("analytics")) {
                AnalyticsLeftMenuView leftMenu = new AnalyticsLeftMenuView(context);
                leftMenu.buildUI();
                div.addChild(leftMenu.getView());
        } else if (menu_context.equalsIgnoreCase("activity")) {
            ActivityLeftMenuView leftMenu = new ActivityLeftMenuView(context);
            leftMenu.buildUI();
            div.addChild(leftMenu.getView());
        }
        return div;
    }

}


