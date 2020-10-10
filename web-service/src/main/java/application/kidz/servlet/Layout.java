package application.kidz.servlet;

import platform.util.ApplicationException;
import platform.webservice.manager.BaseLayout;
import platform.webservice.ui.UIServletContext;

public class Layout  extends BaseLayout {
    @Override
    public Object getContent(UIServletContext context) throws Exception {
        if ("Y".equalsIgnoreCase(context.getParamValue("hide_left_menu"))) {
            BoltSingleServlet servlet = new BoltSingleServlet();
            return servlet.doGetSpringBootObject(context);
        }
        BoltServlet servlet = new BoltServlet();
        return servlet.doGetSpringBootObject(context);
    }
}
