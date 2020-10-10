package application.kidz.util;

import platform.webservice.ui.definition.IdValue;

/**
 * Created by ajay on 23/9/17.
 */
public class WebConstants {
    // ui
    public static String UI_CUSTOMER = "/ui/customer";
    public static String UI_ADMIN = "/ui/admin";
    public static String UI_CUSTOMERGROUP = "/ui/customer_group";
    public static String UI_SETUP = "/ui/setup";
    public static String UI_SIMULATOR = "/ui/simulator";
    public static String UI_DASHBOARD = "/ui/dashboard";
    public static String UI_LOGIN = "/ui/login";
    public static String UI_LOGOUT = "/ui/logout";
    public static String API_CUSTOMERGROUP = "/api/customer_group";
    public static String API_REPORT = "/api/report";

    public static String API_CUSTOMER = "/api/customer";
    public static String API_ADMIN = "/api/admin";

    public final static IdValue[] ADMIN_TYPE = new IdValue[]{
            new IdValue("CUSTOMER_ADMIN", "Admin"),
    };

    public final static IdValue[] CUSTOMER_ADMIN_TYPE = new IdValue[]{
            new IdValue("CUSTOMER_ADMIN", "Admin")
    };

}
