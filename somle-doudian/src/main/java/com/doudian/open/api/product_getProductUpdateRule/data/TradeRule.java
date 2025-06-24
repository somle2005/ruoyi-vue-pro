package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TradeRule {


	@SerializedName("support_auto_charge_rule")
	@OpField(desc = "自动充值相关的规则", example = "")
	private SupportAutoChargeRule supportAutoChargeRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSupportAutoChargeRule(SupportAutoChargeRule supportAutoChargeRule){
		this.supportAutoChargeRule = supportAutoChargeRule;
	}

	
	public SupportAutoChargeRule getSupportAutoChargeRule(){
		return this.supportAutoChargeRule;
	}

}