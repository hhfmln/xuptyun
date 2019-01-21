<%--
  Created by IntelliJ IDEA.
  User: hhf
  Date: 19-1-21
  Time: 下午3:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加公告</title>
</head>
<body>
    <h3>添加公告</h3>
    <form method="post" action="AddAnnouncementServlet">
        <table border="1" width="600">
            <tr>
                <td>公告名称</td>
                <td><input type="text" name="announcement_name"></td>
            </tr>
            <tr>
                <td>公告内容</td>
                <td><input type="text" name="announcement_content"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="添加"></td>
            </tr>
        </table>
    </form>
</body>
</html>
