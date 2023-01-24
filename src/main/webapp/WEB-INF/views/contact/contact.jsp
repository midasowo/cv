<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>

<body id="page-top">
<!-- Navigation-->
<%@include file="../dynamic/navigationMain.jspf" %>
<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Contact-->
    <section class="resume-section" id="contact">
        <div class="resume-section-content">
            <h2 class="mb-5">Contact</h2>
            <div class="contact-phone contact-side-desc contact-box-desc">
                <c:forEach items="${contact}" var="title">
                <h3><i class="fa fa-house cl-atlantis fa-2xs"></i> Home</h3>
                <p>${title.homeCity}</p>
            </div>
            <div class="contact-phone contact-side-desc contact-box-desc">
                <h3><i class="fa fa-phone cl-atlantis fa-2xs"></i> Phone</h3>
                <p>${title.phone}</p>
            </div>
            <div class="contact-phone contact-side-desc contact-box-desc">
                <h3><i class="fa fa-envelope cl-atlantis fa-2xs"></i> E-mail</h3>
                <p><a href="mailto:${title.email}">${title.email}</a></p>
            </div>
            </c:forEach>
        </div>
    </section>
</div>
</body>