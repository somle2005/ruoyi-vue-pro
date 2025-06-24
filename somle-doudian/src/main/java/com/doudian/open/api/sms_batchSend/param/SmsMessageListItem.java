package com.doudian.open.api.sms_batchSend.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsMessageListItem {


	@SerializedName("douyin_open_id")
	@OpField(required = false , desc = "抖音小程序openID", example= "1282618212")
	private String douyinOpenId;

	@SerializedName("outbound_id")
	@OpField(required = false , desc = "外呼id，由/member/getOutboundId接口获取。/member/getOutboundId当前还未开放，outbound_id暂不支持使用", example= "17037442535v6Nz7_3u0")
	private String outboundId;

	@SerializedName("post_tel")
	@OpField(required = false , desc = "既支持手机号明文，又支持手机号密文。同时传outbound_id和post_tel，以post_tel为准，不能同时为空", example= "13837776263")
	private String postTel;

	@SerializedName("template_param")
	@OpField(required = true , desc = "参数", example= "{code:1234}")
	private String templateParam;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDouyinOpenId(String douyinOpenId){
		this.douyinOpenId = douyinOpenId;
	}

	
	public String getDouyinOpenId(){
		return this.douyinOpenId;
	}

	
	public void setOutboundId(String outboundId){
		this.outboundId = outboundId;
	}

	
	public String getOutboundId(){
		return this.outboundId;
	}

	
	public void setPostTel(String postTel){
		this.postTel = postTel;
	}

	
	public String getPostTel(){
		return this.postTel;
	}

	
	public void setTemplateParam(String templateParam){
		this.templateParam = templateParam;
	}

	
	public String getTemplateParam(){
		return this.templateParam;
	}

}