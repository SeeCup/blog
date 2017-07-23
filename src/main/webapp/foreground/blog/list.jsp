<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

	  	<div class="data_list">
	  		<div class="data_list_title">
			<img src="${pageContext.request.contextPath}/static/images/list_icon.png"/>
			最新博客</div>
	  		
	  		<div class="datas">
	  			<ul>
	  				<%-- <li style="margin-bottom: 30px">
	  					<span class="date"><a href="${pageContext.request.contextPath}/blog/articles/52.html">2016年02月15日</a></span>
					  	<span class="title"><a href="${pageContext.request.contextPath}/blog/articles/52.html">使用CXF开发WebService客户端</a></span>
					  	<span class="summary">摘要: 前面一讲开发了webservice服务器端接口，今天的话，我们来开发webservice客户端，让大家来体验下过程；首先建一个Maven项目，项目名字，WS_Client；然后我们要用CXF给我们提供的工具wsdl2java 来根据请求的url生成客户端代码；wsdl2java工具在CXF开发包里；开发下载地...</span>
					  	<span class="img">
					  		
						  		<a href="/blog/articles/52.html"><img src="${pageContext.request.contextPath}/static/userImages/a.jpg" alt="1455539511890048174.jpg"></a>
						  		&nbsp;&nbsp;
					  		
						  		<a href="/blog/articles/52.html"><img alt="QQ鎴浘20160215203213.jpg" src="${pageContext.request.contextPath}/static/userImages/b.jpg" title="1455539700734093102.jpg" width="667" height="264" style="width: 667px; height: 264px;"></a>
						  		&nbsp;&nbsp;
					  		
						  		<a href="/blog/articles/52.html"><img alt="QQ鎴浘20160215203317.jpg" src="${pageContext.request.contextPath}/static/userImages/c.jpg" title="1455539761187019902.jpg"></a>
						  		&nbsp;&nbsp;
					  		
					  	</span>
					  	<span class="info">发表于 2016-02-15 21:06 阅读(71) 评论(5) </span>
	  					
	  				</li>
	  				 <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" /> --%>
	  				<c:forEach var="blog" items="${blogList}">
	  					<li style="margin-bottom: 30px">
	  					<span class="date"><a href="${pageContext.request.contextPath}/blog/articles/52.html"><fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy年MM月dd日"/></a></span>
					  	<span class="title"><a href="${pageContext.request.contextPath}/blog/articles/52.html">${blog.title }</a></span>
					  	<span class="summary">${blog.summary }...</span>
					  	<span class="img">
					  		<c:forEach var="image" items="${blog.imageList }">
					  			<a href="/blog/articles/52.html">${image }</a>
						  		&nbsp;&nbsp;
					  		</c:forEach>
						  		
					  		
						  		<%-- <a href="/blog/articles/52.html"><img alt="QQ鎴浘20160215203213.jpg" src="${pageContext.request.contextPath}/static/userImages/b.jpg" title="1455539700734093102.jpg" width="667" height="264" style="width: 667px; height: 264px;"></a>
						  		&nbsp;&nbsp;
					  		
						  		<a href="/blog/articles/52.html"><img alt="QQ鎴浘20160215203317.jpg" src="${pageContext.request.contextPath}/static/userImages/c.jpg" title="1455539761187019902.jpg"></a>
						  		&nbsp;&nbsp; --%>
					  		
					  	</span>
					  	<span class="info">发表于<fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy-MM-dd HH:mm"/>阅读(${blog.clickHit }) 评论(${blog.replyHit }) </span>
	  					
	  				</li>
	  				 <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
	  				</c:forEach>		
	  			</ul>
	  		</div>
	  	</div>
	  	<nav>
	  		<ul class="pagination pagination-sm">
	  			${pageCode }
	  		</ul>
	  	</nav>