package com.doudian.open.api.sms_template_revoke.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsTemplateRevokeParam {


	@SerializedName("sms_account")
	@OpField(required = true , desc = "短信发送渠道，主要做资源隔离", example= "1234")
	private String smsAccount;

	@SerializedName("sms_template_apply_id")
	@OpField(required = true , desc = "短信模板申请单id", example= "1234435435")
	private String smsTemplateApplyId;


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

	
	public void setSmsTemplateApplyId(String smsTemplateApplyId){
		this.smsTemplateApplyId = smsTemplateApplyId;
	}

	
	public String getSmsTemplateApplyId(){
		return this.smsTemplateApplyId;
	}

}