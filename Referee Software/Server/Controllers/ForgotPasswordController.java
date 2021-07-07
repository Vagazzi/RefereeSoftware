package server.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ForgotPasswordController{

    @GetMapping("/forgot")
    public String loadForgotPage() {

        return "ForgotPass";

    }

}