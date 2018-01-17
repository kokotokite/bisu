package cn.com.fdc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.fdc.app.domain.Student;

/**
 * Created by lixp on 2017/12/14.
 */
@Controller
public class HelloController {

    @RequestMapping("/student/hello")
    public ModelAndView say(Student student) {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("username","jiangyi");
        mav.addObject("favorite", "喜欢英语");
        return mav;
    }
}
