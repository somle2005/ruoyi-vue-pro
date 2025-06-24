package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PostAddr {


	@SerializedName("province")
	@OpField(desc = "省/直辖市", example = "")
	private Province province;

	@SerializedName("city")
	@OpField(desc = "市", example = "")
	private City city;

	@SerializedName("town")
	@OpField(desc = "区县", example = "")
	private Town town;

	@SerializedName("street")
	@OpField(desc = "街道", example = "")
	private Street street;

	@SerializedName("detail")
	@OpField(desc = "详细地址", example = "丹棱街1号")
	private String detail;

	@SerializedName("encrypt_detail")
	@OpField(desc = "详细地址", example = "丹棱街1号")
	private String encryptDetail;


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

	
	public void setStreet(Street street){
		this.street = street;
	}

	
	public Street getStreet(){
		return this.street;
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

}