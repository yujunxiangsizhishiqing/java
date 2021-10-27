package Lambda;

import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("running1");
//            }
//        });
//        thread.start();
//
//        new Thread(()->{System.out.println("running2");}).start();

    List<String> list = Arrays.asList("abcde","ab","a","abc");
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
//        for (String str:list){
//            System.out.println(str);
//        }

        Collections.sort(list,(a,b)->a.length()-b.length());
        list.forEach(System.out::println);
    }
}
