package com.doudian.open.api.sms_sign_apply.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsSignApplyData {


	@SerializedName("sms_account")
	@OpField(desc = "短信发送渠道，主要做资源隔离", example = "1234")
	private String smsAccount;

	@SerializedName("sms_sign_apply_id")
	@OpField(desc = "短信签名申请单id", example = "23423423")
	private String smsSignApplyId;

	@SerializedName("code")
	@OpField(desc = "是否成功 0表示成功", example = "0")
	private Long code;

	@SerializedName("message")
	@OpField(desc = "说明", example = "成功")
	private String message;

	@SerializedName("sign")
	@OpField(desc = "签名", example = "abc")
	private String sign;

	@SerializedName("status")
	@OpField(desc = "审核状态： 1:审核中 2:未通过 3:已开通 4:已关闭 5:免审核（店铺名和签名完全一致时返回）", example = "1")
	private Long status;


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

	
	public void setCode(Long code){
		this.code = code;
	}

	
	public Long getCode(){
		return this.code;
	}

	
	public void setMessage(String message){
		this.message = message;
	}

	
	public String getMessage(){
		return this.message;
	}

	
	public void setSign(String sign){
		this.sign = sign;
	}

	
	public String getSign(){
		return this.sign;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

}