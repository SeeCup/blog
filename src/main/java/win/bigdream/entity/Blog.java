/**
 * 
 */
package win.bigdream.entity;

import java.util.Date;

/**
 * @author hh
 *
 */
public class Blog {
	
	private Integer id;//编号 11
	private String title;//博客标题 200
	private String summary;//摘要 400
	private Date releaseDate;//发布日期 datetime
	private Integer clickHit;//查看次数11
	private Integer replyHit;//回复次数11
	private String content;//博客内容 text
	
	private BlogType blogType;//博客类型 typeId
	
	private String keyWord;//关键字 空格隔开 200
	private Integer blogCount;//博客数量 用于发布日期归档查询数量用到
	private String releaseDateStr;//发布日期的字符串 只取年和月
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Integer getClickHit() {
		return clickHit;
	}
	public void setClickHit(Integer clickHit) {
		this.clickHit = clickHit;
	}
	public Integer getReplyHit() {
		return replyHit;
	}
	public void setReplyHit(Integer replyHit) {
		this.replyHit = replyHit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public BlogType getBlogType() {
		return blogType;
	}
	public void setBlogType(BlogType blogType) {
		this.blogType = blogType;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public Integer getBlogCount() {
		return blogCount;
	}
	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}
	public String getReleaseDateStr() {
		return releaseDateStr;
	}
	public void setReleaseDateStr(String releaseDateStr) {
		this.releaseDateStr = releaseDateStr;
	}
	
	
}
