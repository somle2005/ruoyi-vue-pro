package com.doudian.open.api.product_previewChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DetailBriefMaterial {


	@SerializedName("reject_reason")
	@OpField(desc = "审核驳回原因", example = "不清晰")
	private String rejectReason;

	@SerializedName("material_status")
	@OpField(desc = "已经废弃字段，请不要再使用，描述不单独审核，只需要看渠道品审核字段check_status", example = "1")
	private Long materialStatus;

	@SerializedName("material_type")
	@OpField(desc = "素材类型，详情图为28", example = "18")
	private Long materialType;

	@SerializedName("img_list")
	@OpField(desc = "详情图列表", example = "[xxxx, xxxx]")
	private List<String> imgList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setMaterialType(Long materialType){
		this.materialType = materialType;
	}

	
	public Long getMaterialType(){
		return this.materialType;
	}

	
	public void setImgList(List<String> imgList){
		this.imgList = imgList;
	}

	
	public List<String> getImgList(){
		return this.imgList;
	}

}