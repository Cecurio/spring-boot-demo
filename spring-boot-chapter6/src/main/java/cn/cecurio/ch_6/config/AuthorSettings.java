package cn.cecurio.ch_6.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: Cecurio
 * @create: 2017-11-02 21:32
 * @desc:
 **/
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
