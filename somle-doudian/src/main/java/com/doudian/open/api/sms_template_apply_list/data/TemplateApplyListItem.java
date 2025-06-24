package com.doudian.open.api.sms_template_apply_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TemplateApplyListItem {


	@SerializedName("template_id")
	@OpField(desc = "模板id", example = "ST_123456")
	private String templateId;

	@SerializedName("sms_account")
	@OpField(desc = "短信发送渠道，主要做资源隔离", example = "1234")
	private String smsAccount;

	@SerializedName("sms_template_apply_id")
	@OpField(desc = "短信模板申请单id", example = "23423423")
	private String smsTemplateApplyId;

	@SerializedName("template_name")
	@OpField(desc = "短信模版名称", example = "618大促")
	private String templateName;

	@SerializedName("template_content")
	@OpField(desc = "短信模版内容", example = "您购买的商品已重新发出，${name}快递运单号：${number}，关注“XXX”公众号刷新订单获取最新物流信息哦~给您造成不便敬请谅解。")
	private String templateContent;

	@SerializedName("channel_type")
	@OpField(desc = "CN_NTC 国内通知短信 CN_MKT 国内营销短信（营销短信将自带退订功能） CN_OTP 国内验证码", example = "模版类型")
	private String channelType;

	@SerializedName("status")
	@OpField(desc = "审核状态： 1:审核中 2:未通过 3:已开通 4:已关闭", example = "1")
	private Long status;

	@SerializedName("status_remark")
	@OpField(desc = "状态说明", example = "签名重复")
	private String statusRemark;


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

	
	public void setSmsAccount(String smsAccount){
		this.smsAccount = smsAccount;
	}

	
	public String getSmsAccount(){
		return this.smsAccount;
	}

	
	public void setSmsTemplateApplyId(String smsTemplateApplyId){
		this.smsTemplateApplyId = smsTemplateApplyId;
	}

	
	public String getSmsTemplateApplyId(){
		return this.smsTemplateApplyId;
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

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setStatusRemark(String statusRemark){
		this.statusRemark = statusRemark;
	}

	
	public String getStatusRemark(){
		return this.statusRemark;
	}

}