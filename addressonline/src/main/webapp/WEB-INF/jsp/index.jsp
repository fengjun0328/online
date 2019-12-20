<i><%@page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%
        String path = request.getContextPath();
        request.setAttribute("path", path);
    %> <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
    <html>
    <head>
        <title>首页</title>
    </head>
    <body>
    <div>
        <h1>在线通讯录</h1>
    </div>
    <div>
        <form action="/contact/load.html" method="get" id="myForm">
            查找联系人：<input name="cname" id="cname"><input type="submit"
                                                        value="查找">
        </form>
        &nbsp;&nbsp;<a href="${path}/add.html">添加联系人</a>
    </div>
    <div>
        count:${count}
        <c:if test="${count>0}">
            <table>
                <tr>
                    <td>序号</td>
                    <td>姓名</td>
                    <td>手机</td>
                    <td>QQ</td>
                    <td>Email</td>
                    <td>地址</td>
                </tr>

                <c:forEach items="${contacts}" var="contact">
                    <tr>
                        <td>${contact.id}</td>
                        <td><a href="#">${contact.cname}</a></td>
                        <td>${contact.mobile}</td>
                        <td>${contact.qq}</td>
                        <td>${contact.email}</td>
                        <td>${contact.address}</td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="6">
                        <c:if test="${currNo!=1}">
                            <a href="/contact/load.html?currNo=1">首页</a>
                            <a href="/contact/load.html?currNo=${currNo-1}">上一页</a>
                        </c:if>
                        <c:if test="${currNo!=count}">
                            <a href="/contact/load.html?currNo=${currNo+1}">下一页</a>
                            <a href="/contact/load.html?currNo=${count}">尾页</a>
                    </c:if> 第${currNo}页/共${count}页</td>
                </tr>
            </table>
        </c:if>
        <c:if test="${count==0}">
            没有找到${cname}相关的联系人
        </c:if>
    </div>
    </body>

    </html> </i>