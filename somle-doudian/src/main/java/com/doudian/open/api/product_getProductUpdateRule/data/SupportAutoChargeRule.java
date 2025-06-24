package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SupportAutoChargeRule {


	@SerializedName("value")
	@OpField(desc = "是否支持自动充值", example = "false")
	private Boolean value;

	@SerializedName("disabled")
	@OpField(desc = "1", example = "1")
	private Boolean disabled;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValue(Boolean value){
		this.value = value;
	}

	
	public Boolean getValue(){
		return this.value;
	}

	
	public void setDisabled(Boolean disabled){
		this.disabled = disabled;
	}

	
	public Boolean getDisabled(){
		return this.disabled;
	}

}