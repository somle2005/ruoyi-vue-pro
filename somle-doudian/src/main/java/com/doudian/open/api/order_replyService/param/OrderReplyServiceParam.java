package com.doudian.open.api.order_replyService.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderReplyServiceParam {


	@SerializedName("id")
	@OpField(required = true , desc = "服务请求列表中获取的id", example= "123")
	private Long id;

	@SerializedName("reply")
	@OpField(required = true , desc = "回复内容", example= "哈哈哈")
	private String reply;

	@SerializedName("evidence")
	@OpField(required = false , desc = "回复凭证，通过/order/serviceDetail获取是否当前服务单</br>是否必须上传凭证。多张图片用竖线分开。不超过4张", example= "img_url1")
	private String evidence;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setReply(String reply){
		this.reply = reply;
	}

	
	public String getReply(){
		return this.reply;
	}

	
	public void setEvidence(String evidence){
		this.evidence = evidence;
	}

	
	public String getEvidence(){
		return this.evidence;
	}

}