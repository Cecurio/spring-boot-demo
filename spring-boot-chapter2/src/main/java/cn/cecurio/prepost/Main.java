package cn.cecurio.prepost;

import cn.cecurio.el.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Cecurio
 * @create: 2017-10-16 16:50
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}
