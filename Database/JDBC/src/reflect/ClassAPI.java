package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassAPI {

    public static void main(String[] args) throws Exception {
        //获取成员变量,包括子类及父类，同时只能包含公共(public)的方法
        Class<?> aClass = Class.forName("reflect.Student");

        Field[] fields = aClass.getFields();
        for (Field field:fields){
            System.out.println("----------");
            System.out.println(field);
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());
        }

        System.out.println("~~~~~~~~~~~~");

        //此方法返回的是当前类的所有属性，不仅仅局限于公共访问修饰符，所有的访问修饰符都可以拿到
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        System.out.println("~~~~~~~~~~~~");

        //反射在一定程度上破坏了封装性，需要合理使用
        Field address = aClass.getDeclaredField("address");
        //设置该属性是否能被访问，true表示能被访问，破坏了封装性
        address.setAccessible(true);
        System.out.println(address.getName());
        Object o = aClass.newInstance();
        address.set(o,"安徽");
        System.out.println(((Student)o).getAddress());

        System.out.println("~~~~~~~~~~~~");

        //获取该对象的普通方法,包含的方法范围是当前对象及父类对象的所有公共方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            //System.out.println(method);
            System.out.println(method.getName());
            //System.out.println(method.getModifiers());
            //System.out.println(method.getGenericReturnType());
        }

        System.out.println("~~~~~~~~~~~~");

        //获取当前类中所有的方法，无论什么访问修饰符
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        System.out.println("~~~~~~~~~~~~");
        Method add = aClass.getDeclaredMethod("add", int.class, int.class);
        Object o1 = aClass.newInstance();
        add.setAccessible(true);
        add.invoke(o1,10,20);

        System.out.println("~~~~~~~~~~~~");

        //获取对象的所有构造方法，只能获取公有的改造方法
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }

        System.out.println("~~~~~~~~~~~~");

        //获取所有的构造方法，无论是私有还是公有
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }

        System.out.println("~~~~~~~~~~~~");

        //调用私有的构造方法
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, String.class);
        declaredConstructor.setAccessible(true);
        Object o2 = declaredConstructor.newInstance("wangxu", 24, "hahahah");
        //Student o2 = (Student)declaredConstructor.newInstance("wangxu", 24, "hahahah");
        System.out.println(o2);
    }
}
