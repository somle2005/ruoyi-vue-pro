package com.doudian.open.api.logistics_pushOnlineServiceConfig.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SendAddress {


	@SerializedName("detail_address")
	@OpField(required = true , desc = "详细地址（暂时无效，可写死空字符串）", example= "详细地址")
	private String detailAddress;

	@SerializedName("country_code")
	@OpField(required = true , desc = "国家编码，写死CHN", example= "CHN")
	private String countryCode;

	@SerializedName("district_name")
	@OpField(required = true , desc = "地区名称", example= "区县")
	private String districtName;

	@SerializedName("province_name")
	@OpField(required = true , desc = "省名称", example= "省份")
	private String provinceName;

	@SerializedName("street_name")
	@OpField(required = true , desc = "街道名称", example= "街道")
	private String streetName;

	@SerializedName("city_name")
	@OpField(required = true , desc = "城市名称", example= "城市")
	private String cityName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDetailAddress(String detailAddress){
		this.detailAddress = detailAddress;
	}

	
	public String getDetailAddress(){
		return this.detailAddress;
	}

	
	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	
	public String getCountryCode(){
		return this.countryCode;
	}

	
	public void setDistrictName(String districtName){
		this.districtName = districtName;
	}

	
	public String getDistrictName(){
		return this.districtName;
	}

	
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}

	
	public String getProvinceName(){
		return this.provinceName;
	}

	
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}

	
	public String getStreetName(){
		return this.streetName;
	}

	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	
	public String getCityName(){
		return this.cityName;
	}

}