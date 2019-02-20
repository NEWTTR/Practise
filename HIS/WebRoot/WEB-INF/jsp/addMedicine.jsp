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
				<a href="${path}home" class="side-nav-item item-title">首页</a>
					<div class="item-body collapse" id='index'>
					</div>
			</div>
			<div class="panel-heading panel">
				<a data-toggle="collapse" data-parent="#accordion" href="#item-medicine" id="headmedicine" class="side-nav-item item-title">药品管理</a>
					<div id="item-medicine" class="panel-collapse collapse">
					<div class="item-body">
						<ul class="list-unstyled">
							<li class="item-second" id='a'><a href="${path}listMedicine">药品列表</a></li>
							<li class="item-second" id='b'><a href="${path}toAddMedicine">增加药品</a></li>
						</ul>
					</div>
					</div>
			</div>

			<div class="panel-heading panel">
				<a data-toggle="collapse" data-parent="#accordion" href="#item-doctor" id="headdoctor" class="side-nav-item item-title collapsed">医生管理</a>
					<div id="item-doctor" class="panel-collapse collapse">
					<div class="item-body">
						<ul class="list-unstyled">
							<li class="item-second" id='e'><a href="${path}doctor/listDoctor">医生列表</a></li>
							<li class="item-second" id='f'><a href="${path}doctor/toAddDoctor">增加医生</a></li>

						</ul>
					</div>
					</div>
			</div>

			<div class="panel-heading panel">
				<a data-toggle="collapse" data-parent="#accordion" href="#item-patient" id="headpatient" class="side-nav-item item-title collapsed">病人管理</a>
					<div id="item-patient" class="panel-collapse collapse">
					<div class="item-body">
						<ul class="list-unstyled">
							<li class="item-second" id='i'><a href="${path}patient/listPatient">病人列表</a></li>
							<li class="item-second" id='j'><a href="${path}patient/toAddPatient">病人挂号</a></li>
						</ul>
					</div>
					</div>
			</div>
			
			<div class="panel-heading panel">
				<a data-toggle="collapse" data-parent="#accordion" href="#item-register" id="headregister" class="side-nav-item item-title collapsed">挂号管理</a>
					<div id="item-register" class="panel-collapse collapse">
					<div class="item-body">
						<ul class="list-unstyled">
							<li class="item-second" id='m'><a href="${path}register/listRegister">挂号以及缴费处理</a></li>
							<li class="item-second" id='x'><a href="${path}register/toAddRegister">添加挂号具体信息</a></li>
						</ul>
					</div>
					</div>
			</div>
			
			<div class="panel-heading panel">
				<a data-toggle="collapse" data-parent="#accordion" href="#item-total" id="headtotal" class="side-nav-item item-title collapsed">统计</a>
					<div id="item-total" class="panel-collapse collapse">
					<div class="item-body">
						<ul class="list-unstyled">
							<li class="item-second" id='o'><a href="${path}patient/listTotal">统计流量</a></li>
						</ul>
					</div>
					</div>
			</div>	
		</div>
	</div>
	
	<div class="panel panel-default">
		<div class="panel-heading">添加药品面板</div>
		<div class="panel-body">
    		<h3>添加须知</h3>
    		<p>1、需要填写有效的保质期</p>
    		<p>2、药品规格等填写规范</p>
    		<p>3、严禁对药品价格进行私自更改</p>
    	</div>
	<form class="form-horizontal">
  		<div class="form-group">
    		<label for="inputnum" class="col-sm-2 control-label"> 药品编号：</label>
    			<div class="col-sm-10">
     			 <input type="text" class="form-control" name="m_num">
    			</div>
  		</div>
  		<div class="form-group">
    		<label for="inputname" class="col-sm-2 control-label"> 药品名称：</label>
    			<div class="col-sm-10">
     			 <input type="text" class="form-control" name="m_name">
    			</div>
  		</div>
  		<div class="form-group">
    		<label for="inputprice" class="col-sm-2 control-label">药品价格：</label>
    			<div class="col-sm-10">
     			 <input type="text" class="form-control" name="m_price">
    			</div>
  		</div>
  		<div class="form-group">
    		<label for="inputquantity" class="col-sm-2 control-label">药品数量：</label>
    			<div class="col-sm-10">
     			 <input type="text" class="form-control" name="m_quantity">
    			</div>
  		</div>
  		<div class="form-group">
    		<label for="inputtime" class="col-sm-2 control-label">药品有效期：</label>
    			<div class="col-sm-10">
     			 <input type="text" class="form-control" name="m_time">
    			</div>
  		</div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary" onclick="addMedicine()">新增</button>
    </div>
  </div>
</form>
</div>
    <script type="text/javascript">
        function addMedicine() {
            var form = document.forms[0];
            form.action = "<%=basePath %>addMedicine";
            form.method = "post";	
            form.submit();
        }
    </script>
</body>
</html>
