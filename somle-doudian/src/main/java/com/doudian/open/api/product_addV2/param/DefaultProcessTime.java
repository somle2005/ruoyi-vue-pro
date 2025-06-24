package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DefaultProcessTime {


	@SerializedName("value")
	@OpField(required = false , desc = "商品默认处理时长，单位秒", example= "60")
	private Long value;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValue(Long value){
		this.value = value;
	}

	
	public Long getValue(){
		return this.value;
	}

}