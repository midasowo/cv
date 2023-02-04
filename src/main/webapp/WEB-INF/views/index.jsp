<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>


<body id="page-top">
<!-- Navigation-->
<%@include file="dynamic/navigationBlank.jspf" %>
<!-- Page Content-->
<section class="resume-section" id="">
    <div class="resume-section-content">
        <h1 class="mb-0">
            KRZYSZTOF
            <span class="text-primary">MIDUCH</span>
        </h1>
        <div class="subheading mb-4">
            <span class="text-primary">A simple web application that allows you to create your CV online.</span>
        </div>
        <p class="lead mb-4">If you want to view individual pages, use "test" login and "test" password.</p>
        <p class="lead mb-4">For administrator purposes, use parameters specified in my resume.</p>
        <div>
            <a class="btn btn-success pull-left" href='<c:url value="/login"/>'><b>LOGIN</b></a>
        </div>
    </div>
</section>
</body>
</html>
