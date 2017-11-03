package cn.cecurio.aop;

import org.springframework.stereotype.Service;

/**
 * @author: Cecurio
 * @create: 2017-10-16 13:46
 * @desc:
 **/
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {}
}
