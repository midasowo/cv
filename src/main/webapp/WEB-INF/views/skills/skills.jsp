<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<body id="page-top">
<!-- Navigation-->
<%@include file="../dynamic/navigationMain.jspf" %>
<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Skill-->
    <section class="resume-section" id="skills">
        <div class="resume-section-content">
            <h2 class="mb-5">Skills</h2>

            <div class="subheading mb-3">Technical skills</div>

            <c:forEach items="${skills}" var="title">
                <ul class="fa-ul mb-0">
                    <li>
                        <span class="fa-li"><i class="fa-solid fa-circle-check"></i></span>
                            ${title.techSkill}

                        <security:authorize access="hasAnyRole('ADMIN')">
                            <a href='<c:url value="/editSkills/${title.id}"/>'
                               class="btn btn-sm btn-secondary" role="button">Edit</a>
                            <sec:csrfInput/>
                        </security:authorize>

                    </li>
                </ul>
            </c:forEach>
        </div>
        <hr class="m-0"/>
    </section>
    <security:authorize access="hasAnyRole('ADMIN')">
        <form method="post" action='<c:url value="/skills"/>'>
            <!-- Content Row -->
            <div class="row">
                <div class="col-xl-12 col-md-12 mb-12">
                    <div class="card shadow mb-1">
                        <h4>Add technical skills</h4>
                        <div class="card-header py-3">
                            <div class="form-group row">
                                <label class="col-2 col-form-label">Technical skill</label>
                                <div class="col-10">
                                    <input class="form-control" name="techSkill" type="text"
                                           placeholder="technical skill">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <input class="btn btn-general btn-success mb-4" type="submit" value="Add" id="searchButton"></input>
            <sec:csrfInput/>
        </form>
    </security:authorize>

</div>
</body>