package com.doudian.open.api.sms_sign_search.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SignSearchListItem {


	@SerializedName("sms_account")
	@OpField(desc = "短信发送渠道，主要做资源隔离", example = "1234")
	private String smsAccount;

	@SerializedName("sign")
	@OpField(desc = "签名", example = "abc")
	private String sign;


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

	
	public void setSign(String sign){
		this.sign = sign;
	}

	
	public String getSign(){
		return this.sign;
	}

}