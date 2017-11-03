package cn.cecurio.mvc4.web.ch4_6;

import cn.cecurio.mvc4.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Cecurio
 * @create: 2017-11-02 18:48
 * @desc:
 **/
@Controller
public class NormalController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/normal")
    public String testPage(Model model) {
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }
}
