package com.doudian.open.api.sms_template_apply.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsTemplateApplyParam {


	@SerializedName("sms_account")
	@OpField(required = true , desc = "短信发送渠道，主要做资源隔离", example= "12345")
	private String smsAccount;

	@SerializedName("template_type")
	@OpField(required = true , desc = "CN_NTC 国内通知短信 CN_MKT 国内营销短信 CN_OTP 国内验证码", example= "CN_NTC")
	private String templateType;

	@SerializedName("template_name")
	@OpField(required = true , desc = "短信模板名称", example= "618大促")
	private String templateName;

	@SerializedName("template_content")
	@OpField(required = true , desc = "短信模板内容： 英文短信：整条短信（包括签名+模板+变量中的内容）最多支持140个英文字符，超出将按140个字符截取为多条短信进行发送，费用按截取的条数收费； 非英文短信：整条短信（包括签名+模板+变量中的内容）最多支持70字符，超出将按70个字符截取为多条短信进行发送，费用按截取的条数收费；", example= "您购买的商品已重新发出，${name}快递运单号：${number}，关注“XXX”公众号刷新订单获取最新物流信息哦~给您造成不便敬请谅解。")
	private String templateContent;


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

	
	public void setTemplateType(String templateType){
		this.templateType = templateType;
	}

	
	public String getTemplateType(){
		return this.templateType;
	}

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
	}

	
	public void setTemplateContent(String templateContent){
		this.templateContent = templateContent;
	}

	
	public String getTemplateContent(){
		return this.templateContent;
	}

}