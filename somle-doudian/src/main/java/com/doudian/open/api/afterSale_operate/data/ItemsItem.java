package com.doudian.open.api.afterSale_operate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ItemsItem {


	@SerializedName("aftersale_id")
	@OpField(desc = "售后单号", example = "6959800000297566494")
	private Long aftersaleId;

	@SerializedName("status_code")
	@OpField(desc = "操作结果码", example = "0")
	private Long statusCode;

	@SerializedName("status_msg")
	@OpField(desc = "操作 结果描述", example = "success")
	private String statusMsg;


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

	
	public void setStatusCode(Long statusCode){
		this.statusCode = statusCode;
	}

	
	public Long getStatusCode(){
		return this.statusCode;
	}

	
	public void setStatusMsg(String statusMsg){
		this.statusMsg = statusMsg;
	}

	
	public String getStatusMsg(){
		return this.statusMsg;
	}

}