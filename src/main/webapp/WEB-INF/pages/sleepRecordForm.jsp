<%--
  Created by IntelliJ IDEA.
  User: diptopol
  Date: 9/1/13
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<c:url var="head" value="header.jsp"/>
<jsp:include page="${head}">
    <jsp:param name="title" value="" />
</jsp:include>

<c:url var="sideMenu" value="sideMenu.jsp"/>
<jsp:include page="${sideMenu}"/>

<div id="content_window">
    <div id="record_header">Entry Sleep Records: </div>
    <div id="record-form">
        <sf:form method="post" action="saveRecord" commandName="record">

            <label for="startTime">Start Time: <span class="required">*</span></label>
            <sf:input type="text"  id="startTime" class="input_width" path="startTime" placeholder="dd/MM/yyyy HH:mm" required="required" />

            <label for="duration">Duration: <span class="required">*</span></label>
            <sf:input type="text" id="duration" class="input_width" path="duration" placeholder="HH:mm"  required="required" />

            <label >NightMare: <span class="required">*</span></label>

            <sf:radiobutton id="nightmare_yes" path="nightmare" value="yes"  required="required"/>Yes<br/>
            <sf:radiobutton id="nightmare_no" path="nightmare" value="no"  required="required"/>No <br/>

            <label >Sleep Break: <span class="required">*</span></label>
            <sf:radiobutton class="sleepBreak" path="sleepingBreak" value="yes"  required="required"/> Yes<br/>
            <sf:radiobutton class="sleepBreak" path="sleepingBreak" value="no"  required="required" /> No<br/>

            <input type="submit" value="Submit Data" id="submit" />
            <p id="req-field-desc"><span class="required">*</span> indicates a required field</p>

        </sf:form>
    </div>
</div>
<c:url var="footer" value="footer.jsp"/>
<jsp:include page="${footer}" />