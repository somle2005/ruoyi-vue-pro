package com.doudian.open.api.product_qualityList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductQualityListParam {


	@SerializedName("product_id")
	@OpField(required = false , desc = "商品ID", example= "3502373827210525080")
	private Long productId;

	@SerializedName("product_name")
	@OpField(required = false , desc = "商品名字", example= "奈克牌皮鞋")
	private String productName;

	@SerializedName("order_by")
	@OpField(required = false , desc = "排序方式，降序“desc”，升序“asc”， 不传默认降序", example= "desc")
	private String orderBy;

	@SerializedName("page")
	@OpField(required = true , desc = "分页参数，页数从1开始", example= "1")
	private Long page;

	@SerializedName("page_size")
	@OpField(required = true , desc = "分页参数，每页大小，填写范围1~100；", example= "20")
	private Long pageSize;

	@SerializedName("task_id")
	@OpField(required = true , desc = "【已废弃】开发者可以传入：9999999999", example= "11013491")
	private Long taskId;

	@SerializedName("diagnose_status")
	@OpField(required = false , desc = "商品诊断状态，0-待诊断；1-待优化；2-已修改审核中；3-已优化；以前的status 字段因为配置错误已经删除，请使用此新字段", example= "[1]")
	private List<Long> diagnoseStatus;

	@SerializedName("quality_score_version")
	@OpField(required = false , desc = "质量分版本", example= "middle_score")
	private String qualityScoreVersion;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setOrderBy(String orderBy){
		this.orderBy = orderBy;
	}

	
	public String getOrderBy(){
		return this.orderBy;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

	
	public void setTaskId(Long taskId){
		this.taskId = taskId;
	}

	
	public Long getTaskId(){
		return this.taskId;
	}

	
	public void setDiagnoseStatus(List<Long> diagnoseStatus){
		this.diagnoseStatus = diagnoseStatus;
	}

	
	public List<Long> getDiagnoseStatus(){
		return this.diagnoseStatus;
	}

	
	public void setQualityScoreVersion(String qualityScoreVersion){
		this.qualityScoreVersion = qualityScoreVersion;
	}

	
	public String getQualityScoreVersion(){
		return this.qualityScoreVersion;
	}

}