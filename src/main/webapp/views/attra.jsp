<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
   <head>
      <title>Cities</title>
   </head>

   <body>
      <h2>Cities</h2>
      <c:forEach var="attractions" items="${attra}">
          <br>${attractions.attractionsName}
      </c:forEach>
   </body>
</html>
