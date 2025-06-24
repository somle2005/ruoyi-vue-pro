package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReturnAddress {


	@SerializedName("province")
	@OpField(desc = "省", example = "")
	private Province province;

	@SerializedName("city")
	@OpField(desc = "市", example = "")
	private City city;

	@SerializedName("town")
	@OpField(desc = "县/区", example = "")
	private Town town;

	@SerializedName("street")
	@OpField(desc = "街道", example = "")
	private Street street;

	@SerializedName("landmark")
	@OpField(desc = "收件地址标志物", example = "")
	private String landmark;

	@SerializedName("detail")
	@OpField(desc = "详细地址", example = "新华书店门口左转一米")
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

	
	public void setLandmark(String landmark){
		this.landmark = landmark;
	}

	
	public String getLandmark(){
		return this.landmark;
	}

	
	public void setDetail(String detail){
		this.detail = detail;
	}

	
	public String getDetail(){
		return this.detail;
	}

}