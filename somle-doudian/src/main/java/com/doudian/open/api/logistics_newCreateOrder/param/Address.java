package com.doudian.open.api.logistics_newCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Address {


	@SerializedName("country_code")
	@OpField(required = true , desc = "国家编码（默认CHN，目前只有国内业务）", example= "CHN")
	private String countryCode;

	@SerializedName("province_name")
	@OpField(required = true , desc = "省名称", example= "北京市")
	private String provinceName;

	@SerializedName("city_name")
	@OpField(required = true , desc = "市名称", example= "市辖区")
	private String cityName;

	@SerializedName("district_name")
	@OpField(required = true , desc = "区/县名称", example= "海淀区")
	private String districtName;

	@SerializedName("street_name")
	@OpField(required = false , desc = "街道名称", example= "丹棱街1号")
	private String streetName;

	@SerializedName("detail_address")
	@OpField(required = true , desc = "剩余详细地址", example= "丹棱街1号")
	private String detailAddress;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	
	public String getCountryCode(){
		return this.countryCode;
	}

	
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}

	
	public String getProvinceName(){
		return this.provinceName;
	}

	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	
	public String getCityName(){
		return this.cityName;
	}

	
	public void setDistrictName(String districtName){
		this.districtName = districtName;
	}

	
	public String getDistrictName(){
		return this.districtName;
	}

	
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}

	
	public String getStreetName(){
		return this.streetName;
	}

	
	public void setDetailAddress(String detailAddress){
		this.detailAddress = detailAddress;
	}

	
	public String getDetailAddress(){
		return this.detailAddress;
	}

}