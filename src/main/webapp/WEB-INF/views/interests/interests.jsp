<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<body id="page-top">
<!-- Navigation-->
<%@include file="../dynamic/navigationMain.jspf" %>
<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Interest-->
    <section class="resume-section" id="interests">
        <div class="resume-section-content">
            <c:forEach items="${interests}" var="title">
                <h2 class="mb-5">Interests</h2>
                <p>${title.description}</p>
                <security:authorize access="hasAnyRole('ADMIN')">
                    <a href='<c:url value="/editInterest/${title.id}"/>'
                       class="btn btn-general btn-secondary mb-3" role="button">Edit</a>
                    <sec:csrfInput/>
                </security:authorize>
            </c:forEach>
        </div>
    </section>
    <hr class="m-0"/>
</div>
</body>