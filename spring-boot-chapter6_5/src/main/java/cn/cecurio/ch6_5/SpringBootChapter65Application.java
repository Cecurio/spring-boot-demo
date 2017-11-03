package cn.cecurio.ch6_5;

import cn.cecurio.spring_boot_starter_hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootChapter65Application {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String index() {
        return helloService.sayHello();
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootChapter65Application.class, args);
	}
}
