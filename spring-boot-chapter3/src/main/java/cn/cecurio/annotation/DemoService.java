package cn.cecurio.annotation;

import org.springframework.stereotype.Service;

/**
 * @author: Cecurio
 * @create: 2017-10-31 19:34
 * @desc:
 **/
@Service
public class DemoService {
    public void outputResult() {
        System.out.println("使用组合注解照样可以获取bean");
    }
}
