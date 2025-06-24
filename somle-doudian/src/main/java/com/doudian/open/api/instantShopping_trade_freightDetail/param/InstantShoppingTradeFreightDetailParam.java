package com.doudian.open.api.instantShopping_trade_freightDetail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class InstantShoppingTradeFreightDetailParam {


	@SerializedName("freight_id")
	@OpField(required = false , desc = "运费模板id", example= "1")
	private Long freightId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFreightId(Long freightId){
		this.freightId = freightId;
	}

	
	public Long getFreightId(){
		return this.freightId;
	}

}