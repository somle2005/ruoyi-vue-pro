package com.doudian.open.api.coupons_extendCertValidEndByOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponsExtendCertValidEndByOrderData {


	@SerializedName("ret_status")
	@OpField(desc = "是否成功", example = "SUCCESS")
	private String retStatus;

	@SerializedName("ret_code")
	@OpField(desc = "错误码", example = "010027")
	private String retCode;

	@SerializedName("ret_message")
	@OpField(desc = "错误描述", example = "只能延长卡券有效期，请检查")
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