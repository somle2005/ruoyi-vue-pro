package com.doudian.open.api.sms_sign_apply_revoke.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsSignApplyRevokeParam {


	@SerializedName("sms_account")
	@OpField(required = true , desc = "短信发送渠道，主要做资源隔离", example= "1234")
	private String smsAccount;

	@SerializedName("sms_sign_apply_id")
	@OpField(required = true , desc = "申请单id", example= "1234435435")
	private String smsSignApplyId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSmsAccount(String smsAccount){
		this.smsAccount = smsAccount;
	}

	
	public String getSmsAccount(){
		return this.smsAccount;
	}

	
	public void setSmsSignApplyId(String smsSignApplyId){
		this.smsSignApplyId = smsSignApplyId;
	}

	
	public String getSmsSignApplyId(){
		return this.smsSignApplyId;
	}

}