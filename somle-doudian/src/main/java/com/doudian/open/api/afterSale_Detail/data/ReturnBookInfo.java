package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReturnBookInfo {


	@SerializedName("return_type")
	@OpField(desc = "寄回类型，  1-自行寄回， 2-上门取件，4-到店退货，5-商家自有运力上门取货，3-快递柜，8-驿站， 10-商家上门取货 【商家取货的统称：自有运力、平台运力、线下自取】", example = "1")
	private Integer returnType;

	@SerializedName("book_time_begin")
	@OpField(desc = "上门取件预约开始时间段", example = "09:00")
	private String bookTimeBegin;

	@SerializedName("book_time_end")
	@OpField(desc = "上门取件预约结束时间段", example = "13:00")
	private String bookTimeEnd;

	@SerializedName("contact_info")
	@OpField(desc = "上门取件地址信息", example = "")
	private ContactInfo contactInfo;

	@SerializedName("sender_address_id")
	@OpField(desc = "地址id", example = "-")
	private String senderAddressId;

	@SerializedName("station_id")
	@OpField(desc = "驿站id", example = "-")
	private String stationId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setReturnType(Integer returnType){
		this.returnType = returnType;
	}

	
	public Integer getReturnType(){
		return this.returnType;
	}

	
	public void setBookTimeBegin(String bookTimeBegin){
		this.bookTimeBegin = bookTimeBegin;
	}

	
	public String getBookTimeBegin(){
		return this.bookTimeBegin;
	}

	
	public void setBookTimeEnd(String bookTimeEnd){
		this.bookTimeEnd = bookTimeEnd;
	}

	
	public String getBookTimeEnd(){
		return this.bookTimeEnd;
	}

	
	public void setContactInfo(ContactInfo contactInfo){
		this.contactInfo = contactInfo;
	}

	
	public ContactInfo getContactInfo(){
		return this.contactInfo;
	}

	
	public void setSenderAddressId(String senderAddressId){
		this.senderAddressId = senderAddressId;
	}

	
	public String getSenderAddressId(){
		return this.senderAddressId;
	}

	
	public void setStationId(String stationId){
		this.stationId = stationId;
	}

	
	public String getStationId(){
		return this.stationId;
	}

}