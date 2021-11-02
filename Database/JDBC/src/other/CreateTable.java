package other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 当执行DDL语句的时候，不会返回对应的结果
 * */
public class CreateTable {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "yj950627");

        Statement statement = connection.createStatement();
        String sql = "create table psn(id number(10) primary key ,name varchar2(10))";
        boolean execute = statement.execute(sql);
        System.out.println(execute);//false
        statement.close();
        connection.close();
    }
}
