<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>

<body id="page-top">
<!-- Navigation-->
<%@include file="../dynamic/navigationMain.jspf" %>
<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Education-->
    <section class="resume-section" id="education">
        <div class="resume-section-content">
            <h2 class="mb-5">Education</h2>

            <c:forEach items="${education}" var="title">
                <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                    <div class="flex-grow-1">
                        <h3 class="mb-0">${title.schoolName}</h3>
                        <div class="subheading mb-3">${title.title}</div>
                        <div>${title.description}</div>
                    </div>
                    <div class="flex-shrink-0"><span class="text-primary">${title.start} - ${title.finish}</span></div>
                </div>
            </c:forEach>
        </div>
    </section>
    <hr class="m-0"/>
</div>
</body>