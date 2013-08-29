package net.therap.sleeptracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 8/29/13
 * Time: 9:31 AM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/")
public class LogInManager {
    @RequestMapping("logInForm")
    public String showLogInForm(Model model) {

        model.addAttribute("message","logInForm");
        return "hello";
    }

}
