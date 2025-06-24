package com.doudian.open.api.product_queryPropAutoOptimizeConfig.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductQueryPropAutoOptimizeConfigData {


	@SerializedName("is_auto_optimize")
	@OpField(desc = "是否开启店铺属性自动优化", example = "true")
	private Boolean isAutoOptimize;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsAutoOptimize(Boolean isAutoOptimize){
		this.isAutoOptimize = isAutoOptimize;
	}

	
	public Boolean getIsAutoOptimize(){
		return this.isAutoOptimize;
	}

}