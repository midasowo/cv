<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="dynamic/css.jspf"%>

    <body id="page-top">
        <!-- Navigation-->
        <%@include file="dynamic/navigationMain.jspf"%>
        <!-- Page Content-->
        <div class="container-fluid p-0">
            <%@include file="about/about.jsp"%>
            <!-- Experience-->
            <%@include file="experience/experience.jsp"%>
            <!-- Education-->
            <%@include file="education/education.jsp"%>
            <!-- Skills-->
            <%@include file="skills/skills.jsp"%>
            <!-- Interests-->
            <%@include file="interests/interests.jsp"%>
            <!-- Contact-->
            <%@include file="contact/contact.jsp"%>
        </div>
    </body>
</html>
