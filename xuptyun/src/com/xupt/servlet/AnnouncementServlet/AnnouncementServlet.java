package com.xupt.servlet.AnnouncementServlet;

import com.xupt.service.announcementService;
import com.xupt.service.impl.announcementServiceImpl;

import com.xupt.domain.announcement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "AnnouncementServlet")
public class AnnouncementServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            announcementService service = new announcementServiceImpl();
            List<announcement> list = service.findAll();

            request.setAttribute("list",list);



            request.getRequestDispatcher("jsp/Announcement/announcement.jsp").forward(request,response);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }


}
