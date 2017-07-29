/**
 * 
 */
package win.bigdream.entity;

import java.util.Date;

/**
 * 博客评论类
 * @author hh
 *
 */
public class Comment {
	
	private Integer id;//评论id
	private String userIp;//用户ip
	private String content;//内容
	private Blog blog;//博客信息
	private Date commentDate;//评论时间
	private Integer state;//审核状态 0 待审核 1 审核通过 2 审核未通过
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	
}
