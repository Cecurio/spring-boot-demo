package cn.cecurio.mvc4.web.ch4_3;

import cn.cecurio.mvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Cecurio
 * @create: 2017-11-01 21:02
 * @desc:
 **/
@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value = "/getjson",produces = {"application/json; charset=UTF-8"})
    public DemoObj getJson(DemoObj obj) {
        return new DemoObj(obj.getId()+1,obj.getName()+"yy");
    }


    @RequestMapping(value = "/getxml",produces = {"application/xml; charset=UTF-8"})
    public DemoObj getXml(DemoObj obj) {
        return new DemoObj(obj.getId()+1,obj.getName()+"yy");
    }
}
