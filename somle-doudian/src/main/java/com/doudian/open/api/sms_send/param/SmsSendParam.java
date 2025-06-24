package com.doudian.open.api.sms_send.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsSendParam {


	@SerializedName("sms_account")
	@OpField(required = true , desc = "短信发送渠道，主要做资源隔离", example= "1234")
	private String smsAccount;

	@SerializedName("sign")
	@OpField(required = true , desc = "签名", example= "火山测试")
	private String sign;

	@SerializedName("template_id")
	@OpField(required = true , desc = "短信模版id", example= "ST_60505c68")
	private String templateId;

	@SerializedName("template_param")
	@OpField(required = true , desc = "短信模板占位符要替换的值", example= "{code:1234}")
	private String templateParam;

	@SerializedName("tag")
	@OpField(required = false , desc = "透传字段，回执的时候原样返回给调用方，最大长度512字符", example= "回执")
	private String tag;

	@SerializedName("post_tel")
	@OpField(required = false , desc = "既支持手机号明文，又支持手机号密文。同时传outbound_id和post_tel，以post_tel为准，不能同时为空", example= "13141313131")
	private String postTel;

	@SerializedName("user_ext_code")
	@OpField(required = false , desc = "用户自定义扩展码，仅当允许自定义扩展码的时候生效", example= "abc")
	private String userExtCode;

	@SerializedName("outbound_id")
	@OpField(required = false , desc = "外呼id，由/member/getOutboundId接口获得，/member/getOutboundId当前还未开放，outbound_id暂不支持使用", example= "17037442535v6Nz7_3u0")
	private String outboundId;

	@SerializedName("link_id")
	@OpField(required = false , desc = "短链ID，需要链接统计效果必传，并且tag需要以map[string]interface{}的json形式传入，并且带上link_id:", example= "12332222")
	private String linkId;

	@SerializedName("mini_app_link_id")
	@OpField(required = false , desc = "小程序短链批次ID，需要链接统计效果必传，并且tag需要以map[string]interface{}的json形式传入，并且带上mini_app_link_id:", example= "272626262")
	private String miniAppLinkId;

	@SerializedName("douyin_open_id")
	@OpField(required = false , desc = "抖音openID", example= "8787878787878")
	private String douyinOpenId;


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

	
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	
	public String getTemplateId(){
		return this.templateId;
	}

	
	public void setTemplateParam(String templateParam){
		this.templateParam = templateParam;
	}

	
	public String getTemplateParam(){
		return this.templateParam;
	}

	
	public void setTag(String tag){
		this.tag = tag;
	}

	
	public String getTag(){
		return this.tag;
	}

	
	public void setPostTel(String postTel){
		this.postTel = postTel;
	}

	
	public String getPostTel(){
		return this.postTel;
	}

	
	public void setUserExtCode(String userExtCode){
		this.userExtCode = userExtCode;
	}

	
	public String getUserExtCode(){
		return this.userExtCode;
	}

	
	public void setOutboundId(String outboundId){
		this.outboundId = outboundId;
	}

	
	public String getOutboundId(){
		return this.outboundId;
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

	
	public void setDouyinOpenId(String douyinOpenId){
		this.douyinOpenId = douyinOpenId;
	}

	
	public String getDouyinOpenId(){
		return this.douyinOpenId;
	}

}