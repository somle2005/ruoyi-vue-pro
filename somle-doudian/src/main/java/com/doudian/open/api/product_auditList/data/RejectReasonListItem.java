package com.doudian.open.api.product_auditList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class RejectReasonListItem {


	@SerializedName("sku_infos")
	@OpField(desc = "明细sku", example = "")
	private List<SkuInfosItem> skuInfos;

	@SerializedName("reject_img_list")
	@OpField(desc = "驳回图片", example = "")
	private List<RejectImgListItem> rejectImgList;

	@SerializedName("reason_text")
	@OpField(desc = "驳回原因", example = "驳回原因")
	private String reasonText;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuInfos(List<SkuInfosItem> skuInfos){
		this.skuInfos = skuInfos;
	}

	
	public List<SkuInfosItem> getSkuInfos(){
		return this.skuInfos;
	}

	
	public void setRejectImgList(List<RejectImgListItem> rejectImgList){
		this.rejectImgList = rejectImgList;
	}

	
	public List<RejectImgListItem> getRejectImgList(){
		return this.rejectImgList;
	}

	
	public void setReasonText(String reasonText){
		this.reasonText = reasonText;
	}

	
	public String getReasonText(){
		return this.reasonText;
	}

}