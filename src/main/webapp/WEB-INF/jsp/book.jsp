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
        function borrow(bookNumber) {
            location.href = "/book/borrow?bookNumber=" + bookNumber
        }
    </script>
</head>
<body>
<div style="display:flex; justify-content: center">
    <div>

    </div>

    <div style="width: 50%">
        <h1>所有书籍</h1>
        <table>
            <tr>
                <td>书籍编号</td>
                <td>书籍名称</td>
                <td>借阅价格</td>
                <td>作者</td>
                <td>书库位置</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${requestScope.bookList}" var="book">
                <tr>
                    <td>${book.bookNumber}</td>
                    <td>${book.bookName}</td>
                    <td>${book.price}</td>
                    <td>${book.author}</td>
                    <td>
                        <button onclick="'location.href = /book/borrow?bookNumber=${book.bookNumber}'">
                            借书
                        </button>
                    </td>
                </tr>

            </c:forEach>
        </table>
    </div>
    <div style="width: 50%">
        <h1>目前所借的书籍</h1>
        <table>
            <tr>
                <td>借书编号</td>
                <td>书籍名称</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${requestScope.borrowList}" var="borrow">
                <tr>
                    <td>${borrow.jsNumber}</td>
                    <td>${borrow.bookNumber}</td>
                    <td>
                        <input type="submit" onclick="location.href = '/book/back?bookNumber=${book.jsNumber}"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>
