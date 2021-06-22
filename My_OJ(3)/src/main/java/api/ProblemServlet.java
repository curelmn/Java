package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import problem.Problem;
import problem.ProblemDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/problem")
public class ProblemServlet extends HttpServlet {
    private Gson gson=new GsonBuilder().create();
    //用来实现读取题目列表和读取题目详情
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.setContentType("application/json;charset=utf-8");

        //从req对象中读取id
        String id=req.getParameter("id");
        if (id==null||id.equals("")){
            //查找题目列表
            selectALL(resp);
        }else {
            //查找指定题目详情
            selectOne(Integer.parseInt(id),resp);
        }
    }

    private void selectOne(int problemId, HttpServletResponse resp) throws IOException {
        //1.创建 ProblemDAO对象
        ProblemDAO problemDAO=new ProblemDAO();
        //2.查找结果
        Problem problem=ProblemDAO.selectOne(problemId);
        //3.把结果给包装成JSON格式
        String respString = gson.toJson(problem);
        //4.把结果协会给前端
        resp.getWriter().write(respString);
    }

    private void selectALL(HttpServletResponse resp) throws IOException {
        //1.创建 ProblemDAO对象
        ProblemDAO problemDAO=new ProblemDAO();
        //2.查找所以结果
        List<Problem> problems=ProblemDAO.selectAll();
        //3.把结果给包装成JSON格式
         String respString = gson.toJson(problems);
         //4.把结果协会给前端
        resp.getWriter().write(respString);
    }
}
