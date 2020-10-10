package application.kidz.controller;
/**
 * Created by ajay on 24/2/17.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.CustomerHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.customer;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.Util;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.IdValue;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.COMBO;
import platform.webservice.ui.html.LI;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UIDashboardController {
    @Autowired
    private HttpServletRequest request;
    @Autowired
    ResourceLoader resourceLoader;

    @RequestMapping(value = "/ui/dashboard", method = RequestMethod.GET)
    public @ResponseBody
    String doGet(@CookieValue(value = "session_id", required = false) String sessionId,
                 @RequestParam(value = "location_id", required = false) String location_id,
                 @RequestParam(value = "appliance_id", required = false) String appliance_id,
                 @RequestParam(value = "session_id", required = false) String session_id) {
        Map<String, String> map = new HashMap<String, String>();

        try {

            if (Util.isEmpty(sessionId)) {
                sessionId = session_id;
            }
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            UIServletContext context = null;
            try {
                context = new UIServletContext(sessionId);
            } catch (ApplicationException ex) {
                ex.printStackTrace();
            }
            Enumeration names = request.getParameterNames();

            while (names.hasMoreElements()) {
                String name = (String) names.nextElement();
                String value = request.getParameter(name);
                context.addParam(name, value);
            }
            user _user = (user) UserHelper.getInstance().getById(context.getUserId());
            context.setDomainName(request.getServerName());

            ClassPathResource cpr = new ClassPathResource("static/ui/templete/dashboard.html");

            String select_project_str = "";
            if (context.getUser() != null && !Util.isEmpty(context.getUser().getCustomer_group_id())) {
                BaseResource[] customers = CustomerHelper.getInstance().getByExpression(new Expression(customer.FIELD_CUSTOMER_GROUP_ID, REL_OP.EQ,context.getUser().getCustomer_group_id()),
                        new String[]{"name"});
                if (!Util.isEmpty(customers)) {
                    ArrayList<IdValue> list = new ArrayList<>();
                    for(BaseResource resource : customers) {
                        list.add(new IdValue(resource.getId(), resource.getName()));
                    }
                    LI li = new LI();
                    A a = new A();
                    a.setText("Select Project : ");
                    a.setHref("javascript(0)");
                    li.addChild(a);
                    select_project_str = li.getContent(0);
                    li = new LI();
                    COMBO combo = new COMBO("select_project", "form-control", list, context.getCustomerId());
                    combo.getView().addAttribute("style", "margin-right:200px;margin-top:5px;");
                    combo.getView().addAttribute("onchange", "ActionHandler.callChangeProject()");
                    li.addChild(combo.getView());
                    select_project_str += li.getContent(0);
                }
            }
            map.put("PROJECT_SELECTION", "" + select_project_str);
            map.put("CUSTOMER_NAME", "" + context.getCustomerName());
            map.put("LOGO", "");
            map.put("LOGO_HEIGHT", "35px");
            map.put("USER_NAME", context.getUserName());
            try {
                byte[] bdata = FileCopyUtils.copyToByteArray(cpr.getInputStream());
                String data = new String(bdata, StandardCharsets.UTF_8);
                String buffer = Util.readTempleteContentFromLocal(data, map);
                return buffer;
            } catch (IOException e) {

            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Some issue : " + e.getMessage();
        }
        return "";
    }
}
