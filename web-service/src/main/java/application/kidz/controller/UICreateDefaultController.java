package application.kidz.controller;

/**
 * Created by ajay on 24/2/17.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import platform.defined.helper.UserHelper;
import platform.defined.resource.User;
import platform.util.Util;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


@Controller
public class UICreateDefaultController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    ResourceLoader resourceLoader;

    void create_default_user() {
        User user = new User("admin@cloud4things.com");
        user.setType("C4T_ADMIN");
        user.setEmail_id("admin@cloud4things.com");
        user.setMobile_no("123456789");
        user.setPassword("admin@123");
        user.setName("Super Admin");
        UserHelper.getInstance().AddOrUpdateNoCache(user);
    }

    @RequestMapping(value ="/ui/create_default",method = RequestMethod.GET)
    public @ResponseBody String doGet() {
        create_default_user();
        return "created default successfully";
    }
}
