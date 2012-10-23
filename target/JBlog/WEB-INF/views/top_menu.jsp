<%--
  Created by IntelliJ IDEA.
  User: atom
  Date: 22.10.12
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="top_menu"> <!-- begin of top menu part -->
    <ul>
        <c:forEach var="element" items="${menuItems}">
            <li><a href="${element.href}">${element.caption}</a></li>
        </c:forEach>
    </ul>
</div>  <!-- end of top menu part -->
