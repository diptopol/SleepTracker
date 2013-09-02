<%--
  Created by IntelliJ IDEA.
  User: diptopol
  Date: 9/2/13
  Time: 6:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url var="head" value="header.jsp"/>

<jsp:include page="${head}">
    <jsp:param name="title" value="" />
</jsp:include>

<c:url var="sideMenu" value="sideMenu.jsp"/>
<jsp:include page="${sideMenu}"/>

<div id="content_window">
    <div id="record_header">User Profile </div>
    <div id=record-form>

        <label for="name">Name: </label>
        <label id="name">${user.info.name}</label><br/>

        <label for="email">Email: </label>
        <label id="email">${user.info.email}</label><br/>

        <label for="mobile">Mobile No: </label>
        <label id="mobile">${user.info.mobileNo}</label><br/>

    </div>

</div>



<c:url var="footer" value="footer.jsp"/>
<jsp:include page="${footer}" />