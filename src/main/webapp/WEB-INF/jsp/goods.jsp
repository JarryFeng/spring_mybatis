<%--
  Created by IntelliJ IDEA.
  User: jarry
  Date: 2017/10/31
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="query">
    <input type="submit" value="提交" />
    <table style="width: 100%;collapse: 2px;">
        <thead>
        <tr>
            <td>商品名称</td>
            <td>商品描述</td>
            <td>商品价格</td>
            <td>生产日期</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="goods" items="${hello}">
            <tr>
                <td>${goods.name}</td>
                <td>${goods.note}</td>
                <td>${goods.price}</td>
                <td><fmt:formatDate value="${goods.productDate}" pattern="yyyy-MM-dd" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</form>

</body>
</html>
