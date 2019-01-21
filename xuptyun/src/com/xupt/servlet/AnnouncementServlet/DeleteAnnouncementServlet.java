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

@WebServlet(name = "DeleteAnnouncementServlet")
public class DeleteAnnouncementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            int onlyid = Integer.parseInt(request.getParameter(("onlyid")));

            announcementService service = new announcementServiceImpl();
            service.delete(onlyid);

            request.getRequestDispatcher("announcementServlet").forward(request,response);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
