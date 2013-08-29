package net.therap.sleeptracker.controller;

import net.therap.sleeptracker.Dao.UserDao;
import net.therap.sleeptracker.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @Autowired
    UserDao userDao;

    Logger logger = LoggerFactory.getLogger(LogInManager.class);

    @RequestMapping("logInForm")
    public String showLogInForm(Model model) {

        model.addAttribute("message","logInForm");
        return "loginForm";
    }

    @RequestMapping(value = "logInSubmission",method = RequestMethod.POST)
    public String logInSubmission(@RequestParam("userName") String username,
                                  @RequestParam("passWord") String password,Model model) {

        logger.info("In logInSubmission username="+username+" password="+password);
        User user = userDao.findUserBy(username, password);
        logger.info("In logInSubmission user.username="+user.getUsername()+" user.password="+user.getPassword());

        return "hello";
    }

}
