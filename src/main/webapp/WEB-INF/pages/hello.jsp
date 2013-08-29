<%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>

<C:url var="head" value="header.jsp"/>

<jsp:include page="${head}">
    <jsp:param name="title" value="Hello" />
</jsp:include>

 <div>
	<h1>${message}</h1>
 </div>
<C:url var="footer" value="footer.jsp"/>
<jsp:include page="${footer}" />