<%--
  Created by IntelliJ IDEA.
  User: diptopol
  Date: 8/29/13
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url var="head" value="header.jsp"/>

<jsp:include page="${head}">
    <jsp:param name="title" value="logInForm" />
</jsp:include>

<form id="login" method="post" action="<c:url value="logInSubmission"/>">
    <table border="0" id="login_table">
        <tr>
            <td><label for="username_input">Username:</label></td>

            <td><input type="text" name="userName" id="username_input"/></td>

        </tr>
        <tr>
            <td><label for="password_input">Password:</label></td>
            <td><input type="password" name="passWord" id="password_input"/></td>
        </tr>
        <tr>
            <td><span/></td>
            <td><input type="submit" value="logIn"/></td>
        </tr>

    </table>
</form>


<c:url var="footer" value="footer.jsp"/>
<jsp:include page="${footer}" />
