package JavaThread.Other;

public class ThreadApiDemo implements Runnable{

    public static void main(String[] args) {
        //获取当前的线程对象
        Thread thread = Thread.currentThread();
        //获取对当前线程的名称
        System.out.println(thread.getName());
        //获取当前线程的Id
        System.out.println(thread.getId());
        //获取当前线程的优先级，在一般的系统中范围是0~10，如果没有经过设置的话，都是默认优先级为5，有些系统是0~100
        System.out.println(thread.getPriority());
        //设置线程池的优先级
        /**
         * 优先级越高不代表就一定先执行，
         * 只是先执行的概率比较大
         * */
        thread.setPriority(7);
        System.out.println(thread.getPriority());

        ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread thread1 = new Thread(threadApiDemo);
        System.out.println(thread1.isAlive());//false
        thread1.start();
        System.out.println(thread1.isAlive());//true
//        System.out.println(thread1.getPriority());
//        for (int i = 0 ;i<5;i++){
//            System.out.println(Thread.currentThread().getName()+"==="+i);
//        }
        System.out.println(thread1.isAlive());//true
    }

    @Override
    public void run() {
//        for (int i = 0 ; i < 5 ; i++){
//            System.out.println(Thread.currentThread().getName()+"---"+i);
//        }
    }
}
