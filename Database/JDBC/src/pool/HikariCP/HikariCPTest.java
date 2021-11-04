package pool.HikariCP;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;

public class HikariCPTest {
    public static void main(String[] args) throws Exception {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://localhost:3306/demo");
//        config.setUsername("root");
//        config.setPassword("yj950627");
//        HikariDataSource ds = new HikariDataSource(config);
//        Connection connection = ds.getConnection();
//        System.out.println(connection);
//        connection.close();

//        HikariDataSource hikariDataSource = new HikariDataSource();
//        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/demo");
//        hikariDataSource.setUsername("root");
//        hikariDataSource.setPassword("yj950627");
//        Connection connection1 = hikariDataSource.getConnection();
//        System.out.println(connection1);
//        connection1.close();

        HikariConfig config = new HikariConfig("src/pool/HikariCP/HikariCP.properties");
        HikariDataSource hikariDataSource = new HikariDataSource(config);
        Connection connection2 = hikariDataSource.getConnection();
        System.out.println(connection2);
        connection2.close();

    }
}
