package cn.cecurio.mvc4.web.ch4_4;

import cn.cecurio.mvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: Cecurio
 * @create: 2017-11-02 0:55
 * @desc:
 **/
@Controller
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("非常抱歉,参数有误/" + "来自@ModelAttribute: " + msg);
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("home","这是主页");
        //model.addAttribute("home","这是主页");
        return modelAndView;
    }
}
