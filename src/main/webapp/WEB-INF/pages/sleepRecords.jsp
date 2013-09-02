<%--
  Created by IntelliJ IDEA.
  User: diptopol
  Date: 9/1/13
  Time: 11:20 AM
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
    <div id="record_header">Sleep Records </div>
    <table id="record_table">
        <tr class="tr_gray">
            <th >Starting Time</th>
            <th >Duration</th>
            <th >Sleeping Break</th>
            <th >Nightmare</th>
        </tr>

        <c:forEach var="record" items="${records}" >
            <tr class="tr_white">
                <td>${record.startTime}</td>
                <td>${record.duration}</td>
                <td>${record.sleepingBreak}</td>
                <td>${record.nightmare}</td>
            </tr>
        </c:forEach>
    </table>
</div>



<c:url var="footer" value="footer.jsp"/>
<jsp:include page="${footer}" />