<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/26 0026
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
    <link rel="stylesheet" href="../static/css/student.css" type="text/css">
</head>
<body>
<div class="div_body">
    <table>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>班级</th>
            <th>jsNumber</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${requestScope.studentList}" var="student">
            <tr>
                <td class="td">${student.sno}</td>
                <td>${student.sn}</td>
                <td>${student.age}</td>
                <td>${student.className}</td>
                <td>${student.jsNumber}</td>
                <td>
                    <button>增加</button>
                    <button> 删除</button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
