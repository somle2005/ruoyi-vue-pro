package com.doudian.open.api.promise_setSkuShipTime.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PromiseSetSkuShipTimeParam {


	@SerializedName("rules")
	@OpField(required = true , desc = "sku发货时效规则", example= "")
	private List<RulesItem> rules;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRules(List<RulesItem> rules){
		this.rules = rules;
	}

	
	public List<RulesItem> getRules(){
		return this.rules;
	}

}