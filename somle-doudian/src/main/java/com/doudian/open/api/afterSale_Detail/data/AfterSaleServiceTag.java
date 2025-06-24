package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AfterSaleServiceTag {


	@SerializedName("after_sale_service_tag")
	@OpField(desc = "售后服务标签", example = "")
	private List<AfterSaleServiceTagItem> afterSaleServiceTag;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAfterSaleServiceTag(List<AfterSaleServiceTagItem> afterSaleServiceTag){
		this.afterSaleServiceTag = afterSaleServiceTag;
	}

	
	public List<AfterSaleServiceTagItem> getAfterSaleServiceTag(){
		return this.afterSaleServiceTag;
	}

}