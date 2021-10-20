package IO_Demo.ReadOrWriter;

import java.io.*;

public class BufferReaderTest {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("D:/临时/a.txt"));
            try {
                String read = reader.readLine();
                System.out.println(read);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
