<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/28 0028
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function deleteBook(bookNumber) {
            location.href = "/book/delete?bookNumber=" + bookNumber
        }

    </script>
</head>
<body>
<div>
    <div>
        <form action="/book/add" method="post">
            <input type="text" name="bookName" placeholder="请输入书籍名字">
            <input type="number" name="price" placeholder="请输入书籍价格">
            <input type="text" name="author" placeholder="请输入作者">
            <input type="number" name="skNumber" placeholder="请输入书库编号">
            <input type="submit" value="添加">
        </form>
    </div>

    <div>
        <h1>所有书籍</h1>
        <table>
            <tr>
                <td>书籍编号</td>
                <td>书籍名称</td>
                <td>借阅价格</td>
                <td>作者</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${requestScope.bookList}" var="book">
                <tr>
                    <td>${book.bookNumber}</td>
                    <td>${book.bookName}</td>
                    <td>${book.price}</td>
                    <td>${book.author}</td>
                    <td>
                        <button onclick="location.href = '/book/delete?bookNumber=${book.bookNumber}'">
                            删除
                        </button>
                    </td>
                </tr>

            </c:forEach>
        </table>
    </div>

</div>

</body>
</html>
