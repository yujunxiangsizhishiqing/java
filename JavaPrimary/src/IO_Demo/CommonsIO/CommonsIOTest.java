package IO_Demo.CommonsIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.util.Collection;

public class CommonsIOTest {

    public static void main(String[] args) {
        long len = FileUtils.sizeOf(new File("baidu.html"));
        System.out.println(len);

        Collection<File> files = FileUtils.listFiles(new File("D:/Java"),EmptyFileFilter.NOT_EMPTY,null);
        for (File file:files){
            System.out.println(file.getAbsolutePath());
        }
    }
}
