package server.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.Containers.RegisterPageContainer;
import server.DataProcessing.ProcessingDataFromRegisterPage;
import server.FilesManagement.WriteRegisteredUsers;

import java.io.IOException;


@Controller
public class RegisterPageController {

    @RequestMapping (value = "/register", method= RequestMethod.GET)
    public String LoadRegisterPage(Model model) {
        model.addAttribute("register", new RegisterPageContainer());
        return "RegisterPage";
    }

    @RequestMapping (value = "/register", method= RequestMethod.POST)
    public String getData(@ModelAttribute RegisterPageContainer register, Model model) throws IOException {
        model.addAttribute("register", register);

        ProcessingDataFromRegisterPage.pushData(register.getName(),register.getSurname(),register.getFn(),register.getEmail(),register.getPassword());

        WriteRegisteredUsers.writeRegisteredUserData();
        return "RegisterResult";
    }


}