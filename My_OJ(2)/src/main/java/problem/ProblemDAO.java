
package problem;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

// DAO 数据访问对象
// 主要是包含一些增删改查方法, 用来操作数据库
// 进而进行题目的相关操作
public class ProblemDAO {
    // 往数据库插入一条记录
    public void insert(Problem problem) {
        // 1. 和数据库建立连接
        Connection connection = DBUtil.getConnection();
        PreparedStatement statement = null;
        try {
            // 2. 拼装 SQL 语句
            String sql = "insert into oj_table values(null, ?, ?, ?, ?, ?);";
            statement = connection.prepareStatement(sql);
            statement.setString(1, problem.getTitle());
            statement.setString(2, problem.getLevel());
            statement.setString(3, problem.getDescription());
            statement.setString(4, problem.getTemplateCode());
            statement.setString(5, problem.getTestCode());
            // 3. 执行 SQL
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection, statement, null);
        }
    }

    // 从数据库删除一条记录
    public void delete(int problemId) {

    }

    // 查找全部题目(用来实现题目列表页)
    // 只需要查找 Problem 的一部分字段即可
    // id title level
    // 正常来说, 一个系统的 "查找全部操作" 一般都得支持分页查询.
    // 不分页的话, 数据量可能会比较大, 影响程序的效率
    // 当前并不考虑实现分页查询. 后端实现分页是非常容易的
    // SQL 中本来就有 limit offset 这样的基础支持
    // 但是前端实现分页不太好写
    public List<Problem> selectAll() {
        return  null;
    }

    // 查找指定题目(用来实现题目详情页)
    // 需要把 Problem 每个字段都查询出来
    public Problem selectOne(int problemId) {

        return null;
    }

    private static void testInsert() {
        Problem problem = new Problem();
        problem.setId(1);
        problem.setTitle("两数之和");
        problem.setLevel("简单");
        problem.setDescription("给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。\n" +
                "\n" +
                "你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。\n" +
                "\n" +
                "你可以按任意顺序返回答案。\n" +
                "\n" +
                " \n" +
                "\n" +
                "示例 1：\n" +
                "\n" +
                "输入：nums = [2,7,11,15], target = 9\n" +
                "输出：[0,1]\n" +
                "解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。\n" +
                "示例 2：\n" +
                "\n" +
                "输入：nums = [3,2,4], target = 6\n" +
                "输出：[1,2]\n" +
                "示例 3：\n" +
                "\n" +
                "输入：nums = [3,3], target = 6\n" +
                "输出：[0,1]\n" +
                " \n" +
                "\n" +
                "提示：\n" +
                "\n" +
                "2 <= nums.length <= 103\n" +
                "-109 <= nums[i] <= 109\n" +
                "-109 <= target <= 109\n" +
                "只会存在一个有效答案\n" +
                "\n" +
                "来源：力扣（LeetCode）\n" +
                "链接：https://leetcode-cn.com/problems/two-sum\n" +
                "著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。");
        problem.setTemplateCode("class Solution {\n" +
                "    public int[] twoSum(int[] nums, int target) {\n" +
                "\n" +
                "    }\n" +
                "}");
        problem.setTestCode("    public static void main(String[] args) {\n" +
                "        Solution solution = new Solution();\n" +
                "        int[] arr = {2,7,11,15};\n" +
                "        int target = 9;\n" +
                "        int[] result = solution.twoSum(arr, 9);\n" +
                "        if (result.length == 2 && result[0] == 1 && result[1] == 2) {\n" +
                "            System.out.println(\"TestCase OK!\");\n" +
                "        } else {\n" +
                "            System.out.println(\"TestCase Failed! arr: {2, 7, 11, 15}, target: 9\");\n" +
                "        }\n" +
                "\n" +
                "        int[] arr2 = {3,2,4};\n" +
                "        int target2 = 6;\n" +
                "        int[] result2 = solution.twoSum(arr2, target2);\n" +
                "        if (result2.length == 2 && result2[0] == 1 && result2[1] == 2) {\n" +
                "            System.out.println(\"TestCaseOK!\");\n" +
                "        } else {\n" +
                "            System.out.println(\"TestCaseFailed!\");\n" +
                "        }\n" +
                "    }\n");
        ProblemDAO problemDAO = new ProblemDAO();
        problemDAO.insert(problem);
    }

    private static void testDelete() {
        ProblemDAO problemDAO = new ProblemDAO();
        problemDAO.delete(1);
    }

    private static void testSelectAll() {
        ProblemDAO problemDAO = new ProblemDAO();
        List<Problem> problems = problemDAO.selectAll();
        System.out.println(problems);
    }

    private static void testSelectOne() {
        ProblemDAO problemDAO = new ProblemDAO();
        Problem problem = problemDAO.selectOne(1);
        System.out.println(problem);
    }

    public static void main(String[] args) throws SQLException{
        // 1. 先测试一下插入逻辑
        testInsert();
        // 2. 测试删除逻辑
        // testDelete();
        // 3. 测试查找所有记录
        // testSelectAll();
        // 4. 验证查询一条记录
        // testSelectOne();
    }
}
