package IO_Demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        File file = new File("src/abc.txt");
        //error code//File file = new File("IO_Demo/abc.txt");

        //创建文件
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //判断文件属性
        file.canRead();
        file.canWrite();
        file.canExecute();

        //判断当前文件是否存在
        System.out.println( file.exists());

        //获取文件的名称
        System.out.println(file.getName());
        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());
        //获取文件的父路径名称，如果文件路径中只包含文件名称，则显示空
        System.out.println(file.getParent());
        //返回此抽象路径名的规范形式
        System.out.println(file.getAbsoluteFile());
        //返回操作系统的分隔符
        System.out.println(File.separator);

        System.out.println("----------");

        //无论当前文件是否存在，只要给定具体的路径，都可以返回相应的路径名称
        File file1 = new File("D:/Java");
        //创建单级目录
        file1.mkdir();
        //创建多级目录
        file1.mkdirs();
        System.out.println(file1.getAbsoluteFile());
        //判断文件是否是目录和文件
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());//文件不存在也返回false

        System.out.println("----------");

        String[] list = file1.list();
        for (String str:list){
            System.out.println(list.toString());
        }

        System.out.println("----------");

        File[] files = file1.listFiles();
        for (File f:files){
            System.out.println(f);
        }

        System.out.println("----------");

        //打印当前文件系统的所有盘符
        File[] files2 = File.listRoots();
        for(int i = 0;i<files2.length;i++){
            System.out.println(files2[i]);
        }

        System.out.println("----------");

        //循环遍历输出C盘中所有的文件
        //使用递归
        printFile(new File("D:/Java/JavaPPT"));
    }

    //文件在遍历的时候，会出现空指针的问题，原因在于当前文件系统受保护，某些文件没有访问权限，此时会报空指针异常
    public static void printFile(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File f:files){
                printFile(f);
            }
        }else{
            //此文件是一个具体的文件
            System.out.println(file.getAbsoluteFile());
        }
    }
}
