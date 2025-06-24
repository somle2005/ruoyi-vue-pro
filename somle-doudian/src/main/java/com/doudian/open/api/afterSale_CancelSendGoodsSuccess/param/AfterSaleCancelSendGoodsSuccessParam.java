package com.doudian.open.api.afterSale_CancelSendGoodsSuccess.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleCancelSendGoodsSuccessParam {


	@SerializedName("aftersale_id")
	@OpField(required = true , desc = "售后单ID", example= "12345")
	private String aftersaleId;

	@SerializedName("op_time")
	@OpField(required = true , desc = "unix时间戳，单位为秒", example= "1627905819")
	private Long opTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleId(String aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public String getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setOpTime(Long opTime){
		this.opTime = opTime;
	}

	
	public Long getOpTime(){
		return this.opTime;
	}

}