package Thread_Pool.Demo;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+"running");
    }
}
