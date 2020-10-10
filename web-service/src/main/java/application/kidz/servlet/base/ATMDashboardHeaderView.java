package application.kidz.servlet.base;

import platform.helper.UserHelper;
import platform.resource.user;
import platform.util.Util;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.*;

public class ATMDashboardHeaderView extends BaseView {
    UIServletContext mContext;

    public ATMDashboardHeaderView(UIServletContext context) {
        mContext = context;
    }


    public void buildUI() {
        CUSTOM nav = new CUSTOM("nav", null, "navbar navbar-inverse navbar-fixed-top app-navbar");
        getView().addChild(nav);
        Div container = new Div(null, "container no-padding-xs");
        container.addAttribute("style", "width:100%;");
        nav.addChild(container);
        Div navbar_header = new Div(null, "navbar-header");
        container.addChild(navbar_header);
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
        LI li = new LI();
        li = new LI();
        a = new A();
        a.setText("Analytics");
        a.setHref("/ui/meter_data");
        li.addChild(a);
        ul.addChild(li);

        user _user = (user) UserHelper.getInstance().getById(mContext.getUserId());
        if (!Util.isEmpty(_user.getSuper_user()) && !"N".equals(_user.getSuper_user())) {
            li = new LI();
            a = new A();
            a.setText("Setup");
            a.setHref("/ui/setup");
            li.addChild(a);
            ul.addChild(li);
        }

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
        a2.setText("<i class=\"icon-cog5\"></i> Account settings");
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
