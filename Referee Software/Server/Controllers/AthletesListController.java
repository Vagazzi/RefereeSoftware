package server.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.Containers.LoginPageContainer;


@Controller
public class AthletesListController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String LoadLoginPage(Model model) {
        model.addAttribute("list", new AthletesListController());
        return "AthletesList";
    }
}