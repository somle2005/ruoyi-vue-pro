package com.doudian.open.api.address_updateAftersaleStrategy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressUpdateAftersaleStrategyParam {


	@SerializedName("aftersale_strategy")
	@OpField(required = false , desc = "售后策略;", example= "")
	private AftersaleStrategy aftersaleStrategy;

	@SerializedName("operation")
	@OpField(required = false , desc = "操作类型，必传。0-全覆盖地址策略，会用传递过来的请求中的信息覆盖已有的信息；1-只是增加绑定商品；2-只是删除绑定商品。", example= "0")
	private Integer operation;


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

	
	public void setOperation(Integer operation){
		this.operation = operation;
	}

	
	public Integer getOperation(){
		return this.operation;
	}

}