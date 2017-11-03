package cn.cecurio.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * @author: Cecurio
 * @create: 2017-10-31 18:25
 * @desc:
 **/
@Component
@ComponentScan("cn.cecurio.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
