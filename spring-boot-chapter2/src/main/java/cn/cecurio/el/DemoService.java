package cn.cecurio.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author: Cecurio
 * @create: 2017-10-16 15:25
 * @desc:
 **/
@Service
public class DemoService {
    @Value("注入普通字符串")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
