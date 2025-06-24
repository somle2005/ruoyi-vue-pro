package com.doudian.open.api.order_addressModify.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PostAddr {


	@SerializedName("province")
	@OpField(required = false , desc = "省", example= "")
	private Province province;

	@SerializedName("city")
	@OpField(required = false , desc = "城市", example= "")
	private City city;

	@SerializedName("town")
	@OpField(required = false , desc = "镇", example= "")
	private Town town;

	@SerializedName("street")
	@OpField(required = false , desc = "街道", example= "")
	private Street street;

	@SerializedName("address_detail")
	@OpField(required = false , desc = "详细地址", example= "互联网金融")
	private String addressDetail;

	@SerializedName("land_mark")
	@OpField(required = false , desc = "暂时未使用的字段", example= "空")
	private String landMark;


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

	
	public void setAddressDetail(String addressDetail){
		this.addressDetail = addressDetail;
	}

	
	public String getAddressDetail(){
		return this.addressDetail;
	}

	
	public void setLandMark(String landMark){
		this.landMark = landMark;
	}

	
	public String getLandMark(){
		return this.landMark;
	}

}