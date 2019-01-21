package com.xupt.servlet;

import com.xupt.service.UserService;
import com.xupt.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //提交的数据有可能有中文
        request.setCharacterEncoding("utf8");
        response.setContentType("text/html;charset=utf-8");


        try {
            //获取客户端提交的信息
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            //访问service,看看是否符合登录
            UserService service = new UserServiceImpl();
            boolean isSuccess = service.login(username,password);

            //针对service的结果做出反应
            if (isSuccess){
                System.out.println("成功");
            }
            else {
                response.getWriter().write("用户名或密码错误！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
