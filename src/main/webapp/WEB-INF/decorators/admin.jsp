<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<html>
<head>
  <title><sitemesh:write property="title"/></title>
  <sitemesh:write property="head"/>

  <%--  boostrap & fontawesome--%>
  <link rel="stylesheet" href="<c:url value='/admin/assets/css/bootstrap.min.css'/>"/>
  <link rel="stylesheet" href="<c:url value='/admin/assets/font-awesome/4.5.0/css/font-awesome.min.css' />"/>

  <%--  text fonts--%>
  <link rel="stylesheet" href="<c:url value='/admin/assets/fonts/fonts.googleapis.com.css' />"/>

  <%--  ace styles--%>
  <link rel="stylesheet" href="<c:url value='/admin/assets/css/ace.min.css' />" class="ace-main-stylesheet"
        id="main-ace-style"/>

  <%--  ace settings handler--%>
  <script src="<c:url value='/admin/assets/js/ace-extra.min.js'/>"></script>

  <link rel="stylesheet" href="<c:url value="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css"/>"/>

  <link rel="stylesheet" href="<c:url value="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css"/>"/>

  <script type='text/javascript' src="<c:url value="/admin/js/2.1.4/jquery.min.js"/> "></script>

  <%--sweetalert--%>
  <script type='text/javascript' src="<c:url value="/admin/assets/sweetalert2/sweetalert2.min.js"/>"></script>

  <link rel="stylesheet" href="<c:url value="/admin/assets/sweetalert2/sweetalert2.min.css"/>">

  <link rel="stylesheet" href="<c:url value='/admin/assets/css/custom.css'/>" />
</head>
<body class="no-skin">
  <%@ include file="/common/admin/header.jsp" %>

  <div class="main-container" id="main-container">
    <script type="text/javascript">
      try {
        ace.settings.check('main-container', 'fixed')
      } catch (e) {
      }
    </script>
    <%@ include file="/common/admin/menu.jsp" %>

    <sitemesh:write property="body"/>

    <%@ include file="/common/admin/footer.jsp" %>

    <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse display">
      <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
    </a>
  </div>

  <!--[if !IE]> -->
  <script type="text/javascript">
    window.jQuery || document.write("<script src='/admin/assets/js/jquery.min.js'>"+"<"+"/script>");
  </script>
  <!-- <![endif]-->

  <script type="text/javascript">
    if('ontouchstart' in document.documentElement) document.write("<script src='/admin/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
  </script>

  <%--jQuery Validation Plugin--%>
  <script src="<c:url value="/admin/js/jqueryvalidate/jquery.validate.min.js"/>"></script>

  <%--common javascript file--%>
  <script type="text/javascript" src="<c:url value="/admin/js/global_admin_script.js"/>"></script>

  <script src="<c:url value="/admin/assets/js/bootstrap.min.js"/>"></script>
  <script src="<c:url value="/admin/assets/js/jquery-ui.custom.min.js"/>"></script>
  <script src="<c:url value="/admin/assets/js/jquery.ui.touch-punch.min.js"/>"></script>
  <script src="<c:url value="/admin/assets/js/jquery.easypiechart.min.js"/>"></script>
  <script src="<c:url value="/admin/assets/js/jquery.sparkline.min.js"/>"></script>
  <script src="<c:url value="/admin/assets/js/jquery.flot.min.js"/>"></script>
  <script src="<c:url value="/admin/assets/js/jquery.flot.pie.min.js"/>"></script>
  <script src="<c:url value="/admin/assets/js/jquery.flot.resize.min.js"/> "></script>
  <script src="<c:url value="/admin/assets/js/ace-elements.min.js"/>"></script>
  <script src="<c:url value="/admin/assets/js/ace.min.js"/> "></script>

  <!-- page specific plugin scripts -->
  <script src="<c:url value="/admin/assets/js/jquery-ui.min.js"/>"></script>
</body>
</html>
