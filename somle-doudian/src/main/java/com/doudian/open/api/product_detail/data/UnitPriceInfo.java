package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UnitPriceInfo {


	@SerializedName("price_rule_type")
	@OpField(desc = "1：投资金单位价格2：首饰金单位价格", example = "1")
	private Integer priceRuleType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPriceRuleType(Integer priceRuleType){
		this.priceRuleType = priceRuleType;
	}

	
	public Integer getPriceRuleType(){
		return this.priceRuleType;
	}

}