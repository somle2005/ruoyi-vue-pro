package com.doudian.open.api.product_auditList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class RecordsItem {


	@SerializedName("audit_reason_details")
	@OpField(desc = "驳回原因列表", example = "")
	private List<AuditReasonDetailsItem> auditReasonDetails;

	@SerializedName("product_id")
	@OpField(desc = "商品id", example = "111")
	private Long productId;

	@SerializedName("title")
	@OpField(desc = "商品名称", example = "测试商品")
	private String title;

	@SerializedName("img_url")
	@OpField(desc = "商品主图", example = "http://aaa")
	private String imgUrl;

	@SerializedName("publish_status")
	@OpField(desc = "0-审核中 1-审核通过 2-审核拒绝", example = "0")
	private Long publishStatus;

	@SerializedName("publish_time")
	@OpField(desc = "提审时间，单位为秒", example = "1668135600")
	private Long publishTime;

	@SerializedName("audit_time")
	@OpField(desc = "审核通过/拒绝时间，单位为秒", example = "1668135600")
	private Long auditTime;

	@SerializedName("audit_reason")
	@OpField(desc = "审核未通过理由", example = "审核未通过理由")
	private Map<String,List<String>> auditReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuditReasonDetails(List<AuditReasonDetailsItem> auditReasonDetails){
		this.auditReasonDetails = auditReasonDetails;
	}

	
	public List<AuditReasonDetailsItem> getAuditReasonDetails(){
		return this.auditReasonDetails;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setTitle(String title){
		this.title = title;
	}

	
	public String getTitle(){
		return this.title;
	}

	
	public void setImgUrl(String imgUrl){
		this.imgUrl = imgUrl;
	}

	
	public String getImgUrl(){
		return this.imgUrl;
	}

	
	public void setPublishStatus(Long publishStatus){
		this.publishStatus = publishStatus;
	}

	
	public Long getPublishStatus(){
		return this.publishStatus;
	}

	
	public void setPublishTime(Long publishTime){
		this.publishTime = publishTime;
	}

	
	public Long getPublishTime(){
		return this.publishTime;
	}

	
	public void setAuditTime(Long auditTime){
		this.auditTime = auditTime;
	}

	
	public Long getAuditTime(){
		return this.auditTime;
	}

	
	public void setAuditReason(Map<String,List<String>> auditReason){
		this.auditReason = auditReason;
	}

	
	public Map<String,List<String>> getAuditReason(){
		return this.auditReason;
	}

}