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
    <form method="post" action='<c:url value="/editSkills/${skills.id}"/>'>
        <!-- Content Row -->
        <div class="row">
            <div class="col-xl-12 col-md-12 mb-12">
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <div class="form-group row">
                            <label class="col-2 col-form-label">Tech skill</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="techSkill"
                                       value="${skills.techSkill}">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <input class="btn btn-success pull-left mb-2" type="submit" value="Save" id="saveButton"></input>
        <sec:csrfInput/>
    </form>
    <div>
        <form method="post" action='<c:url value="/skills/${skills.id}"/>'>
            <input class="btn btn-danger pull-left" type="submit" value="Delete" id="deleteButton"></input>
            <sec:csrfInput/>
        </form>
    </div>
</div>
</body>

