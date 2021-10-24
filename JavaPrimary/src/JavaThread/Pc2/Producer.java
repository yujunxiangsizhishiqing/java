package JavaThread.Pc2;

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
                goods.set("A","矿泉水");
            }else{
                goods.set("B","小馒头");
            }
        }
    }
}
