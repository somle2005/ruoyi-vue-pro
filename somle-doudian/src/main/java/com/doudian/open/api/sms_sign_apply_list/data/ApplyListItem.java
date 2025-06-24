package com.doudian.open.api.sms_sign_apply_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ApplyListItem {


	@SerializedName("sms_sign_apply_id")
	@OpField(desc = "申请单id", example = "2342341444")
	private String smsSignApplyId;

	@SerializedName("sign")
	@OpField(desc = "签名", example = "abc")
	private String sign;

	@SerializedName("sms_account")
	@OpField(desc = "短信发送渠道，主要做资源隔离", example = "1234")
	private String smsAccount;

	@SerializedName("status")
	@OpField(desc = "审核状态： 1:审核中 2:未通过 3:已开通 4:已关闭 5:免审核（店铺名和签名完全一致时返回）", example = "2")
	private Long status;

	@SerializedName("status_remark")
	@OpField(desc = "说明", example = "签名重复")
	private String statusRemark;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSmsSignApplyId(String smsSignApplyId){
		this.smsSignApplyId = smsSignApplyId;
	}

	
	public String getSmsSignApplyId(){
		return this.smsSignApplyId;
	}

	
	public void setSign(String sign){
		this.sign = sign;
	}

	
	public String getSign(){
		return this.sign;
	}

	
	public void setSmsAccount(String smsAccount){
		this.smsAccount = smsAccount;
	}

	
	public String getSmsAccount(){
		return this.smsAccount;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setStatusRemark(String statusRemark){
		this.statusRemark = statusRemark;
	}

	
	public String getStatusRemark(){
		return this.statusRemark;
	}

}