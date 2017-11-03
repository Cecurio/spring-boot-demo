package cn.cecurio.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @author: Cecurio
 * @create: 2017-10-16 15:27
 * @desc: 属性的注入
 **/
@Configuration
@ComponentScan("cn.cecurio.el")
@PropertySource("classpath:./test.properties")
public class ElConfig {
    @Value("I love you")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("https://www.baidu.com/")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Value("classpath:./test.txt")
    private Resource testFile;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println("bookName: " + bookName);
            //System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println("testFile:" + IOUtils.toString(testFile.getInputStream()));
            System.out.println(environment.getDefaultProfiles());
            System.out.println("book.author:" + environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
