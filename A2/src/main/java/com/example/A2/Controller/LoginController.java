package com.example.A2.Controller;

import com.example.A2.Business.LoginService;
import com.example.A2.Persistence.Entity.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
public class LoginController {

    @Inject
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getUsers()
    {
        List<Login> loginList = loginService.getAllUsersLoggedIn();

        ModelAndView mav = new ModelAndView("login");
        mav.addObject("usersList", loginList);

        return mav;

    }
}
