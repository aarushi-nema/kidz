package application.kidz.controller;

/**
 * Created by ajay on 24/2/17.
 */

import application.kidz.servlet.SentenceCategoryServlet;
import application.kidz.servlet.SightWordCategoryServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import platform.util.Util;
import platform.webservice.ui.UIServletContext;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UISentenceCategoryController {
    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value ="/sentence_category",method = RequestMethod.GET)
    public @ResponseBody String doGet(@CookieValue(value="session_id",required=false) String sessionId,
                                      @RequestParam(value="session_id", required=false) String session_id,
                                      @RequestParam(value="id", required=false) String id,
                                      @RequestParam(value="type", required=false) String type,
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

            if (!Util.isEmpty(type)) {
                context.addParam("type",type);
            }

            context.setDomainName(request.getServerName());
            SentenceCategoryServlet servlet = new SentenceCategoryServlet();
            String buffer = servlet.doGetSpringBoot(context);
            return buffer;
        } catch (Exception e) {
            e.printStackTrace();
            return "Some issue : " +e.getMessage();
        }
    }
}
