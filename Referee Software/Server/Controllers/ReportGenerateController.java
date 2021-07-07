package server.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.Containers.LoginPageContainer;


@Controller
public class ReportGenerateController{

    @RequestMapping(value = "/report", method= RequestMethod.GET)
    public String LoadLoginPage(Model model) {
        model.addAttribute("report", new ReportGenerateController());
        return "ReportGenerate";
    }
/*
    @RequestMapping (value = "/login", method= RequestMethod.POST)
    public String getDataFromLoginPage(@ModelAttribute LoginPageContainer login, Model model) {
        model.addAttribute("login", login);
        System.out.println(login.getLogin());
        System.out.println(login.getPassword());


        return "MainStage";
    }
*/
}