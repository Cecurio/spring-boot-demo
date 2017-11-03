package cn.cecurio.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * @author: Cecurio
 * @create: 2017-10-16 19:38
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("hello application event!");
        System.out.println(new Date());

        try {
            Thread.sleep(10000);
            demoPublisher.publish("hello application event2!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(new Date());

        context.close();
    }
}
