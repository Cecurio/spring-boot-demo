package cn.cecurio.prepost;

/**
 * @author: Cecurio
 * @create: 2017-10-16 16:49
 * @desc:
 **/
public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
