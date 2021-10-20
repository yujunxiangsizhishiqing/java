package IO_Demo.ReadOrWriter;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        //printStream = new PrintStream(new FileOutputStream("a.txt"));
        PrintStream printStream = new PrintStream(System.out);

        try {
            printStream.write("ni hao wangxu".getBytes());
            printStream.println(true);
            System.out.println();
            //格式化输出 %s：字符串  %d:整数  %f:浮点数
            System.out.printf("%s--%d---%.2f","abcd",123,123.4444);
            System.err.println("wwwwwwwerror");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
