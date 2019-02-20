<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
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
    <h1>添加药品</h1>
    <form action="" name="medicineForm">
        药品编号：<input type="text" name="m_num"><br>
        药品名称：<input type="text" name="m_name"><br>
        药品价格：<input type="text" name="m_price"><br>
        药品数量：<input type="text" name="m_quantity"><br>
        药品有效期：<input type="text" name="m_time"><br>
          <input type="button" value="添加"
            onclick="addMedicine()">
    </form>
  </body>
</html>
