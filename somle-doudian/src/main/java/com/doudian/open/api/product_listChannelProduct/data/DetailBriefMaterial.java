package com.doudian.open.api.product_listChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DetailBriefMaterial {


	@SerializedName("material_type")
	@OpField(desc = "素材类型，详情图为28", example = "28")
	private Long materialType;

	@SerializedName("reject_reason")
	@OpField(desc = "审核驳回原因", example = "图片不清晰")
	private String rejectReason;

	@SerializedName("material_status")
	@OpField(desc = "素材状态0：草稿", example = "0")
	private Long materialStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialType(Long materialType){
		this.materialType = materialType;
	}

	
	public Long getMaterialType(){
		return this.materialType;
	}

	
	public void setRejectReason(String rejectReason){
		this.rejectReason = rejectReason;
	}

	
	public String getRejectReason(){
		return this.rejectReason;
	}

	
	public void setMaterialStatus(Long materialStatus){
		this.materialStatus = materialStatus;
	}

	
	public Long getMaterialStatus(){
		return this.materialStatus;
	}

}