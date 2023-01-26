<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>

<body id="page-top">
<!-- Navigation-->
<%@include file="../dynamic/navigationMain.jspf" %>
<!-- Page Content-->
<!-- Begin Page Content -->
<div class="container-fluid">
    <form method="post" action='<c:url value="/editExperience/${experience.id}"/>'>
        <!-- Content Row -->
        <div class="row">
            <div class="col-xl-12 col-md-12 mb-12">
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <div class="form-group row">
                            <label class="col-2 col-form-label">Job titles</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="jobTitle"
                                       value="${experience.jobTitle}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-2 col-form-label">Company name</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="companyName"
                                       value="${experience.companyName}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">Start</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="start"
                                       value="${experience.start}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">Finish</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="finish"
                                       value="${experience.finish}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">Description</label>
                            <div class="col-10">
                                <textarea class="form-control" name="description"
                                          rows="5">${experience.description}</textarea>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <input class="btn btn-success pull-left" type="submit" value="Save changes" id="saveButton"></input>
        <sec:csrfInput/>
    </form>
    <div>
        <form method="post" action='<c:url value="/experience/${experience.id}"/>'>
            <input class="btn btn-danger pull-left" type="submit" value="Delete" id="deleteButton"></input>
            <sec:csrfInput/>
        </form>
    </div>

</div>
</body>

