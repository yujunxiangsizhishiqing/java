package IO_Demo.Stream;

import java.io.*;
/*
 * 将a.txt中的数据写入到b.txt中
 * 文件复制的过程
 */
public class OutputStreamDemo {
    public static void main(String[] args) {

        File file = new File("b.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(99);
            outputStream.write("\r\nwangxu".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
