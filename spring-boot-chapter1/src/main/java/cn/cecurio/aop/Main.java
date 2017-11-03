package cn.cecurio.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Cecurio
 * @create: 2017-10-16 14:02
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService =
            context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService =
            context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();

        context.close();
    }
}
