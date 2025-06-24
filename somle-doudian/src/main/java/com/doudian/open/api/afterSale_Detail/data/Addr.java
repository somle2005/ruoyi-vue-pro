package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Addr {


	@SerializedName("province")
	@OpField(desc = "省", example = "")
	private Province province;

	@SerializedName("city")
	@OpField(desc = "市", example = "")
	private City city;

	@SerializedName("town")
	@OpField(desc = "区", example = "")
	private Town town;

	@SerializedName("detail")
	@OpField(desc = "详细地址,此字段已加密，使用前需要解密", example = "-")
	private String detail;

	@SerializedName("encrypt_detail")
	@OpField(desc = "详细地址,此字段已加密，使用前需要解密", example = "-")
	private String encryptDetail;

	@SerializedName("street")
	@OpField(desc = "街道", example = "")
	private Street street;

	@SerializedName("address_id")
	@OpField(desc = "地址ID", example = "-")
	private String addressId;


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

	
	public void setStreet(Street street){
		this.street = street;
	}

	
	public Street getStreet(){
		return this.street;
	}

	
	public void setAddressId(String addressId){
		this.addressId = addressId;
	}

	
	public String getAddressId(){
		return this.addressId;
	}

}