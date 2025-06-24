package com.doudian.open.api.sms_template_delete.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsTemplateDeleteData {


	@SerializedName("code")
	@OpField(desc = "是否成功 0表示成功", example = "0")
	private Long code;

	@SerializedName("message")
	@OpField(desc = "说明", example = "abc")
	private String message;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

}