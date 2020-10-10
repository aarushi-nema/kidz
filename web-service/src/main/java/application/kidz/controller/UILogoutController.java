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
import platform.util.Util;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


@Controller
public class UILogoutController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    ResourceLoader resourceLoader;

    @RequestMapping(value = "/ui/logout",method = RequestMethod.GET)
    public @ResponseBody String doGet() {
        try {

            ClassPathResource cpr = new ClassPathResource("static/ui/templete/amr_login.html");
            Map map = new HashMap<>();
            map.put("LOGO","assets/images/logo_light.png");
            map.put("LOGO_HEIGHT","40px");
            if (request.getServerName().contains("trinity")) {
                map.put("LOGO","/images/trinity.gif");
                map.put("LOGO_HEIGHT","60px");
            } else  if (request.getServerName().contains("aew")) {
                map.put("LOGO","/images/aew.jpg");
                map.put("LOGO_HEIGHT","60px");
            } else  if (request.getServerName().contains("itl")) {
                map.put("LOGO","/images/itl_logo.png");
                map.put("LOGO_HEIGHT","140px");
            }
            try {
                byte[] bdata = FileCopyUtils.copyToByteArray(cpr.getInputStream());
                String data = new String(bdata, StandardCharsets.UTF_8);
                String buffer  = Util.readTempleteContentFromLocal(data,map);
                return buffer;
            } catch (IOException e) {

            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "Some issue : " +e.getMessage();
        }
    }
}
