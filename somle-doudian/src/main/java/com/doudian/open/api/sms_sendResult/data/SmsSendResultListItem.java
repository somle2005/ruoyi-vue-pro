package com.doudian.open.api.sms_sendResult.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsSendResultListItem {


	@SerializedName("send_time")
	@OpField(desc = "发送时间-时间戳，单位秒", example = "1618652575")
	private Long sendTime;

	@SerializedName("sms_content")
	@OpField(desc = "短信内容", example = "您购买的商品已重新发出，圆通快递快递运单号：1234，关注“XXX”公众号刷新订单获取最新物流信息哦~给您造成不便敬请谅解。")
	private String smsContent;

	@SerializedName("status")
	@OpField(desc = "未回执：1 发送失败：2 发送成功：3", example = "1")
	private Long status;

	@SerializedName("count")
	@OpField(desc = "计费条数，如果短信过长，会分多次计费", example = "1")
	private Long count;

	@SerializedName("code")
	@OpField(desc = "错误码", example = "0")
	private Long code;

	@SerializedName("message")
	@OpField(desc = "错误说明", example = "abc")
	private String message;

	@SerializedName("message_id")
	@OpField(desc = "消息ID", example = "MessageID1")
	private String messageId;

	@SerializedName("tag")
	@OpField(desc = "透传字段，回执的时候原样返回给调用方。", example = "12345")
	private String tag;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSendTime(Long sendTime){
		this.sendTime = sendTime;
	}

	
	public Long getSendTime(){
		return this.sendTime;
	}

	
	public void setSmsContent(String smsContent){
		this.smsContent = smsContent;
	}

	
	public String getSmsContent(){
		return this.smsContent;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setCount(Long count){
		this.count = count;
	}

	
	public Long getCount(){
		return this.count;
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

	
	public void setTag(String tag){
		this.tag = tag;
	}

	
	public String getTag(){
		return this.tag;
	}

}