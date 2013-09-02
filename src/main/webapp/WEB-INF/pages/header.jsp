<%--
  Created by IntelliJ IDEA.
  User: diptopol
  Date: 8/29/13
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${param.title} SleepTracker</title>
    <link href="<c:url value="/resources/css/style.css"/> " rel="stylesheet" type="text/css">
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.min.js"></script>
    <script src="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.16/jquery-ui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.16/themes/hot-sneaks/jquery-ui.css" />
    <script src="<c:url value="/resources/js/jquery-ui-timepicker-addon.js"/>"></script>



</head>
<body>
    <script>

        $(function() {
            $('#startTime').datetimepicker({dateFormat:'dd/mm/yy' ,timeFormat: 'hh:mm:ss'});
            $('#duration').timepicker({ timeFormat: 'hh:mm' ,showButtonPanel:'false'});
        });
    </script>

<div id=header>
    <a> ${param.title} SleepTracker </a>
</div>
<div id=content>