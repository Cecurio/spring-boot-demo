package com.wisely.ch7_7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch77Application {

    @RequestMapping(value = "/search", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person search(String personName) {

        return new Person(personName, 32, "hefei");

    }

    @RequestMapping(value = "/loader", produces = {MediaType.TEXT_HTML_VALUE})
    public String getClassLoader() {
        ClassLoader loader = this.getClass().getClassLoader();
        StringBuilder ret = new StringBuilder();
        while(loader != null) {
            ret.append(loader.getClass().getName()+"<br/>");
            loader = loader.getParent();
        }
        ret.append(String.valueOf(loader));
        return ret.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch77Application.class, args);
    }
}
