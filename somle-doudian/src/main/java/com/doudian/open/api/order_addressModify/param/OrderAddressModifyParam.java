package com.doudian.open.api.order_addressModify.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderAddressModifyParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单号1", example= "4784385386387328490")
	private String orderId;

	@SerializedName("post_addr")
	@OpField(required = false , desc = "修改收货地址，post_addr中的所有字段都必传", example= "")
	private PostAddr postAddr;

	@SerializedName("post_receiver")
	@OpField(required = false , desc = "收货人姓名", example= "艾一一")
	private String postReceiver;

	@SerializedName("post_tel")
	@OpField(required = false , desc = "收货人电话号码", example= "12312341234")
	private String postTel;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setPostAddr(PostAddr postAddr){
		this.postAddr = postAddr;
	}

	
	public PostAddr getPostAddr(){
		return this.postAddr;
	}

	
	public void setPostReceiver(String postReceiver){
		this.postReceiver = postReceiver;
	}

	
	public String getPostReceiver(){
		return this.postReceiver;
	}

	
	public void setPostTel(String postTel){
		this.postTel = postTel;
	}

	
	public String getPostTel(){
		return this.postTel;
	}

}