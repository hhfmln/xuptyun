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

@WebServlet(name = "UpdateAnnouncementServlet")
public class UpdateAnnouncementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("utf8");
        try {
            int onlyid = Integer.parseInt(request.getParameter("onlyid"));
            String announcement_name = request.getParameter("announcement_name");
            String announcement_content = request.getParameter("announcement_content");
            String gongneng = request.getParameter("gongneng");
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = df.format(new Date());

            announcement ann = new announcement(onlyid,announcement_name,date,announcement_content,gongneng);

            announcementService service = new announcementServiceImpl();
            service.update(ann);

            request.getRequestDispatcher("announcementServlet").forward(request,response);
        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
