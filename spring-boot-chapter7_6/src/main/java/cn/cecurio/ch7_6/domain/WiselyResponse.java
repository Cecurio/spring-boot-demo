package cn.cecurio.ch7_6.domain;

/**
 * @author: Cecurio
 * @create: 2017-11-04 20:27
 * @desc: 服务端向浏览器发送的此类的消息
 **/
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
