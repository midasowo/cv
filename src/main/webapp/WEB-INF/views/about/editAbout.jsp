<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<body id="page-top">
<!-- Navigation-->
<%@include file="../dynamic/navigationMain.jspf" %>
<!-- Page Content-->
<!-- Begin Page Content -->
<div class="container-fluid">
    <form method="post" action='<c:url value="/editAbout/${about.id}"/>'>
        <!-- Content Row -->
        <div class="row">
            <div class="col-xl-12 col-md-12 mb-12">
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <div class="form-group row">
                            <label class="col-2 col-form-label">Name</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="firstName"
                                       value="${about.firstName}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-2 col-form-label">Surname</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="lastName"
                                       value="${about.lastName}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">LinkedIn URL name</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="linkedin"
                                       value="${about.linkedin}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">GitHub name</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="github"
                                       value="${about.github}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">Description</label>
                            <div class="col-10">
                                <textarea class="form-control" name="description"
                                          rows="5">${about.description}</textarea>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <input class="btn btn-success pull-left" type="submit" value="Save changes" id="saveButton"></input>
        <sec:csrfInput/>
    </form>
</div>
</body>

