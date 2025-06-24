package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class QualityListItem {


	@SerializedName("quality_key")
	@OpField(required = true , desc = "资质key", example= "3457***9470978")
	private String qualityKey;

	@SerializedName("quality_name")
	@OpField(required = true , desc = "资质名称", example= "进货凭证")
	private String qualityName;

	@SerializedName("quality_attachments")
	@OpField(required = true , desc = "资质", example= "")
	private List<QualityAttachmentsItem> qualityAttachments;

	@SerializedName("quality_id")
	@OpField(required = false , desc = "资质id", example= "1234")
	private Long qualityId;

	@SerializedName("quality_content_name")
	@OpField(required = false , desc = "资质名", example= "版权页资质")
	private String qualityContentName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setQualityKey(String qualityKey){
		this.qualityKey = qualityKey;
	}

	
	public String getQualityKey(){
		return this.qualityKey;
	}

	
	public void setQualityName(String qualityName){
		this.qualityName = qualityName;
	}

	
	public String getQualityName(){
		return this.qualityName;
	}

	
	public void setQualityAttachments(List<QualityAttachmentsItem> qualityAttachments){
		this.qualityAttachments = qualityAttachments;
	}

	
	public List<QualityAttachmentsItem> getQualityAttachments(){
		return this.qualityAttachments;
	}

	
	public void setQualityId(Long qualityId){
		this.qualityId = qualityId;
	}

	
	public Long getQualityId(){
		return this.qualityId;
	}

	
	public void setQualityContentName(String qualityContentName){
		this.qualityContentName = qualityContentName;
	}

	
	public String getQualityContentName(){
		return this.qualityContentName;
	}

}