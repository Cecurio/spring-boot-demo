package cn.cecurio.aop;

import org.springframework.stereotype.Service;

/**
 * @author: Cecurio
 * @create: 2017-10-16 13:45
 * @desc:
 **/
@Service
public class DemoMethodService {
    @Action(name = "method")
    public void add() {}
}
