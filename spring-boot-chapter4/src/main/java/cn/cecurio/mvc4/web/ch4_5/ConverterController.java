package cn.cecurio.mvc4.web.ch4_5;

import cn.cecurio.mvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Cecurio
 * @create: 2017-11-02 15:15
 * @desc:
 **/
@Controller
public class ConverterController {
    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    @ResponseBody
    public DemoObj converter(@RequestBody DemoObj obj) {
        return obj;
    }
}
