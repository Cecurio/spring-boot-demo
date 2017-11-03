package cn.cecurio.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Cecurio
 * @create: 2017-10-31 18:16
 * @desc:
 **/
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次 " + dateFormat.format(new Date()));
    }


    @Scheduled(cron = "0 29 18 ? * *")
    public void fixTimeExecutor() {
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + " 执行");
    }


}
