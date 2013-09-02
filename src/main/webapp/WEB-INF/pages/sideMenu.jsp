<%--
  Created by IntelliJ IDEA.
  User: diptopol
  Date: 9/1/13
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="side_menu">
    <nav>
        <div class="left_menu_item">
            <h4><a href="<c:url value="/showProfile"/> ">Profile</a></h4>
        </div>
        <div class="left_menu_item">
            <h4><a href="<c:url value="/sleepRecords"/> ">Sleep Record</a></h4>
        </div>
        <div class="left_menu_item">
            <h4><a href="<c:url value="/recordForm"/> ">Entry Record</a></h4>
        </div>
        <div class="left_menu_item">
            <h4><a href="<c:url value="/logout"/>" >Logout</a></h4>
        </div>
    </nav>
</div>