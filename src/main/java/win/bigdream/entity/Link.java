/**
 * 
 */
package win.bigdream.entity;

/**
 * 友情链接实体
 * @author hh
 *
 */
public class Link {
	
	private Integer id;//编号  11
	private String linkName;//链接名称 100
	private String linkUrl;//链接地址   200
	private Integer orderNo;//排序序号，从小到大排序 11
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	
	
	
}
