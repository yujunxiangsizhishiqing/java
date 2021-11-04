package dao.impl;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDaoImpl {

    public static void insertBatch(){
        Connection connection = DBUtil.getConnection();
        String sql = "insert into emp(empno,ename) values(?,?)";
        PreparedStatement preparedStatement = null;
        //准备预处理快对象
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i=0;i<10;i++){
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2,"batch"+i);
                //向批处理中添加sqk语句
                preparedStatement.addBatch();

            }
            int[] ints = preparedStatement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.closeConnection(connection,preparedStatement);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        insertBatch();
        System.out.println("耗时： "+(System.currentTimeMillis()-start)+"ms");
    }
}
