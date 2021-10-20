package IO_Demo.ReadOrWriter;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest {

    public static void main(String[] args) {
        char[] chars = "wangxu".toCharArray();
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        try {
            int read = 0;
            for (;(read = charArrayReader.read()) != -1;){
                System.out.println((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            charArrayReader.close();
        }
    }
}
