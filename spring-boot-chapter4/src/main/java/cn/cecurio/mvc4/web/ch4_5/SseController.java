package cn.cecurio.mvc4.web.ch4_5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * @author: Cecurio
 * @create: 2017-11-02 17:39
 * @desc:
 **/
@Controller
public class SseController {
    @RequestMapping(value = "/push", produces ="text/event-stream")
    @ResponseBody
    public String push() {
        Random r = new Random();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "data: Test 1,2,3 " + r.nextInt() + "\n\n";
    }
}
