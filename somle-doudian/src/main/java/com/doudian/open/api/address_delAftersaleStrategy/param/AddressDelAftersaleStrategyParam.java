package com.doudian.open.api.address_delAftersaleStrategy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressDelAftersaleStrategyParam {


	@SerializedName("strategy_id")
	@OpField(required = false , desc = "必填，售后地址策略。", example= "AFS7418487171435053348")
	private String strategyId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStrategyId(String strategyId){
		this.strategyId = strategyId;
	}

	
	public String getStrategyId(){
		return this.strategyId;
	}

}