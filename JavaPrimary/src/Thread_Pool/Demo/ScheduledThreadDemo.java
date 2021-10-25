package Thread_Pool.Demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        //System.out.println(System.currentTimeMillis());
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延时3s执行");
                //System.out.println(System.currentTimeMillis());
            }
        }, 3,TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }

}
