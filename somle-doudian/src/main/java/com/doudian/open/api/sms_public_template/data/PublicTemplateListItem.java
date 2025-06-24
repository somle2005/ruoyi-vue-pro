package com.doudian.open.api.sms_public_template.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PublicTemplateListItem {


	@SerializedName("template_id")
	@OpField(desc = "模版id", example = "ST_0000")
	private String templateId;

	@SerializedName("template_name")
	@OpField(desc = "模版名称", example = "验证码")
	private String templateName;

	@SerializedName("template_content")
	@OpField(desc = "模版内容", example = "你的验证码是${code},3分钟内有效")
	private String templateContent;

	@SerializedName("channel_type")
	@OpField(desc = "模版类型", example = "CN_OTP")
	private String channelType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	
	public String getTemplateId(){
		return this.templateId;
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

	
	public void setChannelType(String channelType){
		this.channelType = channelType;
	}

	
	public String getChannelType(){
		return this.channelType;
	}

}