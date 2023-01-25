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
    <form method="post" action='<c:url value="/editContact/${contact.id}"/>'>
        <!-- Content Row -->
        <div class="row">
            <div class="col-xl-12 col-md-12 mb-12">
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <div class="form-group row">
                            <label class="col-2 col-form-label">Home city</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="homeCity"
                                       value="${contact.homeCity}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-2 col-form-label">Phone number</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="phone"
                                       value="${contact.phone}">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2 col-form-label">E-mail</label>
                            <div class="col-10">
                                <input class="form-control" type="text" name="email"
                                       value="${contact.email}">
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

