package com.doudian.open.api.product_getProductShopRule.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetProductShopRuleParam {


	@SerializedName("rule_types")
	@OpField(required = true , desc = "驳回自动整改:audit_auto_rectify", example= "需要获取的规则列表")
	private List<String> ruleTypes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRuleTypes(List<String> ruleTypes){
		this.ruleTypes = ruleTypes;
	}

	
	public List<String> getRuleTypes(){
		return this.ruleTypes;
	}

}