<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="dynamic/css.jspf"%>


    <body id="page-top">
        <!-- Navigation-->
        <%@include file="dynamic/navigationMain.jspf"%>
        <!-- Page Content-->
        <section class="resume-section" id="">
            <div class="resume-section-content">
                    <h1 class="mb-0">
                            CV
                        <span class="text-primary">KRZYSZTOF MIDUCH</span>
                    </h1>
                    <div class="subheading mb-4">
                        <span class="text-primary">if you want to view individual pages, use "test" login and "test" password</span>
                    </div>
                    <p class="lead mb-5">Just click on tabs!</p>
                    <div class="social-icons">
                        <a class="social-icon" href="https://www.linkedin.com/in/krzysztof-miduch/" target="_blank"><i
                                class="fab fa-linkedin-in"></i></a>
                        <a class="social-icon" href="https://github.com/midasowo" target="_blank"><i
                                class="fab fa-github"></i></a>
                    </div>
            </div>
        </section>
    </body>
</html>
