package cn.cecurio.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: Cecurio
 * @create: 2017-10-16 14:00
 * @desc:
 **/
@Configuration
@ComponentScan("cn.cecurio.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
