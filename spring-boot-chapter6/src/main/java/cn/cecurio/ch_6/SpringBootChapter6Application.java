package cn.cecurio.ch_6;

import cn.cecurio.ch_6.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootChapter6Application {

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    public String index() {
        return "name: " + authorSettings.getName()
            + ",age:" + authorSettings.getAge();
    }


	public static void main(String[] args) {
		//SpringApplication.run(SpringBootChapter6Application.class, args);
		SpringApplication app = new SpringApplication(SpringBootChapter6Application.class);
		app.setShowBanner(false);
		app.run(args);
	}
}
