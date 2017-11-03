package cn.cecurio.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: Cecurio
 * @create: 2017-10-31 18:03
 * @desc:
 **/
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务: " + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1: " + (i+1));
    }


}
