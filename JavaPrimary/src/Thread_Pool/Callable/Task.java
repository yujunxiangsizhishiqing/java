package Thread_Pool.Callable;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    @Override
    public String call() throws Exception {
        //Thread.sleep(300);
        return Thread.currentThread().getName()+" "+"is running";
    }
}
