package IO_Demo.ReadOrWriter;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        BufferedWriter bufferWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(new File("D:/临时/a.txt"));
            bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write(99);
            bufferWriter.write("abc");
            bufferWriter.newLine();
            bufferWriter.append("wangxu");
            bufferWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
