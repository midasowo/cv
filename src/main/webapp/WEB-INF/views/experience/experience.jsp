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
    <!-- Experience-->
    <section class="resume-section" id="experience">
        <div class="resume-section-content">
            <h2 class="mb-5">Experience</h2>
            <c:forEach items="${experience}" var="title">
                <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                    <div class="flex-grow-1">
                        <h3 class="mb-0">${title.jobTitle}</h3>
                        <div class="subheading mb-3">${title.companyName}</div>
                        <p>${title.description}</p>
                        <div>
                            <security:authorize access="hasAnyRole('ADMIN')">
                                <a href='<c:url value="/editExperience/${title.id}"/>'
                                   class="btn btn-general btn-secondary" role="button">Edit</a>
                                <sec:csrfInput/>
                            </security:authorize>
                        </div>
                    </div>
                    <div class="flex-shrink-0"><span class="text-primary">${title.start} - ${title.finish}</span></div>
                </div>
            </c:forEach>
        </div>
        <hr class="m-0"/>
    </section>
    <security:authorize access="hasAnyRole('ADMIN')">
        <form method="post" action='<c:url value="/experience"/>'>
            <!-- Content Row -->
            <div class="row">
                <div class="col-xl-12 col-md-12 mb-12">
                    <div class="card shadow mb-4">
                        <h4>Add experience</h4>
                        <div class="card-header py-3">
                            <div class="form-group row">
                                <label class="col-2 col-form-label">Job title</label>
                                <div class="col-10">
                                    <input class="form-control" name="jobTitle" type="text"
                                           placeholder="complete job titles">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-2 col-form-label">Company name</label>
                                <div class="col-10">
                                    <input class="form-control" name="companyName" type="text" placeholder="complete company name">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label class="col-2 col-form-label">Start</label>
                                <div class="col-10">
                                    <input class="form-control" name="start" type="text"
                                           placeholder="beginning in 'month name - year' format">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label class="col-2 col-form-label">Finish</label>
                                <div class="col-10">
                                    <input class="form-control" name="finish" type="text"
                                           placeholder="finish in 'month name - year' format">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-2 col-form-label">Description</label>
                                <div class="col-10">
                                    <textarea class="form-control" rows="5" name="description" placeholder="describe your duties"></textarea>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <input class="btn btn-general btn-success" type="submit" value="Add" id="searchButton"></input>
            <sec:csrfInput/>
        </form>
    </security:authorize>
</div>
</body>