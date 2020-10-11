package application.kidz.controller;

/**
 * Created by ajay on 24/2/17.
 */

import application.kidz.servlet.WordFamilyPractice1Servlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import platform.util.Util;
import platform.webservice.ui.UIServletContext;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UIWordFamilyPractice1Controller {
    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value ="/word_family_practice1",method = RequestMethod.GET)
    public @ResponseBody String doGet(@CookieValue(value="session_id",required=false) String sessionId,
                                      @RequestParam(value="session_id", required=false) String session_id,
                                      @RequestParam(value="id", required=false) String id,
                                      @RequestParam(value="op", required=false) String op) {
        try {
            if (Util.isEmpty(sessionId)) {
                sessionId = session_id;
            }
            UIServletContext context = new UIServletContext(sessionId);
            if (!Util.isEmpty(id)) {
                context.addParam("id",id);
            }
            if (!Util.isEmpty(op)) {
                context.addParam("op",op);
            }

            context.setDomainName(request.getServerName());
            WordFamilyPractice1Servlet servlet = new WordFamilyPractice1Servlet();
            String buffer = servlet.doGetSpringBoot(context);
            return buffer;
        } catch (Exception e) {
            e.printStackTrace();
            return "Some issue : " +e.getMessage();
        }
    }
}
