<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>

<body id="page-top">
<!-- Navigation-->
<%@include file="../dynamic/navigationMain.jspf" %>
<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- About-->

    <section class="resume-section" id="about">
        <div class="resume-section-content">

            <c:forEach items="${about}" var="title">
                <h1 class="mb-0">
                        ${title.firstName}
                    <span class="text-primary">${title.lastName}</span>
                </h1>
                <div class="subheading mb-4">
                    <span class="text-primary">${title.title}</span>
                </div>
                <p class="lead mb-5">${title.description}</p>
                <div class="social-icons">
                    <a class="social-icon" href="https://www.linkedin.com/in/${title.linkedin}/" target="_blank"><i
                            class="fab fa-linkedin-in"></i></a>
                    <a class="social-icon" href="https://github.com/${title.github}" target="_blank"><i
                            class="fab fa-github"></i></a>
                </div>
            </c:forEach>
        </div>
    </section>
    <hr class="m-0"/>
</div>
</body>