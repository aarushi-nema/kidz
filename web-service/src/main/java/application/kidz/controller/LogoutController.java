package application.kidz.controller;
import application.kidz.service.LogoutService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import platform.resource.login;

/**
 * Created by shraddha on 06-Oct-16.
 */
@Controller
@RequestMapping("/api/logout")
class LogoutController extends BaseController {
    protected boolean isLoginRequired() {
        return false;
    }
    public LogoutController() {
        super(new login(),new LogoutService());
    }
}
