<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/27 0027
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>图书管理系统</title>
    <script type="text/javascript">
        function student() {
            var name = document.getElementsByName("name")
            var password = document.getElementsByName("password")
            document.form.action = "/student/login?name=" + name + "$password" + password
            document.form.submit();
        }

        function master() {
            var name = document.getElementsByName("name")
            var password = document.getElementsByName("password")
            document.form.action = "/master/login?name=" + name + "$password" + password
            document.form.submit();
        }
    </script>
</head>
<body>
<h1>图书管理系统</h1>
<form name="form" methed="post">
    <table>

        <tr>
            <td>选择身份登录：</td>
            <td><input type="text" name="name"></td>
            <td><input type="text" name="password"></td>
            <td><input type="button" name="job" value="学生登录 " onclick="student();">
                <input type="button" name="job" value="管理员登录  " onclick="master();"></td>
        </tr>
    </table>
</form>
</body>
</html>