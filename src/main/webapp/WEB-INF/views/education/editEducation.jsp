<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>

<body id="page-top">
<!-- Navigation-->
<%@include file="../dynamic/navigationMain.jspf" %>
<!-- Page Content-->
<!-- Begin Page Content -->
<div class="container-fluid">
    <form method="post" action='<c:url value="/editEducation/${education.id}"/>'>
        <!-- Content Row -->
        <div class="row">
            <div class="col-xl-12 col-md-12 mb-12">
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <div class="form-group row">
                            <label class="col-2 col-form-label">School</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="schoolName"
                                       value="${education.schoolName}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-2 col-form-label">Title</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="title"
                                       value="${education.title}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">Start</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="start"
                                       value="${education.start}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">Finish</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="finish"
                                       value="${education.finish}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">Description</label>
                            <div class="col-10">
                                <textarea class="form-control" name="description"
                                          rows="5">${education.description}</textarea>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <input class="btn btn-success pull-left" type="submit" value="Save changes" id="saveButton"></input>
    </form>
    <div>
        <form method="post" action='<c:url value="/education/${education.id}"/>'>
            <input class="btn btn-danger pull-left" type="submit" value="Delete" id="deleteButton"></input>
        </form>
    </div>

</div>
</body>

