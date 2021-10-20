package IO_Demo.ReadOrWriter;

import java.io.CharArrayWriter;

public class CharArrayWriterTest {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();

        charArrayWriter.write(97);
        charArrayWriter.write(98);
        charArrayWriter.write("de",0,2);
        charArrayWriter.append('h');
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}
