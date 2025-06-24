package com.doudian.open.api.address_getAftersaleStrategy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressGetAftersaleStrategyParam {


	@SerializedName("strategy_id")
	@OpField(required = false , desc = "策略ID;", example= "必填，策略ID")
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