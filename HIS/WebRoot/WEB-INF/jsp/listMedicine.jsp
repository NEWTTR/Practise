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
		<div class="panel-heading">药品详情</div>
		<div class="panel-body">
    		<h3>药品使用须知</h3>
    		<p>1、以病人为中心，做有良心的医生，办负责任的医院，树立良好的口碑，为病人提供满意的诊疗服务。</p>
    		<p>2、划价时见到病人到达药房窗口应立即站立并接过处方，确认药品的品名、规格和数量，当天药房的库存是否足够药房人员要做到心中有数</p>
    		<p>3、认真审阅处方后（对处方不明或书写不清之处应立即亲自咨询开处方的医生但不得随意更改处方）按规定划价,如果药房没有处方所开的药品，可告知医生换用相同效果的同类其他药品</p>
    	</div>
    	<!-- 按钮 -->
    	<form action="/HIS/querysingle" method="post">
    	<div class="form-group">
    	<input type="text" class="form-control" id="m_num" name ="m_num" placeholder="药品编号">
                <input  class="btn btn-primary" type="submit" value="查询"></a>
            </div>
        </form>
		<table class="table table-bordered"  >
    	<tr>
        <td>药品列号</td>
        <td>药品编号</td>
        <td>药品名称</td>
        <td>药品价格</td>
        <td>药品数量</td>
        <td>药品有效期</td>
        
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.m_id}</td>
            <td>${c.m_num}</td>
            <td>${c.m_name}</td>
            <td>${c.m_price}</td>
            <td>${c.m_quantity}</td>
            <td>${c.m_time}</td>
            <td><a href="queryMedicine?m_num=${c.m_num}">修改</a>
  				<a href="deleteMedicine?m_num=${c.m_num}">删除</a>
 			</td>   
        </tr>
    </c:forEach>
	</table>
   </div>
  </body>
</html>
