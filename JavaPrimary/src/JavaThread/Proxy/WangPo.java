package JavaThread.Proxy;

public class WangPo implements KindWoman{

    private KindWoman kindWoman;

    public WangPo(){
        this.kindWoman = new PanJinLian();
    }

    public WangPo(KindWoman kindWoman){
        this.kindWoman = kindWoman;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWoman.makeEyesWithMan();
    }

    @Override
    public void playWithMan() {
        this.kindWoman.playWithMan();
    }
}
