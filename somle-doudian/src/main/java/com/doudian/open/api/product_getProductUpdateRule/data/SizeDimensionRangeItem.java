package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SizeDimensionRangeItem {


	@SerializedName("max")
	@OpField(desc = "最小范围", example = "200")
	private Long max;

	@SerializedName("min")
	@OpField(desc = "最大范围", example = "40")
	private Long min;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMax(Long max){
		this.max = max;
	}

	
	public Long getMax(){
		return this.max;
	}

	
	public void setMin(Long min){
		this.min = min;
	}

	
	public Long getMin(){
		return this.min;
	}

}