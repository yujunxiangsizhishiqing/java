package JavaThread.Pc2;

/*
 * 多线程访问的时候出现了数据安全的问题
 *   1、生产者没有生产商品，消费者就可以获取
 *   2、商品的品牌和名称对应不上
 *
 * */
public class Test {

    public static void main(String[] args) {
        Goods goods = new Goods();

        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}
