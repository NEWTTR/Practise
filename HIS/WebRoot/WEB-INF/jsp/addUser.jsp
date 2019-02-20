<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html lang="zh-CN">
  <head>
  <base href="<%=basePath%>">
  <meta http-equiv="Content-Type" content="text/html"; charset=UTF-8">
  <title>My JSP 'home.jsp' starting page</title>
  <link rel="stylesheet" type="text/css" href="<%=basePath%>bootstrap/css/bootstrap.min.css">
  <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script> 
  <script type="text/javascript" src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>  
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form class="form-horizontal">
  		<div class="form-group">
    		<label for="inputnum" class="col-sm-2 control-label"> 帐号：</label>
    			<div class="col-sm-10">
     			 <input type="text" class="form-control" name="username">
    			</div>
  		</div>
  		<div class="form-group">
    		<label for="inputname" class="col-sm-2 control-label"> 密码：</label>
    			<div class="col-sm-10">
     			 <input type="text" class="form-control" name="password">
    			</div>
  		</div>
  		
  		
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary" onclick="addUser()">新增</button>
    </div>
  </div>
</form>
</div>
    <script type="text/javascript">
        function addUser() {
            var form = document.forms[0];
            form.action = "<%=basePath %>user/addUser";
            form.method = "post";	
            form.submit();
        }
    </script>
  </body>
</html>
