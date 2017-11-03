package cn.cecurio.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Cecurio
 * @create: 2017-10-31 18:59
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(System.getProperty("os.name"));
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令是 " + listService.showListCmd());

        context.close();

    }
}
