<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username" value=""></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" name="submit" value="登录"></td>
            </tr>
        </table>
    </form>
    <span>${msg}</span>
</body>
</html>
