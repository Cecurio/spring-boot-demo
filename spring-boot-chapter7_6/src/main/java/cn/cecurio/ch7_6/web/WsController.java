package cn.cecurio.ch7_6.web;

import cn.cecurio.ch7_6.domain.WiselyMessage;
import cn.cecurio.ch7_6.domain.WiselyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * @author: Cecurio
 * @create: 2017-11-04 20:30
 * @desc:
 **/
@Controller
public class WsController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if (principal.getName().equals("wyf")) {
            messagingTemplate.convertAndSendToUser("wisely",
                "/queue/notifications",
                principal.getName() + "-send: " + msg);
        } else {
            messagingTemplate.convertAndSendToUser("wyf",
                "/queue/notifications",
                principal.getName() + "-send: " + msg);
        }
    }


    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception {
        Thread.sleep(3000);
        return new WiselyResponse("Welcome, " + message.getName() + "!");
    }
}
