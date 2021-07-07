package server.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.Containers.LoginPageContainer;
import server.DataComparing.ComparingData;

import java.io.IOException;


@Controller
public class LoginPageController {

    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public String LoadLoginPage(Model model) {
        model.addAttribute("login", new LoginPageContainer());
        return "LoginPage";
    }

    @RequestMapping (value = "/login", method= RequestMethod.POST)
    public String getDataFromLoginPage(@ModelAttribute LoginPageContainer login, Model model) throws IOException {
        model.addAttribute("login", login);

        ComparingData comparingData = new ComparingData();
        comparingData.compareData(login.getLogin(),login.getPassword());

        return "UserInfo";
    }

}