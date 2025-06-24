package com.doudian.open.api.sms_sendResult.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsSendResultParam {


	@SerializedName("from_time")
	@OpField(required = true , desc = "开始时间-时间戳，单位秒", example= "1618652575")
	private Long fromTime;

	@SerializedName("to_time")
	@OpField(required = true , desc = "结束时间-时间戳，单位秒", example= "1618652575")
	private Long toTime;

	@SerializedName("sms_account")
	@OpField(required = true , desc = "短信发送渠道，主要做资源隔离", example= "1234")
	private String smsAccount;

	@SerializedName("template_id")
	@OpField(required = false , desc = "模版id", example= "444")
	private String templateId;

	@SerializedName("status")
	@OpField(required = false , desc = "发送状态： 未回执：1 发送失败：2 发送成功：3", example= "1")
	private Long status;

	@SerializedName("size")
	@OpField(required = false , desc = "查询结果大小，默认是10", example= "10")
	private Long size;

	@SerializedName("page")
	@OpField(required = false , desc = "查询结果页数，从0开始，默认是0", example= "0")
	private Long page;

	@SerializedName("sign")
	@OpField(required = false , desc = "签名内容", example= "21312")
	private String sign;

	@SerializedName("post_tel")
	@OpField(required = false , desc = "既支持明文，又支持密文", example= "15088788987")
	private String postTel;

	@SerializedName("message_id")
	@OpField(required = false , desc = "消息的唯一标识，可以用于查询短信到达等", example= "7238746")
	private String messageId;

	@SerializedName("tpl_type")
	@OpField(required = false , desc = "查询短信类型，默认是查普通文本短信：0是查询所有类型短信，1是查询普通文本短信，2是查询视频短信", example= "1")
	private Long tplType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFromTime(Long fromTime){
		this.fromTime = fromTime;
	}

	
	public Long getFromTime(){
		return this.fromTime;
	}

	
	public void setToTime(Long toTime){
		this.toTime = toTime;
	}

	
	public Long getToTime(){
		return this.toTime;
	}

	
	public void setSmsAccount(String smsAccount){
		this.smsAccount = smsAccount;
	}

	
	public String getSmsAccount(){
		return this.smsAccount;
	}

	
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	
	public String getTemplateId(){
		return this.templateId;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
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

	
	public void setSign(String sign){
		this.sign = sign;
	}

	
	public String getSign(){
		return this.sign;
	}

	
	public void setPostTel(String postTel){
		this.postTel = postTel;
	}

	
	public String getPostTel(){
		return this.postTel;
	}

	
	public void setMessageId(String messageId){
		this.messageId = messageId;
	}

	
	public String getMessageId(){
		return this.messageId;
	}

	
	public void setTplType(Long tplType){
		this.tplType = tplType;
	}

	
	public Long getTplType(){
		return this.tplType;
	}

}