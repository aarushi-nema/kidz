package application.kidz.servlet.menu;

import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.H3;

public class SetupLeftMenuView extends BaseView {
    UIServletContext mContext;

    public SetupLeftMenuView(UIServletContext context) {
        mContext = context;
    }


    public BaseResource[] getData() {
        return null;
    }






    public void buildUI() {
            Div setupDiv = new Div(null, "box box-solid");
            getView().addChild(setupDiv);
            Div boxHeaderDiv = new Div(null, "box-header   bg-gray");
            setupDiv.addChild(boxHeaderDiv);
            H3 h3 = new H3("<strong>Unit Configuration</strong>");
            h3.addAttribute("class", "box-title text-center display-block");
            boxHeaderDiv.addChild(h3);

            Div boxBody = new Div(null, "box-body no-padding");
            setupDiv.addChild(boxBody);

            Div lisGroup = new Div(null, "box-body no-padding");
            boxBody.addChild(lisGroup);
            A a;
            a = new A(null, "list-group-item with_indentation with_icon ");
            a.setText("<i class=\"fa fa-id-card margin-r-5 with_indentation with_icon\"></i>Sample");
            a.setHref("sample");
            lisGroup.addChild(a);

     }
}
