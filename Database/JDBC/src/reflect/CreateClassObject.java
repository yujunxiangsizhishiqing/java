package reflect;

import entity.Emp;

public class CreateClassObject {

    public static void main(String[] args) throws Exception {
        //1、通过class.forname()来获取Class对象
        Class aClass = Class.forName("entity.Emp");
        System.out.println(aClass.getPackage());
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getCanonicalName());

        System.out.println("---------");

        //2、通过类名.class来获取
        Class<Emp> empClass = Emp.class;
        System.out.println(aClass.getPackage());
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getCanonicalName());

        System.out.println("---------");

        //3、通过对象的getClass()来获取,
        /**
         * 不推荐！！！
         */
        Class aClass1 = new Emp().getClass();
        System.out.println(aClass.getPackage());
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getCanonicalName());

        System.out.println("---------");

        //4、如果是一个基本数据类型，那么可以通过Type的方式来获取Class对象
        Class type = Integer.TYPE;
        System.out.println(type.getName());
        System.out.println(type.getCanonicalName());
    }
}
