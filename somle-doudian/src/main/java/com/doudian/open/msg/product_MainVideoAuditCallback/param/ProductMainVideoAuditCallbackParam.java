package com.doudian.open.msg.product_MainVideoAuditCallback.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductMainVideoAuditCallbackParam {


	@SerializedName("audit_result_status")
	@OpField(required = false , desc = "审核状态 1：通过 2:拒绝", example= "2")
	private Long auditResultStatus;

	@SerializedName("reject_reason")
	@OpField(required = false , desc = "拒绝原因", example= "图片上文字信息凌乱，请调整后再提交")
	private String rejectReason;

	@SerializedName("material_id")
	@OpField(required = false , desc = "商品ID", example= "3672668941454541056")
	private Long materialId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "素材ID", example= "3672668941454541056")
	private Long productId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuditResultStatus(Long auditResultStatus){
		this.auditResultStatus = auditResultStatus;
	}

	
	public Long getAuditResultStatus(){
		return this.auditResultStatus;
	}

	
	public void setRejectReason(String rejectReason){
		this.rejectReason = rejectReason;
	}

	
	public String getRejectReason(){
		return this.rejectReason;
	}

	
	public void setMaterialId(Long materialId){
		this.materialId = materialId;
	}

	
	public Long getMaterialId(){
		return this.materialId;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

}