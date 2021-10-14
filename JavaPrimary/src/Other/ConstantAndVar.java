package Other;

public class ConstantAndVar {
    static int d ;
    public static void main(String[] args){
        //声明
        int a;
        //赋值
        a =10;
        //声明+赋值
        //int b = 20;
        //int c;
        //System.out.println(d);
        //int x=10,y=20;

        System.out.println(a);
        a=30;
        System.out.println(a);
        final int c = 20;
        System.out.println(c);
        //error c=30;//final
        System.out.println(c);

    }
}
