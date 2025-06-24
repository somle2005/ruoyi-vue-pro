package com.doudian.open.api.sms_batchSend.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SmsBatchSendParam {


	@SerializedName("sms_account")
	@OpField(required = true , desc = "短信发送渠道，主要做资源隔离", example= "1234")
	private String smsAccount;

	@SerializedName("sign")
	@OpField(required = true , desc = "短信签名", example= "abc")
	private String sign;

	@SerializedName("sms_message_list")
	@OpField(required = true , desc = "短信列表", example= "")
	private List<SmsMessageListItem> smsMessageList;

	@SerializedName("template_id")
	@OpField(required = true , desc = "短信模板id", example= "60505C68")
	private String templateId;

	@SerializedName("tag")
	@OpField(required = false , desc = "透传字段，回执的时候原样返回给调用方，最大长度512字符", example= "123456")
	private String tag;

	@SerializedName("user_ext_code")
	@OpField(required = false , desc = "用户自定义扩展码，仅当允许自定义扩展码的时候生效", example= "abc")
	private String userExtCode;

	@SerializedName("link_id")
	@OpField(required = false , desc = "需要链接统计效果时必传，且    2. tag需要以map[string]interface{}的json形式传入，并且带上link_id:", example= "121292221")
	private String linkId;

	@SerializedName("mini_app_link_id")
	@OpField(required = false , desc = "需要链接统计效果时必传，且    2. tag需要以map[string]interface{}的json形式传入，并且带上mini_app_link_id:", example= "21628162812")
	private String miniAppLinkId;


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

	
	public void setSmsMessageList(List<SmsMessageListItem> smsMessageList){
		this.smsMessageList = smsMessageList;
	}

	
	public List<SmsMessageListItem> getSmsMessageList(){
		return this.smsMessageList;
	}

	
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	
	public String getTemplateId(){
		return this.templateId;
	}

	
	public void setTag(String tag){
		this.tag = tag;
	}

	
	public String getTag(){
		return this.tag;
	}

	
	public void setUserExtCode(String userExtCode){
		this.userExtCode = userExtCode;
	}

	
	public String getUserExtCode(){
		return this.userExtCode;
	}

	
	public void setLinkId(String linkId){
		this.linkId = linkId;
	}

	
	public String getLinkId(){
		return this.linkId;
	}

	
	public void setMiniAppLinkId(String miniAppLinkId){
		this.miniAppLinkId = miniAppLinkId;
	}

	
	public String getMiniAppLinkId(){
		return this.miniAppLinkId;
	}

}