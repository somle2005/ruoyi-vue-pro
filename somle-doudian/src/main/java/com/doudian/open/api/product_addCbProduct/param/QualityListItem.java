package com.doudian.open.api.product_addCbProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class QualityListItem {


	@SerializedName("quality_key")
	@OpField(required = false , desc = "资质key", example= "3457***9470978")
	private String qualityKey;

	@SerializedName("quality_name")
	@OpField(required = false , desc = "资质名称", example= "进货凭证")
	private String qualityName;

	@SerializedName("quality_attachments")
	@OpField(required = false , desc = "资质", example= "")
	private List<QualityAttachmentsItem> qualityAttachments;


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

}