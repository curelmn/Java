package util;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

    static  String driver="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://127.0.0.1:3306/my_oj?characterEncoding=utf8&useSSL=false";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";

    private static DataSource dataSource=null;
    private static DataSource getDataSource(){
        if (dataSource ==null){
            dataSource=new MysqlDataSource();
            ((MysqlDataSource) dataSource).setUrl(URL);
            ((MysqlDataSource) dataSource).setUser(USERNAME);
            ((MysqlDataSource) dataSource).setPassword(PASSWORD);
        }
        return dataSource;
    }

    public static Connection getConnection(){
        try {
            return (Connection) getDataSource().getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet){
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null){
            try {
               connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
