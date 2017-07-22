/**
 * 
 */
package win.bigdream.entity;

/**
 * 博客类型
 * @author hh
 *
 */
public class BlogType {
	private Integer id;//编号  11
	private String typeName;//博客类型名称  30
	private Integer orderNo;//排序序号 从小到大排序 11
	private Integer blogCount;//数量
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getBlogCount() {
		return blogCount;
	}
	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}
	
	
}
