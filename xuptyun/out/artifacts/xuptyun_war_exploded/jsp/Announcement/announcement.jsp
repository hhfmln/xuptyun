<%--
  Created by IntelliJ IDEA.
  User: hhf
  Date: 19-1-21
  Time: 上午11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>公告页面</title>
    <script type="text/javascript">

        function doDelete(onlyid) {
            /*如果这里弹出的对话框，用户点击的是确定，就马上去请求Servlet。
            如何知道用户点击的是确定
            如何在js的方法中请求servlet
             */
            var flag = confirm("是否确定删除");
            if(flag){
                //表明点了确定.访问servlet.在当前标签页上打开超链接,
                window.location.href="DeleteAnnouncementServlet?onlyid="+onlyid;
                location.href="DeleteAnnouncementServlet?onlyid="+onlyid;
            }
        }
    </script>
</head>
<body>
    <h3>公告列表</h3>
    <table border="1" width="1000">
        <tr align="center">
            <td colspan="8">
                <a href="AddAnnouncement.jsp">添加</a>
            </td>
        </tr>
        <tr align="center">
            <td>编号</td>
            <td>公告名称</td>
            <td>公告发布时间</td>
            <td>公告内容</td>
        </tr>
        <c:forEach items="${list}" var="ann">
            <tr align="center">
                <td>${ann.onlyid}</td>
                <td>${ann.announcement_name}</td>
                <td>${ann.announcement_time}</td>
                <td>${ann.announcement_content}</td>
                <td><a href="EditAnnouncementServlet?onlyid=${ann.onlyid}">更新</a> <a href="#" onclick="doDelete(${ann.onlyid})">删除</a> </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
