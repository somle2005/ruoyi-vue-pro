package com.doudian.open.api.sms_sign_apply_list.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsSignApplyListParam {


	@SerializedName("sms_account")
	@OpField(required = true , desc = "短信发送渠道，主要做资源隔离", example= "1234")
	private String smsAccount;

	@SerializedName("like")
	@OpField(required = false , desc = "搜索", example= "1")
	private String like;

	@SerializedName("page")
	@OpField(required = false , desc = "页码，默认0", example= "0")
	private Long page;

	@SerializedName("size")
	@OpField(required = false , desc = "每页大小，默认10", example= "10")
	private Long size;

	@SerializedName("sms_sign_apply_id")
	@OpField(required = false , desc = "申请单id", example= "444")
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

	
	public void setLike(String like){
		this.like = like;
	}

	
	public String getLike(){
		return this.like;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setSmsSignApplyId(String smsSignApplyId){
		this.smsSignApplyId = smsSignApplyId;
	}

	
	public String getSmsSignApplyId(){
		return this.smsSignApplyId;
	}

}