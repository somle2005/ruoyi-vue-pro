package com.doudian.open.api.logistics_registerPackageRoute.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Address {


	@SerializedName("province")
	@OpField(required = true , desc = "省", example= "")
	private Province province;

	@SerializedName("city")
	@OpField(required = true , desc = "市", example= "")
	private City city;

	@SerializedName("town")
	@OpField(required = true , desc = "区", example= "")
	private Town town;

	@SerializedName("street")
	@OpField(required = true , desc = "街道", example= "")
	private Street street;

	@SerializedName("detail")
	@OpField(required = true , desc = "详细地址", example= "仁和半岛")
	private String detail;


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

}