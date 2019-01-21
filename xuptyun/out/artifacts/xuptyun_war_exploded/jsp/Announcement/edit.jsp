<%--
  Created by IntelliJ IDEA.
  User: hhf
  Date: 19-1-21
  Time: 下午8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改公告内容</title>
</head>
<body>
    <h3>添加公告</h3>
    <form method="post" action="UpdateAnnouncementServlet">
        <input type="hidden" name="onlyid" value="${ann.onlyid}">
        <table border="1" width="600">
            <tr>
                <td>公告名称</td>
                <td><input type="text" name="announcement_name" value="${ann.announcement_name}"></td>
            </tr>
            <tr>
                <td>发布时间</td>
                <td><input type="text" name="announcement_time" value="${ann.announcement_time}"> </td>
            </tr>
            <tr>
                <td>公告内容</td>
                <td><input type="text" name="announcement_content" value="${ann.announcement_content}"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="更新"></td>
            </tr>
        </table>
    </form>
</body>
</html>
