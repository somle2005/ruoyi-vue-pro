package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PostAddress {


	@SerializedName("province")
	@OpField(desc = "省", example = "")
	private Province province;

	@SerializedName("city")
	@OpField(desc = "市", example = "")
	private City city;

	@SerializedName("town")
	@OpField(desc = "县", example = "")
	private Town town;

	@SerializedName("detail")
	@OpField(desc = "地址详情，此字段已加密，使用前需要解密", example = "23432")
	private String detail;

	@SerializedName("encrypt_detail")
	@OpField(desc = "地址详情，此字段已加密，使用前需要解密", example = "23432")
	private String encryptDetail;

	@SerializedName("landmark")
	@OpField(desc = "收件地址标志物", example = "2432")
	private String landmark;

	@SerializedName("street")
	@OpField(desc = "街道", example = "")
	private Street street;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProvince(Province province){
		this.province = province;
	}

	
	public Province getProvince(){
		return this.province;
	}

	
	public void setCity(City city){
		this.city = city;
	}

	
	public City getCity(){
		return this.city;
	}

	
	public void setTown(Town town){
		this.town = town;
	}

	
	public Town getTown(){
		return this.town;
	}

	
	public void setDetail(String detail){
		this.detail = detail;
	}

	
	public String getDetail(){
		return this.detail;
	}

	
	public void setEncryptDetail(String encryptDetail){
		this.encryptDetail = encryptDetail;
	}

	
	public String getEncryptDetail(){
		return this.encryptDetail;
	}

	
	public void setLandmark(String landmark){
		this.landmark = landmark;
	}

	
	public String getLandmark(){
		return this.landmark;
	}

	
	public void setStreet(Street street){
		this.street = street;
	}

	
	public Street getStreet(){
		return this.street;
	}

}