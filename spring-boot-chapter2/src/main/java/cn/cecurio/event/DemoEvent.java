package cn.cecurio.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author: Cecurio
 * @create: 2017-10-16 19:28
 * @desc:
 **/
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
