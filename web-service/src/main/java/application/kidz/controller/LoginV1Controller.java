package application.kidz.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import platform.resource.login;
import service.LoginService;

/**
 * Created by shraddha on 06-Oct-16.
 */
@Controller
@RequestMapping("/extended_api/v1/login")
class LoginV1Controller extends BaseController {
    protected boolean isLoginRequired() {
        return false;
    }
    public LoginV1Controller() {
        super(new login(),new LoginService());
    }
}
