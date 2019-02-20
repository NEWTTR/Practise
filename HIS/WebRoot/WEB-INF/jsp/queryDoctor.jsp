<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
							<li class="item-second" id='o'><a href="${path}listMedicine">统计流量</a></li>
						</ul>
					</div>
					</div>
			</div>	
		</div>
	</div><!-- 左侧菜单栏 -->
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
							<li class="item-second" id='m'><a href="${path}listRegister">挂号以及缴费处理</a></li>
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
	<!-- 右侧显示的内容 -->
	<div class="panel panel-default">
		<div class="panel-heading">医生信息详情</div>
		<div class="panel-body">
    		<h3>医生准则须知</h3>
    		<p>1、项目执行医生需对患者的病情作出客观正确的评估</p>
    		<p>2、项目执行医生及护士不得向患者收取类克援助药品的任何费用（不包括注射或其他治疗费用）</p>
    		<p>3、项目执行医生需对配送的类克援助药品妥善管理。</p>
    	</div>
	<table class="table table-bordered"  >
    	<tr>
        <td>医生列号</td>
        <td>医生编号</td>
        <td>医生名称</td>
        <td>医生密码</td>
        <td>医生本名</td>
        <td>医生类型</td>       
    </tr>
        <tr>
            <td>${c.d_id}</td>
            <td>${c.d_num}</td>
            <td>${c.d_username}</td>
            <td>${c.d_password}</td>
            <td>${c.d_name}</td>
            <td>${c.d_type}</td>
        </tr>
	</table>
	<form action="/HIS/doctor/listDoctor" method="post">
    	<div class="form-group">
                <input  class="btn btn-primary" type="submit" value="返回"></a>
            </div>
        </form>   
  </body>

</html>