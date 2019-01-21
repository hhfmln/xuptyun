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
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "AddAnnouncementServlet")
public class AddAnnouncementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf8");
        try {
            String announcement_name = request.getParameter("announcement_name");
            String announcement_context = request.getParameter("announcement_content");

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = df.format(new Date());
            String gongneng = "off";
            announcement ann = new announcement(announcement_name,date,announcement_context,gongneng);
            announcementService service = new announcementServiceImpl();
            service.insert(ann);

            request.getRequestDispatcher("announcementServlet").forward(request,response);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
