<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/28
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script  type="text/javascript"  src="statics/js/jquery-1.8.3.min.js"></script>

</head>
<body>
<div id="div"></div>
<button id="button">点击</button>
<script>
    $(function () {
        var  $button=$("#button");
        $button.bind("click",function () {
            $.get("/getUser.html",function (data) {
                alert(data.length);
                for (var i=0;i<data.length;i++){
                    $("#div").html(data[i]);
                }

            },"json");
        })
    })
    

</script>
</body>
</html>
