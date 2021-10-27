package Lambda.WhyUseLambda;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("wangxu",20,60));
        list.add(new Student("wangwenhao",21,61));
        list.add(new Student("ljj",22,330));
        list.add(new Student("qiwei",35,66));

        //查找年龄大于21的学生
        findByAge(list);

        System.out.println("-----");

        //查找分数大于60的学生
        findByScore(list);
    }

    //查找年龄大于21的学生
    public static void findByAge(ArrayList<Student> students){
        ArrayList<Student> list = new ArrayList<>();
        for (Student stu:students){
            if (stu.getAge()>21){
                list.add(stu);
            }
        }
        for (Student student:list){
            System.out.println(student.getName());
        }
    }

    //查找分数大于61的学生
    public static void findByScore(ArrayList<Student> students){
        ArrayList<Student> list = new ArrayList<>();
        for (Student stu:students){
            if (stu.getScore()>60){
                list.add(stu);
            }
        }
        for (Student student:list){
            System.out.println(student.getName());
        }
    }
}
