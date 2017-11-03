package cn.cecurio.spring_boot_starter_hello;

/**
 * @author: Cecurio
 * @create: 2017-11-03 19:21
 * @desc:
 **/
public class HelloService {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String sayHello() {
        return "hello" + msg;
    }
}
