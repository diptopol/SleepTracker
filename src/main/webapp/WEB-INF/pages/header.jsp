<%--
  Created by IntelliJ IDEA.
  User: diptopol
  Date: 8/29/13
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${param.title} SleepTracker</title>
    <link href="<C:url value="/resources/css/style.css"/> " rel="stylesheet" type="text/css">
</head>
<body>
<div id=header>
    <a> ${param.title} SleepTracker </a>
</div>
<div id=content>