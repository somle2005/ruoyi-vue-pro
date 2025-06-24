package com.doudian.open.api.sms_template_apply.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsTemplateApplyData {


	@SerializedName("sms_account")
	@OpField(desc = "短信发送渠道，主要做资源隔离", example = "1234")
	private String smsAccount;

	@SerializedName("template_content")
	@OpField(desc = "短信模板内容： 英文短信：最多支持140个英文字符，超出将按140个字符截取为多条短信进行发送，费用按截取的条数收费； 非英文短信：最多支持140个英文字符，超出将按140个字符截取为多条短信进行发送，费用按截取的条数收费；", example = "您购买的商品已重新发出，${name}快递运单号：${number}，关注“XXX”公众号刷新订单获取最新物流信息哦~给您造成不便敬请谅解。")
	private String templateContent;

	@SerializedName("template_name")
	@OpField(desc = "短信模版名称", example = "618大促")
	private String templateName;

	@SerializedName("sms_template_id")
	@OpField(desc = "模版id", example = "234234")
	private String smsTemplateId;

	@SerializedName("sms_template_apply_id")
	@OpField(desc = "短信模板申请单id", example = "23423423")
	private String smsTemplateApplyId;

	@SerializedName("code")
	@OpField(desc = "是否成功 0表示成功", example = "0")
	private Long code;

	@SerializedName("message")
	@OpField(desc = "说明", example = "成功")
	private String message;


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

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
	}

	
	public void setSmsTemplateId(String smsTemplateId){
		this.smsTemplateId = smsTemplateId;
	}

	
	public String getSmsTemplateId(){
		return this.smsTemplateId;
	}

	
	public void setSmsTemplateApplyId(String smsTemplateApplyId){
		this.smsTemplateApplyId = smsTemplateApplyId;
	}

	
	public String getSmsTemplateApplyId(){
		return this.smsTemplateApplyId;
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