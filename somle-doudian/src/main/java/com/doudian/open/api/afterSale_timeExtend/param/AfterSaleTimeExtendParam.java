package com.doudian.open.api.afterSale_timeExtend.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleTimeExtendParam {


	@SerializedName("aftersale_id")
	@OpField(required = true , desc = "售后单号", example= "7036706918206930000")
	private Long aftersaleId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleId(Long aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public Long getAftersaleId(){
		return this.aftersaleId;
	}

}