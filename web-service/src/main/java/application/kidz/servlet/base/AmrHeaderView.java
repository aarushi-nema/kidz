package application.kidz.servlet.base;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.CustomerHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.customer;
import platform.resource.user;
import platform.util.Util;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.definition.IdValue;
import platform.webservice.ui.html.*;

import java.util.ArrayList;

public class AmrHeaderView extends BaseView {
    UIServletContext mContext;

    public AmrHeaderView(UIServletContext context) {
        mContext = context;
    }


    public void buildUI() {
        CUSTOM nav = new CUSTOM("nav", null, "navbar navbar-inverse navbar-fixed-top app-navbar");
        nav.addAttribute("style","padding-left:0px;");
        getView().addChild(nav);
        Div container = new Div(null, "container no-padding-xs");
        container.addAttribute("style", "width:100%;");
        nav.addChild(container);
        Div navbar_header = new Div(null, "navbar-header");
        container.addChild(navbar_header);
        A menu_a = new A("menu_a","");
        menu_a.addAttribute("class", "navbar-brand");
        if ("Y".equalsIgnoreCase(mContext.getParamValue("hide_side_menu"))) {
            menu_a.setHref("#");
            menu_a.addAttribute("onClick","show_menu()");
            menu_a.addAttribute("style", "padding-top:10px;margin-bottom:10px");
            menu_a.setText("<i style=\"color:gray;font-size:40px\" class=\" fa fa-bars fa-rotate-90\"></i>");
            navbar_header.addChild(menu_a);
        } else {
            menu_a.setHref("#");
            menu_a.addAttribute("onClick","hide_menu()");
            menu_a.addAttribute("style", "padding-top:10px;margin-bottom:10px");
            menu_a.setText("<i style=\"color:gray;font-size:40px\" class=\" fa fa-bars\"></i>");
            navbar_header.addChild(menu_a);
        }
        A a = new A();
        IMG img = new IMG();
        if ((mContext.getDomainName() != null) && (mContext.getDomainName().contains("trinity"))) {
            img.addAttribute("style", "height:50px");
            img.setSRC("/images/trinity.gif");
        } else if ((mContext.getDomainName() != null) && (mContext.getDomainName().contains("aew"))) {
            img.addAttribute("style", "height:35px");
            img.setSRC("/images/aew_logo.png");
        } else if ((mContext.getDomainName() != null) && (mContext.getDomainName().contains("itl"))) {
            img.addAttribute("style", "height:40px");
            img.setSRC("/images/itl_header_logo.png");
        } else if ((mContext.getDomainName() != null) && (mContext.getDomainName().contains("hpl"))) {
            img.addAttribute("style", "height:40px");
            img.setSRC("/images/hpl_logo.png");
        } else {
            img.addAttribute("style", "height:35px");
            img.setSRC("assets/images/logo_light.png");
        }
        a.addChild(img);
        a.addAttribute("class", "navbar-brand");
        a.addAttribute("style", "padding-top:2px");
        navbar_header.addChild(a);
        Div navbarDiv = new Div("navbar", null);
        container.addChild(navbarDiv);
        UL ul = new UL(null, "nav navbar-nav navbar-right text-right");
        navbarDiv.addChild(ul);
        LI li ;
        if (mContext.getUser() != null && !Util.isEmpty(mContext.getUser().getCustomer_group_id())) {
            BaseResource[] customers = CustomerHelper.getInstance().getByExpression(new Expression(customer.FIELD_CUSTOMER_GROUP_ID, REL_OP.EQ,mContext.getUser().getCustomer_group_id()),
                    new String[]{"name"});
            if (!Util.isEmpty(customers)) {
                li = new LI();
                ArrayList<IdValue> list = new ArrayList<>();
                for(BaseResource resource : customers) {
                    list.add(new IdValue(resource.getId(), resource.getName()));
                }
                li = new LI();
                a = new A();
                a.setText("Select Project : ");
                a.setHref("javascript(0)");
                li.addChild(a);
                ul.addChild(li);

                li = new LI();
                COMBO combo = new COMBO("select_project", "form-control", list, mContext.getCustomerId());
                combo.getView().addAttribute("style", "margin-right:200px;margin-top:5px;");
                combo.getView().addAttribute("onchange", "ActionHandler.callChangeProject()");
                li.addChild(combo.getView());
                ul.addChild(li);
            }
        }
        li = new LI();
        a = new A();
        a.setText("Dashboard");
        a.setHref("/ui/dashboard");
        li.addChild(a);
        ul.addChild(li);

        li = new LI();

        a = new A();
        a.setText("Activity");
        a.setHref("/ui/activity");
        li.addChild(a);
        ul.addChild(li);

        li = new LI();
        a = new A();
        a.setText("Analytics");
        a.setHref("/ui/analysis");
        li.addChild(a);
        ul.addChild(li);

        li = new LI();
        a = new A();
        a.setText("Setup");
        a.setHref("/ui/setup");
        li.addChild(a);
        ul.addChild(li);

        li = new LI(null, "ropdown dropdown-user");


                        /*<ul class="dropdown-menu dropdown-menu-right">
                            <li><a href="#"><i class="icon-user-plus"></i> My profile</a></li>
                            <li class="divider"></li>
                            <li><a href="#"><i class="icon-cog5"></i> Account settings</a></li>
                            <li><a href="/ui/logout"><i class="icon-switch2"></i> Logout</a></li>
                        </ul>*/
        a = new A("", "dropdown-toggle");
        a.addAttribute("data-toggle", "dropdown");
        SPAN span = new SPAN();
        span.setText(mContext.getUserName());

        IMG i = new IMG();
        i.setSRC("assets/images/image.png");
        a.addChild(i);
        a.addChild(span);
        a.addChild(new TEXT("<i class=\"caret\"></i>"));
        //a.setHref(WebConstants.UI_LOGOUT);
        li.addChild(a);
        UL ul_drop = new UL(null, "dropdown-menu dropdown-menu-right");

        LI l = new LI();
        A a2 = new A();
        a2.setText("<i class=\"icon-user-plus\"></i> My profile");
        l.addChild(a2);
        ul_drop.addChild(l);

        l = new LI(null, "divider");
        ul_drop.addChild(l);

        l = new LI();
        a2 = new A();
        a2.setText("<i class=\"icon-cog5\"></i> Install and Migrate");
        a2.setHref("/bolt/publish");
        l.addChild(a2);
        ul_drop.addChild(l);

        l = new LI();
        a2 = new A();
        a2.setText("<i class=\"icon-cog5\"></i> Change Password");
        a2.setHref("/ui/change_password");
        l.addChild(a2);
        ul_drop.addChild(l);

        l = new LI();
        a2 = new A();
        a2.setText("<i class=\"icon-switch2\"></i> Logout");
        a2.setHref("/ui/logout");
        l.addChild(a2);
        ul_drop.addChild(l);

        li.addChild(ul_drop);
        ul.addChild(li);
    }
}
