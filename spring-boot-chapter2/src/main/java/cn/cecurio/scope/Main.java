package cn.cecurio.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @author: Cecurio
 * @create: 2017-10-16 14:50
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        System.out.println("p1与p2是否相等：" + p1.equals(p2));
        System.out.println("s1与s2是否相等：" + s1.equals(s2));
    }
}
