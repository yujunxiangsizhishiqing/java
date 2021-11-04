package pool.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C3P0Test {

    public static Connection connection;
    public static ComboPooledDataSource dataSource;

    public C3P0Test() {
    }

    public static void getConnection(){
        dataSource = new ComboPooledDataSource();
    }

    public static void queryData(){
        try {
            connection = dataSource.getConnection();
            String sql = "select * from emp";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet resultSet = pstmt.executeQuery();

            for (;resultSet.next();){
                System.out.println(resultSet.getString("ename"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
//        ComboPooledDataSource cpds = new ComboPooledDataSource();
//        cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
//        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/demo");
//        cpds.setUser("root");
//        cpds.setPassword("yj950627");
//
//        Connection connection = cpds.getConnection();
//        System.out.println(connection);
//        connection.close();

        getConnection();
        queryData();
    }
}
