package com.doudian.open.api.sms_sign_search.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsSignSearchParam {


	@SerializedName("sms_account")
	@OpField(required = true , desc = "短信发送渠道，主要做资源隔离", example= "1234")
	private String smsAccount;

	@SerializedName("like")
	@OpField(required = false , desc = "模糊搜索串", example= "abc")
	private String like;

	@SerializedName("size")
	@OpField(required = false , desc = "每页大小，默认10", example= "10")
	private Long size;

	@SerializedName("page")
	@OpField(required = false , desc = "页码，默认0", example= "0")
	private Long page;


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

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

}