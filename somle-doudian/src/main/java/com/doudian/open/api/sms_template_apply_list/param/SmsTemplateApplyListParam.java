package com.doudian.open.api.sms_template_apply_list.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsTemplateApplyListParam {


	@SerializedName("sms_account")
	@OpField(required = true , desc = "短信发送渠道，主要做资源隔离", example= "1234")
	private String smsAccount;

	@SerializedName("template_content")
	@OpField(required = false , desc = "短信模板内容： 英文短信：整条短信（包括签名+模板+变量中的内容）最多支持140个英文字符，超出将按140个字符截取为多条短信进行发送，费用按截取的条数收费； 非英文短信：整条短信（包括签名+模板+变量中的内容）最多支持70字符，超出将按70个字符截取为多条短信进行发送，费用按截取的条数收费；", example= "您购买的商品已重新发出，${name}快递运单号：${number}，关注“XXX”公众号刷新订单获取最新物流信息哦~给您造成不便敬请谅解。")
	private String templateContent;

	@SerializedName("sms_template_apply_id")
	@OpField(required = false , desc = "短信模板申请单id", example= "23423423")
	private String smsTemplateApplyId;

	@SerializedName("size")
	@OpField(required = false , desc = "每页数量，默认10", example= "10")
	private Long size;

	@SerializedName("page")
	@OpField(required = false , desc = "页码，默认0", example= "0")
	private Long page;

	@SerializedName("status")
	@OpField(required = false , desc = "审核状态： 1:审核中 2:未通过 3:已开通 4:已关闭 5:免审", example= "1")
	private Long status;


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

	
	public void setSmsTemplateApplyId(String smsTemplateApplyId){
		this.smsTemplateApplyId = smsTemplateApplyId;
	}

	
	public String getSmsTemplateApplyId(){
		return this.smsTemplateApplyId;
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

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

}