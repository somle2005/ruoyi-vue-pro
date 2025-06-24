package com.doudian.open.api.address_addAftersaleStrategy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressAddAftersaleStrategyParam {


	@SerializedName("aftersale_strategy")
	@OpField(required = false , desc = "售后策略信息", example= "")
	private AftersaleStrategy aftersaleStrategy;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleStrategy(AftersaleStrategy aftersaleStrategy){
		this.aftersaleStrategy = aftersaleStrategy;
	}

	
	public AftersaleStrategy getAftersaleStrategy(){
		return this.aftersaleStrategy;
	}

}