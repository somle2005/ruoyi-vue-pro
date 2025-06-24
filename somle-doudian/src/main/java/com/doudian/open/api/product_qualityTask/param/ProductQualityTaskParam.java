package com.doudian.open.api.product_qualityTask.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductQualityTaskParam {


	@SerializedName("brief_only")
	@OpField(required = false , desc = "是否只返回简要信息，不写默认false", example= "true")
	private Boolean briefOnly;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBriefOnly(Boolean briefOnly){
		this.briefOnly = briefOnly;
	}

	
	public Boolean getBriefOnly(){
		return this.briefOnly;
	}

}