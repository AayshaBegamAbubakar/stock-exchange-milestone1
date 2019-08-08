<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.example.stockspring.model.Company"    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<link rel='stylesheet' href='style/style.css' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
     <style>
 body{
	
	
	background:url(file:///C:/JavaPractiseCheck/Login/WebContent/images/signback.jpg) no-repeat;
	 background-repeat:no-repeat;
	 background-size:cover;
	 width:100%;
	 height:100vh;
	 overflow:auto;
	margin:0;
	color:#6a6f8c;
	
	font:600 16px/18px 'Open Sans',sans-serif;

}</style>

 
<title>Company List</title>
</head>
<body>
<br><br><br>

		<div align="right">
        <a href="#"  class="button"> Log out</a>
	
			</div>
			
			
	

	<br><br>
	<section><article>
  <center><b class="button">List of Companies</b><br><br><br><br>
<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>

<table id="t01">

<tr>

<th><h3>Company ID</h3></th>
<th><h3>Company Name</h3></th>
<th><h3>Company Turnover</h3></th>
<th><h3>Company CEO</h3></th>
<th><h3>Board of Directory</h3></th>
<th><h3>Company Brief</h3></th>
</tr>

<% for(int i=0;i<companyList.size();i++){
	Company e=(Company)companyList.get(i);
	%>
	
<tr>
<td><%= e.getCompanyId() %></td>
<td><%= e.getCompanyName() %></td>
<td><%= e.getTurnOver() %></td>
<td><%= e.getCompanyCEO() %></td>
<td><%= e.getBoardOfDirectors() %></td>
<td><%= e.getCompanyBrief() %></td>
</tr>
<% }%>


</table>


<br><br><br><br>
<br><br>
<br><br>
<br><br>


 <div class="row">
   <div class="column"><h3>Import Data</h3><img class="data" src="images/Picture1.jpg" alt="image" /></div>
    <div class="column"><h3>Manage Company</h3><img class="data" src="images/Picture2.jpg" alt="image" /></div>
     <div class="column"><h3>Manage Data</h3><img class="data" src="images/Picture3.jpg" alt="image" /></div> 
     <div class="column"><h3>Update IPO details</h3><img class="data" src="images/Picture4.jpg" alt="image" /></div>
   </div>
   </article>
</section>
 
	


</body>
</html>