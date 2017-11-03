package cn.cecurio.di;

import org.springframework.stereotype.Service;

/**
 * @author: Cecurio
 * @create: 2017-10-16 9:22
 * @desc:
 **/
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello, " + word + " !";
    }
}
