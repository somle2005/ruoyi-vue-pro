package com.doudian.open.api.logistics_updateOrder.param;

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
	@OpField(required = false , desc = "街道名称。街道名称（street_name）和街道code（street_code），若传入时，需要一起传入。", example= "丹棱街")
	private String streetName;

	@SerializedName("detail_address")
	@OpField(required = false , desc = "剩余详细地址，支持密文", example= "丹棱街1号")
	private String detailAddress;

	@SerializedName("province_code")
	@OpField(required = false , desc = "省code编码", example= "11")
	private String provinceCode;

	@SerializedName("city_code")
	@OpField(required = false , desc = "市code编码", example= "11111")
	private String cityCode;

	@SerializedName("district_code")
	@OpField(required = false , desc = "区code编码", example= "111111")
	private String districtCode;

	@SerializedName("street_code")
	@OpField(required = false , desc = "街道code编码", example= "1111")
	private String streetCode;


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

	
	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}

	
	public String getProvinceCode(){
		return this.provinceCode;
	}

	
	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}

	
	public String getCityCode(){
		return this.cityCode;
	}

	
	public void setDistrictCode(String districtCode){
		this.districtCode = districtCode;
	}

	
	public String getDistrictCode(){
		return this.districtCode;
	}

	
	public void setStreetCode(String streetCode){
		this.streetCode = streetCode;
	}

	
	public String getStreetCode(){
		return this.streetCode;
	}

}