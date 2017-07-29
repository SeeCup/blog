<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/ueditor/third-party/SyntaxHighlighter/shCore.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/ueditor/third-party/SyntaxHighlighter/shCoreDefault.css">
<script type="text/javascript">
    SyntaxHighlighter.all();
    function showOtherComment(){
    	$(".otherComment").show();
    }
</script>
<div class="data_list">
	<div class="data_list_title">
		<img src="/static/images/blog_show_icon.png"/>
		博客信息
	</div>
	<div class="blog_title"><h3><strong>${blog.title }</strong></h3></div>
	<div class="blog_share">
		<div class="bshare-custom">
			<a title="分享到QQ空间" class="bshare-qzone"></a><a title="分享到新浪微博"
				class="bshare-sinaminiblog"></a><a title="分享到人人网"
				class="bshare-renren"></a><a title="分享到腾讯微博" class="bshare-qqmb"></a><a
				title="分享到网易微博" class="bshare-neteasemb"></a><a title="更多平台"
				class="bshare-more bshare-more-icon more-style-addthis"></a><span
				class="BSHARE_COUNT bshare-share-count">0</span>
		</div>
		<script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh"></script>
		<script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/bshareC0.js"></script>
	</div>
	<div class="blog_info">
		发布时间：『<fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy-MM-dd HH:mm"/>』&nbsp;&nbsp;
		博客类型：${blog.blogType.typeName }
	</div>
	<div class="blog_content">
		${blog.content }
	</div>
	<div class="blog_keyWord">
		<font><strong>关键字：</strong></font>
		<a href="#" target="_blank">你好啊</a>
	</div>
	<div class="blog_lastAndNextPage">
		${pageCode }
	</div>
</div>

<div class="data_list">
	<div class="data_list_title">
		<img src="/static/images/comment_icon.png"/>
		评论信息
		<c:if test="${commentList.size()>10 }">
			<a href="javascript:showOtherComment()" style="float: right;padding-right: 40px;">显示所有评论</a>
		</c:if>
	</div>
	<div class="commentDatas">
		<c:choose>
			<c:when test="${commentList.size()==0 }">
				暂无评论
			</c:when>
			<c:otherwise>
				<c:forEach var="comment" items="${commentList}" varStatus="status">
					<c:choose>
						<c:when test="${status.index<10 }">
							<div class="comment">
								<span><font>${status.index+1 }楼&nbsp;&nbsp;&nbsp;&nbsp;${comment.userIp }：</font>${comment.content }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[&nbsp;<fmt:formatDate value="${comment.commentDate }" type="date" pattern="yyyy-MM-dd HH:mm"/>&nbsp;]</span>			
							</div>
						</c:when>
						<c:otherwise>
							<div class="otherComment">
								<span><font>${status.index+1 }楼&nbsp;&nbsp;&nbsp;&nbsp;${comment.userIp }：</font>${comment.content }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[&nbsp;<fmt:formatDate value="${comment.commentDate }" type="date" pattern="yyyy-MM-dd HH:mm"/>&nbsp;]</span>			
							</div>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</div>
</div>