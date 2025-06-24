package com.doudian.open.msg.refund_RefundCreated.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReturnBookInfo {


	@SerializedName("send_type")
	@OpField(required = false , desc = "寄回类型, 1-自行寄回，2-上门取件，4-到店退货， 5-商家自有运力上门取货， 3-快递柜，8-驿站，10-商家上门取货 【商家取货的统称：自有运力、平台运力、线下自取】", example= "1")
	private Long sendType;

	@SerializedName("time_begin")
	@OpField(required = false , desc = "上门取件预约开始时间段", example= "09:00")
	private String timeBegin;

	@SerializedName("time_end")
	@OpField(required = false , desc = "上门取件预约结束时间段", example= "11:00")
	private String timeEnd;

	@SerializedName("addr")
	@OpField(required = false , desc = "地址, 已加密需解密使用", example= "北京市海淀区海淀街道海淀街道海淀大街x号xx大厦x楼xxx室")
	private String addr;

	@SerializedName("encrypt_addr")
	@OpField(required = false , desc = "地址, 已加密需解密使用", example= "北京市海淀区海淀街道海淀街道海淀大街x号xx大厦x楼xxx室")
	private String encryptAddr;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSendType(Long sendType){
		this.sendType = sendType;
	}

	
	public Long getSendType(){
		return this.sendType;
	}

	
	public void setTimeBegin(String timeBegin){
		this.timeBegin = timeBegin;
	}

	
	public String getTimeBegin(){
		return this.timeBegin;
	}

	
	public void setTimeEnd(String timeEnd){
		this.timeEnd = timeEnd;
	}

	
	public String getTimeEnd(){
		return this.timeEnd;
	}

	
	public void setAddr(String addr){
		this.addr = addr;
	}

	
	public String getAddr(){
		return this.addr;
	}

	
	public void setEncryptAddr(String encryptAddr){
		this.encryptAddr = encryptAddr;
	}

	
	public String getEncryptAddr(){
		return this.encryptAddr;
	}

}