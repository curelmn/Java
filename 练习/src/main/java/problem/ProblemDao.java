package problem;

import com.mysql.jdbc.Connection;
import util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProblemDao {
    public void insert(Problem problem){
      Connection connection= DBUtil.getConnection();
        PreparedStatement statement=null;

        try {
            String sql="insert into oj_table values(null,?,?,?,?,?)";
            statement=connection.prepareStatement(sql);
            statement.setString(1,problem.getTitle());
            statement.setString(1,problem.getLevel());
            statement.setString(1,problem.getDescription());
            statement.setString(1,problem.getTemplateCode());
            statement.setString(1,problem.getTestCode());

            statement.executeQuery();

        } catch (SQLException e) {
           e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,null);
        }

    }
}
