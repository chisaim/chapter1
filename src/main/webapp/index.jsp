<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head></head>
<body>
<form action="/world.do" method="post">
    hello:<input type="text" name="world">
    <input type="submit" value="submit">
</form>
<h2>${helloworld}</h2>
<a href="/user.do">根据beanName访问Controller</a><br/>
<a href="/userInfo.do">根据Url访问userController</a><br/>
<a href="/helloInfo.do">根据Url访问helloController</a><br/>
<a href="/worldInfo.do">根据Url访问worldController</a><br/>
<a href="/helloController.do">根据类名访问HelloController</a>
<br/>
<a href="/user/list.do">查询</a><br/>
<form action="/user/add.do" method="post">
    <input name="username" type="text">
    <input type="submit" value="submit">
</form>
<a href="/user/update.do">修改</a>
</body>
</html>
