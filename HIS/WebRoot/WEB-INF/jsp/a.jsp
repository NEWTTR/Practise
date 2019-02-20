<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp：include page="home.jsp" />
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
	<script>
     $(document).ready(function(){ 
     var path=window.location.pathname;  //先得到地址栏内容
     var regExp=/[\/\.\?]+/;
     str=path.split(regExp);
     var node=str.slice(-2,-1);   //截取地址栏信息得到文件名
     $('#'+node+' a').addClass('at');  //提前写好对应的id,菜单加亮
     $('#'+node).parent().parent().parent().addClass('in'); //id父级的父级的父级添加展开class 
     })
    </script>
	
  </head>
  
  <body>
  
    <!-- 左侧菜单栏 -->
	<div class="col-md-2 side-nav">
		<div class="panel-group" id="accordion">
			<div class="panel-heading panel">
				<a href="index.html" class="side-nav-item item-title">首页</a>
					<div class="item-body collapse" id='index'>
					</div>
			</div>
			<div class="panel-heading panel">
				<a data-toggle="collapse" data-parent="#accordion" href="#item-cangku" id="headcangku" class="side-nav-item item-title">仓库管理</a>
					<div id="item-cangku" class="panel-collapse collapse">
					<div class="item-body">
						<ul class="list-unstyled">
							<li class="item-second" id='a'><a href="${path}a">产品库存</a></li>
							<li class="item-second" id='b'><a href="b.html">原料库存</a></li>
						</ul>
					</div>
					</div>
			</div>

			<div class="panel-heading panel">
				<a data-toggle="collapse" data-parent="#accordion" href="#item-caiwu" id="headcaiwu" class="side-nav-item item-title collapsed">财务管理</a>
					<div id="item-caiwu" class="panel-collapse collapse">
					<div class="item-body">
						222
					</div>
					</div>
			</div>

			<div class="panel-heading panel">
				<a data-toggle="collapse" data-parent="#accordion" href="#item-renshi" id="headrenshi" class="side-nav-item item-title collapsed">人事管理</a>
					<div id="item-renshi" class="panel-collapse collapse">
					<div class="item-body">
					</div>
					</div>
			</div>
		</div>
	</div>
	a.html   
  </body>
</html>
