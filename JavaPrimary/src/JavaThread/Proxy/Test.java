package JavaThread.Proxy;


/**
 * 代理设计模式
 * */
public class Test {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        wangPo.playWithMan();

        System.out.println("-----");

        JiaShi jiaShi = new JiaShi();
        WangPo wangPo1 = new WangPo(jiaShi);
        wangPo1.makeEyesWithMan();
        wangPo1.playWithMan();
    }
}
