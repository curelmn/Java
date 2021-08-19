package problem;

import com.mysql.jdbc.Connection;
import util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProblemDao {
    public void insert(Problem problem){
      Connection connection= DBUtil.getConnection();
        PreparedStatement statement=null;

        try {
            String sql="insert into oj_table values(null,?,?,?,?,?)";
            statement=connection.prepareStatement(sql);
            statement.setString(1,problem.getTitle());
            statement.setString(2,problem.getLevel());
            statement.setString(3,problem.getDescription());
            statement.setString(4,problem.getTemplateCode());
            statement.setString(5,problem.getTestCode());

            statement.executeQuery();

        } catch (SQLException e) {
           e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,null);
        }

    }

    public void delete(int problemId){
        Connection connection=DBUtil.getConnection();
        PreparedStatement statement=null;
        String sql="delete from oj_table where id=?";
        try {
            statement=connection.prepareStatement(sql);
            statement.setInt(1,problemId);
            statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,null);
        }
    }

    public static List<Problem> selectAll(){
        List<Problem> problems=new ArrayList<>();
        Connection connection=DBUtil.getConnection();
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        String sql="select id,title,level from oj_table;";
        try {
            statement=connection.prepareStatement(sql);

            resultSet=statement.executeQuery();

            while (resultSet.next()){
                Problem problem=new Problem();
                problem.setId(resultSet.getInt("id"));
                problem.setTitle(resultSet.getString("title"));
                problem.setLevel(resultSet.getString("level"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return problems;
    }

    public static Problem selectOne(int problemId){
        Connection connection=DBUtil.getConnection();
        String sql="select *from oj_table where id=?";
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        try {
            statement=connection.prepareStatement(sql);
            statement.setInt(1,problemId);
            resultSet=statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }
}
