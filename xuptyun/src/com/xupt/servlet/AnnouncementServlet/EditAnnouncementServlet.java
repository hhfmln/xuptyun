package com.xupt.servlet.AnnouncementServlet;

import com.xupt.service.announcementService;
import com.xupt.domain.announcement;
import com.xupt.service.impl.announcementServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "EditAnnouncementServlet")
public class EditAnnouncementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try {
            int onlyid = Integer.parseInt(request.getParameter("onlyid"));

            announcementService service = new announcementServiceImpl();
            announcement ann = service.findAnnouncementById(onlyid);

            request.setAttribute("ann",ann);
            request.getRequestDispatcher("jsp/Announcement/edit.jsp").forward(request,response);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
