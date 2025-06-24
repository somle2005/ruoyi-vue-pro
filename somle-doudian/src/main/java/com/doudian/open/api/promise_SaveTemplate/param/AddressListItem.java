package com.doudian.open.api.promise_SaveTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressListItem {


	@SerializedName("province_code")
	@OpField(required = false , desc = "省编码", example= "31")
	private String provinceCode;

	@SerializedName("province_name")
	@OpField(required = false , desc = "省名称", example= "上海市")
	private String provinceName;

	@SerializedName("city_code")
	@OpField(required = false , desc = "城市编码", example= "310000")
	private String cityCode;

	@SerializedName("city_name")
	@OpField(required = false , desc = "城市名称", example= "上海市")
	private String cityName;

	@SerializedName("district_code")
	@OpField(required = false , desc = "地区编码", example= "310113")
	private String districtCode;

	@SerializedName("district_name")
	@OpField(required = false , desc = "地区名称", example= "宝山区")
	private String districtName;

	@SerializedName("street_code")
	@OpField(required = false , desc = "街道编码", example= "310113501")
	private String streetCode;

	@SerializedName("street_name")
	@OpField(required = false , desc = "街道名称", example= "宝山城市工业园区")
	private String streetName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}

	
	public String getProvinceCode(){
		return this.provinceCode;
	}

	
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}

	
	public String getProvinceName(){
		return this.provinceName;
	}

	
	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}

	
	public String getCityCode(){
		return this.cityCode;
	}

	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	
	public String getCityName(){
		return this.cityName;
	}

	
	public void setDistrictCode(String districtCode){
		this.districtCode = districtCode;
	}

	
	public String getDistrictCode(){
		return this.districtCode;
	}

	
	public void setDistrictName(String districtName){
		this.districtName = districtName;
	}

	
	public String getDistrictName(){
		return this.districtName;
	}

	
	public void setStreetCode(String streetCode){
		this.streetCode = streetCode;
	}

	
	public String getStreetCode(){
		return this.streetCode;
	}

	
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}

	
	public String getStreetName(){
		return this.streetName;
	}

}