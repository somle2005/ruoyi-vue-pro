package com.doudian.open.api.sms_batchSend.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SendResultListItem {


	@SerializedName("code")
	@OpField(desc = "错误码，0表示成功", example = "0")
	private Long code;

	@SerializedName("message")
	@OpField(desc = "说明", example = "abc")
	private String message;

	@SerializedName("message_id")
	@OpField(desc = "消息的唯一标识，可以用于查询短信到达等", example = "435435435435")
	private String messageId;


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

	
	public void setMessageId(String messageId){
		this.messageId = messageId;
	}

	
	public String getMessageId(){
		return this.messageId;
	}

}