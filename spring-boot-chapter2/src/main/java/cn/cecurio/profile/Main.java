package cn.cecurio.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Cecurio
 * @create: 2017-10-16 19:17
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("prod");

        context.register(ProfileConfig.class);

        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
