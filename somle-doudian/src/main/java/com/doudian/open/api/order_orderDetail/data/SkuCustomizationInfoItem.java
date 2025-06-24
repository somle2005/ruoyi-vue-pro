package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuCustomizationInfoItem {


	@SerializedName("detail")
	@OpField(desc = "定制详情", example = "")
	private Detail detail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDetail(Detail detail){
		this.detail = detail;
	}

	
	public Detail getDetail(){
		return this.detail;
	}

}