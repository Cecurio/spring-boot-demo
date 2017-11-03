package cn.cecurio.mvc4.web.ch4_3;

import cn.cecurio.mvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Cecurio
 * @create: 2017-11-01 0:14
 * @desc:
 **/
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String index(HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access";
    }

    //..
    @RequestMapping(value = "/pathvar/{var}", produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String demoPathVar(@PathVariable("var") String var, HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access, var: " + var;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String demoRequestParam(Long id, HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access, id: " + id;
    }

    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    String passObj(DemoObj obj, HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access, obj id: " + obj.getId() + ", obj name: " + obj.getName();
    }

    @RequestMapping(value = {"/name1","/name2"}, produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String remove(HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access";
    }

}
