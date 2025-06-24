package com.doudian.open.api.product_auditList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductAuditListParam {


	@SerializedName("publish_status")
	@OpField(required = true , desc = "指定审核状态返回商品列表：0-审核中 1-审核通过 2-审核拒绝", example= "0")
	private Long publishStatus;

	@SerializedName("page")
	@OpField(required = true , desc = "第几页（第一页为0，最大为99）", example= "0")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "每页返回条数，最多支持100条", example= "20")
	private Long size;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品id", example= "11")
	private Long productId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPublishStatus(Long publishStatus){
		this.publishStatus = publishStatus;
	}

	
	public Long getPublishStatus(){
		return this.publishStatus;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

}