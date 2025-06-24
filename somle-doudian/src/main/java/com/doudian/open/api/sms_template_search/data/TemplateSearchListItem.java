package com.doudian.open.api.sms_template_search.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TemplateSearchListItem {


	@SerializedName("sms_account")
	@OpField(desc = "短信发送渠道，主要做资源隔离", example = "1234")
	private String smsAccount;

	@SerializedName("template_content")
	@OpField(desc = "短信模版内容", example = "您购买的商品已重新发出，${name}快递运单号：${number}，关注“XXX”公众号刷新订单获取最新物流信息哦~给您造成不便敬请谅解。")
	private String templateContent;

	@SerializedName("template_id")
	@OpField(desc = "短信模板id", example = "43534")
	private String templateId;

	@SerializedName("channel_type")
	@OpField(desc = "CN_NTC 国内通知短信 CN_MKT 国内营销短信（免审模版营销短信将自带退订功能，非免审模版需自行添加退订描述） CN_OTP 国内验证码", example = "CN_NTC")
	private String channelType;

	@SerializedName("template_name")
	@OpField(desc = "短信模版名称", example = "618大促")
	private String templateName;


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

	
	public void setTemplateContent(String templateContent){
		this.templateContent = templateContent;
	}

	
	public String getTemplateContent(){
		return this.templateContent;
	}

	
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	
	public String getTemplateId(){
		return this.templateId;
	}

	
	public void setChannelType(String channelType){
		this.channelType = channelType;
	}

	
	public String getChannelType(){
		return this.channelType;
	}

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
	}

}