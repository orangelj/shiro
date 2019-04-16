<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<body>
您好：
<shiro:authenticated>
    <shiro:principal/>
</shiro:authenticated>
<shiro:notAuthenticated>
    您还未<a href="login.jsp">登陆</a>，登陆之后浏览更多精彩内容！
</shiro:notAuthenticated>



</body>
</html>
