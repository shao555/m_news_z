<%--
  Created by IntelliJ IDEA.
  User: 15278
  Date: 2020/11/1
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/show.css" rel="stylesheet" type="text/css" />

    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {

            // var path = $("#path").val();
            // $("table").attr("bgColor", "#FFFFFF"); //设置表格的背景颜色
            // $("tr").attr("bgColor", "#B6B6B6"); //为单数行表格设置背景颜色
            // $("tr:even").css("background-color", "#9A9A9A"); //为双数行表格设置背颜色素

            $.get({url:"cate",dataType:'json',success:cate});
            $.get({url:"show",dataType:'json',success:information});

            $("#submit").click(function () {
                select = $("#select").val();
                title = $("#title").val();
                $.get({url:"findByTitle",async: true,data:{'select':select,'title':title},dataType:'json',success:information});
            });

            function information(data1) {
                var $mytab = $("#mytab");
                if ($("#mytab tr").length>2){
                    while ($("#mytab tr").length>2){
                        $("#mytab tr").eq(2).remove();
                    }
                }
                for (var i = 0; i < data1.length; i++) {
                    var link = '${pageContext.request.contextPath}/update?id='+data1[i].id;
                    $mytab.append("<tr><td>"+data1[i].id+"</td><td>"+data1[i].title+"</td><td>"+
                        data1[i].summary+"</td><td>"+data1[i].author+"</td><td>"+data1[i].createDate+"</td><td><a href='"+link+"'>"+'修改'+"</a>")
                }
            }
            function cate(data2) {
                var $select = $("#select");
                for (var i = 0; i <data2.length ; i++) {
                    $select.append("<option value='"+data2[i].id+"'>"+data2[i].name+"</option>");
                }
            }
        });
    </script>
</head>
<body>
<%--<input type="hidden" id="path" name="path" value="${pageContext.request.contextPath}"/>--%>
<form>
    <p align="center">新闻分类：
        <select name="select" id="select">
            <option value="0">全部</option>
<%--            <c:forEach items="${clist}" var="c">--%>
<%--                <option value=${c.id}>${c.name}</option>--%>
<%--            </c:forEach>--%>
        </select>
        新闻标题：<input type="text" id="title" name="title"> <input type="button" id="submit" value="查询"></p>
</form>
<table align="center" border="1px" id="mytab">
    <tr>
        <td colspan="7" align="center"><h1>新闻列表</h1></td>
    </tr>
    <tr>
<%--        <td>记录数</td>--%>
        <td>新闻编号</td>
        <td>新闻标题</td>
        <td>新闻摘要</td>
        <td>作者</td>
        <td>创建时间</td>
        <td>操作</td>
    </tr>
<%--    <c:forEach items="${list}" var="n">--%>
<%--        <tr>--%>
<%--            <td>${n.id}</td>--%>
<%--            <td>${n.title}</td>--%>
<%--            <td>${n.summary}</td>--%>
<%--            <td>${n.author}</td>--%>
<%--            <td>${n.createDate}</td>--%>
<%--            <td><a href="${pageContext.request.contextPath}/update?id=${n.id}">修改</a></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
</table>
</body>
</html>
