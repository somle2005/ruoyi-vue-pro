package com.doudian.open.api.coupons_CertSyncFailedCancelOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponsCertSyncFailedCancelOrderData {


	@SerializedName("RetStatus")
	@OpField(desc = "返回状态", example = "000000")
	private String retStatus;

	@SerializedName("RetCode")
	@OpField(desc = "返回码", example = "000000")
	private String retCode;

	@SerializedName("RetMessage")
	@OpField(desc = "返回信息", example = "000000")
	private String retMessage;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRetStatus(String retStatus){
		this.retStatus = retStatus;
	}

	
	public String getRetStatus(){
		return this.retStatus;
	}

	
	public void setRetCode(String retCode){
		this.retCode = retCode;
	}

	
	public String getRetCode(){
		return this.retCode;
	}

	
	public void setRetMessage(String retMessage){
		this.retMessage = retMessage;
	}

	
	public String getRetMessage(){
		return this.retMessage;
	}

}