package JavaThread.Pc;

/*
 * 生产产品，将产房放置到共享空间中
 * */
public class Producer implements Runnable{
    private Goods goods;

    public Producer(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            if (i%2==0){
                goods.setBrand("A");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("矿泉水");
            }else{
                goods.setBrand("B");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("小馒头");
            }
            System.out.println("消费者取走了"+this.goods.getBrand()+this.goods.getName());

        }
    }
}
