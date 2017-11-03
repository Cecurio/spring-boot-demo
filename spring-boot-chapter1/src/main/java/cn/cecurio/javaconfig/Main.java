package cn.cecurio.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Cecurio
 * @create: 2017-10-16 9:28
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService =
            context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java config"));
        context.close();
    }
}
