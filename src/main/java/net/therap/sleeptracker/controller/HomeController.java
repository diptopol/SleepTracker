package net.therap.sleeptracker.controller;

import net.therap.sleeptracker.Dao.RecordDao;
import net.therap.sleeptracker.Dao.UserDao;
import net.therap.sleeptracker.domain.Record;
import net.therap.sleeptracker.domain.User;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 9/1/13
 * Time: 9:39 AM
 * To change this template use File | Settings | File Templates.
 */


@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    RecordDao recordDao;
    @Autowired
    UserDao userDao;

    Logger logger = org.slf4j.LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "sleepRecords")
    public ModelAndView showSleepRecords(HttpSession session,ModelAndView modelAndView) {

        long userId =(Long) session.getAttribute("userId");
        logger.info("In Home Controller :"+userId);
        List<Record> records = recordDao.getRecordsBy(userId);

        logger.info("In Home Controller :"+records.size());
        modelAndView.addObject("records",records);
        modelAndView.setViewName("sleepRecords");
        return modelAndView;
    }

    @RequestMapping(value = "recordForm",method = RequestMethod.GET)
    public String showEntryRecordForm(@ModelAttribute("record") Record record) {

        return "sleepRecordForm";
    }

    @RequestMapping(value = "saveRecord",method = RequestMethod.POST)
    public String saveRecord(@ModelAttribute("record") Record record, BindingResult bindingResult,HttpSession session) {

        long userId= (Long) session.getAttribute("userId");
        logger.info("In Hello Controller, saveRecord = " + record);
        recordDao.saveRecord(userId,record);
        return "redirect:/sleepRecords";
    }

    @RequestMapping(value = "showProfile", method = RequestMethod.GET)
    public ModelAndView showProfile(HttpSession session,ModelAndView modelAndView) {
        long userId = (Long)session.getAttribute("userId");
        User user = userDao.findUserBy(userId);
        if(user== null) {
            modelAndView.setViewName("loginForm");
            return modelAndView;
        }
        else {
            modelAndView.addObject("user",user);
            modelAndView.setViewName("profile");
            return modelAndView;
        }


    }

}
