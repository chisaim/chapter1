<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head></head>
<body>
<form action="/world.do" method="post">
    hello:<input type="text" name="world">
    <input type="submit" value="submit">
</form>
<hr>
<a href="/user.do">根据beanName访问Controller</a><br/>
<a href="/userInfo.do">根据Url访问userController</a><br/>
<a href="/helloInfo.do">根据Url访问helloController</a><br/>
<a href="/worldInfo.do">根据Url访问worldController</a><br/>
<a href="/helloController.do">根据类名访问HelloController</a>
<hr>
<a href="/user/list.do">查询</a><br/>
<form action="/user/add.do" method="post">
    <input name="username" type="text">
    <input type="submit" value="submit">
</form>
<a href="/user/update.do">修改</a>
<hr>
<form action="/user/add1.do" method="post">
    <h4>HttpServletRequest</h4>
    用户编号：<input type="text" name="userid">
    用户名：<input type="text" name="username">
    用户日期：<input type="text" name="usertime">
    <input type="submit" value="submit">
</form>
<hr>
<form action="/user/add2.do" method="post">
    <h4>ModelAndView</h4>
    用户编号：<input type="text" name="userid">
    用户名：<input type="text" name="username">
    用户日期：<input type="text" name="usertime">
    <input type="submit" value="submit">
</form>
<hr>
<form action="/user/add3.do" method="post">
    <h4>Model</h4>
    用户编号：<input type="text" name="userid">
    用户名：<input type="text" name="username">
    用户日期：<input type="text" name="usertime">
    <input type="submit" value="submit">
</form>
<hr>
<form action="/user/add4.do" method="post">
    <h4>Map</h4>
    用户编号：<input type="text" name="userid">
    用户名：<input type="text" name="username">
    用户日期：<input type="text" name="usertime">
    <input type="submit" value="submit">
</form>

</body>
</html>
