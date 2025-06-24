package com.doudian.open.api.logistics_getUserDeliverServiceInfos.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BizInfo {


	@SerializedName("biz_type")
	@OpField(required = true , desc = "1：抖店", example= "1")
	private Integer bizType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBizType(Integer bizType){
		this.bizType = bizType;
	}

	
	public Integer getBizType(){
		return this.bizType;
	}

}