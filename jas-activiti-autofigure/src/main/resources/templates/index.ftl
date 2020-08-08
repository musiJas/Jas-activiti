<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Activiti6流程设计器Demo</title>

</head>
<body>
<h2>
	<a href='${contextPath}/create?name=activiti&key=123456'>绘制流程</a>
</h2>
<div>
	<table width="100%">
	    <tr>
	        <td width="10%">模型编号</td>
	        <td width="10%">版本</td>
	        <td width="20%">模型名称</td>
	        <td width="20%">模型key</td>
	        <td width="40%">操作</td>
	    </tr>
	        <#list modelList as model>
	        <tr>
	            <td width="10%">${model.id}</td>
	            <td width="10%">${model.version}</td>
	            <td width="20%"><#if (model.name)??>${model.name}<#else> </#if></td>
	            <td width="20%"><#if (model.key)??>${model.key}<#else> </#if></td>
	            <td width="40%">
	             <a href="${contextPath}/editor?modelId=${model.id}">编辑</a>
	             <a href="${contextPath}/publish?modelId=${model.id}">发布</a>
	             <a href="${contextPath}/revokePublish?modelId=${model.id}">撤销</a>
	             <a href="${contextPath}/delete?modelId=${model.id}">删除</a>
	            </td>
	        </tr>
	       </#list>
	</table>
</div>
</body>
</html>