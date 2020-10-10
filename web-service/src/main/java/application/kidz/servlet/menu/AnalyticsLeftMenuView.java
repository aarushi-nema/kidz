package application.kidz.servlet.menu;

import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.H3;

public class AnalyticsLeftMenuView extends BaseView {
    UIServletContext mContext;

    public AnalyticsLeftMenuView(UIServletContext context) {
        mContext = context;
    }



    public BaseResource[] getData() {
        return null;
    }


    public void buildUI() {
        getView().addAttribute("class", "box box-solid");
        Div boxHeaderDiv = new Div(null, "box-header   bg-gray");
        getView().addChild(boxHeaderDiv);
        H3 h3 = new H3("<strong>Analytics</strong>");
        h3.addAttribute("class", "box-title text-center display-block");
        boxHeaderDiv.addChild(h3);

        Div boxBody = new Div(null, "box-body no-padding");
        getView().addChild(boxBody);

        Div lisGroup = new Div(null, "box-body no-padding");
        boxBody.addChild(lisGroup);

        /*A a;
        a = new A(null, "list-group-item with_indentation with_icon ");
        a.setText("<i class=\"fa fa-recycle margin-r-5 with_indentation with_icon\"></i>Meter Health");
        a.setHref("meter_dashboard");
        lisGroup.addChild(a);
       */
    }
}