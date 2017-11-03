package cn.cecurio.javaconfig;

/**
 * @author: Cecurio
 * @create: 2017-10-16 9:24
 * @desc:
 **/
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
