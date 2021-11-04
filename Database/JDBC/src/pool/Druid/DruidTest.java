package pool.Druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DruidTest {

    public static void main(String[] args) throws Exception {
        //DruidDataSource druidDataSource = new DruidDataSource();
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/pool/Druid/druid.properties");
        properties.load(fileInputStream);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        System.out.println(dataSource);
    }
}
