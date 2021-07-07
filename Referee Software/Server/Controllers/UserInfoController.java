package server.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.Containers.LoginPageContainer;


@Controller
public class UserInfoController {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String LoadLoginPage(Model model) {
        model.addAttribute("info", new ReportGenerateController());
        return "UserInfo";
    }
}