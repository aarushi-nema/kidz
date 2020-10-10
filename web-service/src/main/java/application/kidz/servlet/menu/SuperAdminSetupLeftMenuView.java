package application.kidz.servlet.menu;

import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.H3;

public class SuperAdminSetupLeftMenuView extends BaseView {
	UIServletContext mContext;
	public SuperAdminSetupLeftMenuView(UIServletContext context) {
		mContext = context;
	}

	
	public BaseResource[] getData() {
		return null;
	}
	public void buildUI() {	
		//getView().addAttribute("class","box box-solid bg-gray");

		Div panelDiv = new Div(null, "box box-solid");
		panelDiv.addAttribute("style", "margin-top:20px");
		getView().addChild(panelDiv);
		Div boxHeaderDiv = new Div(null,"box-header   bg-gray");
		panelDiv.addChild(boxHeaderDiv);
		H3 h3 = new H3("<strong>Customer Configuration</strong>");
		h3.addAttribute("class","box-title text-center display-block");
		boxHeaderDiv.addChild(h3);
		Div boxBody = new Div(null,"box-body no-padding");
		panelDiv.addChild(boxBody);
		Div lisGroup = new Div(null,"box-body no-padding");
		boxBody.addChild(lisGroup);
		A a;
		a = new A(null , "list-group-item with_indentation with_icon ");
		a.setText("<i class=\"fa fa-user-circle margin-r-5 with_indentation with_icon\"></i>Customer");
		a.setHref("/ui/bolt?resource=customer_proxy");
		lisGroup.addChild(a);

		a = new A(null , "list-group-item with_indentation with_icon ");
		a.setText("<i class=\"fa fa-users margin-r-5 with_indentation with_icon\"></i>Customer Group");
		a.setHref("/ui/bolt?resource=customer_group_proxy");
		lisGroup.addChild(a);
		
		a = new A(null , "list-group-item with_indentation with_icon ");
		a.setText("<i class=\"fa fa-user margin-r-5 with_indentation with_icon\"></i>Customer Admin");
		a.setHref("/ui/bolt?resource=admin");
		lisGroup.addChild(a);
	}
}
