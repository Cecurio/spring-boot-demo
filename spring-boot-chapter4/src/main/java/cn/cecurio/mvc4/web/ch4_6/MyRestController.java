package cn.cecurio.mvc4.web.ch4_6;

import cn.cecurio.mvc4.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Cecurio
 * @create: 2017-11-02 18:51
 * @desc:
 **/
@RestController
public class MyRestController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/testRest",produces = {"text/plain;charset=UTF-8"})
    public String testRest() {
        return demoService.saySomething();
    }
}
