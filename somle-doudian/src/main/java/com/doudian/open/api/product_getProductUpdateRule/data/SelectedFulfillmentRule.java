package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SelectedFulfillmentRule {


	@SerializedName("normal_rule")
	@OpField(desc = "支持c2b定制时可用的发货规则", example = "")
	private NormalRule_5_5 normalRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setNormalRule(NormalRule_5_5 normalRule){
		this.normalRule = normalRule;
	}

	
	public NormalRule_5_5 getNormalRule(){
		return this.normalRule;
	}

}