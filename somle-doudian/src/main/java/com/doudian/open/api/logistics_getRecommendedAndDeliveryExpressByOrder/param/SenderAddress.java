package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SenderAddress {


	@SerializedName("country_code")
	@OpField(required = false , desc = "1", example= "1")
	private String countryCode;

	@SerializedName("province_code")
	@OpField(required = false , desc = "1", example= "1")
	private String provinceCode;

	@SerializedName("province_name")
	@OpField(required = true , desc = "省", example= "北京市")
	private String provinceName;

	@SerializedName("city_code")
	@OpField(required = false , desc = "1", example= "1")
	private String cityCode;

	@SerializedName("city_name")
	@OpField(required = true , desc = "市", example= "北京市")
	private String cityName;

	@SerializedName("district_code")
	@OpField(required = false , desc = "1", example= "1")
	private String districtCode;

	@SerializedName("district_name")
	@OpField(required = true , desc = "区", example= "海淀区")
	private String districtName;

	@SerializedName("street_code")
	@OpField(required = false , desc = "1", example= "1")
	private String streetCode;

	@SerializedName("street_name")
	@OpField(required = false , desc = "街道", example= "中关村街道")
	private String streetName;

	@SerializedName("detail_address")
	@OpField(required = true , desc = "详细地址", example= "123")
	private String detailAddress;

	@SerializedName("address_id")
	@OpField(required = false , desc = "1", example= "1")
	private Long addressId;

	@SerializedName("zip_code")
	@OpField(required = false , desc = "1", example= "1")
	private String zipCode;


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

	
	public void setDetailAddress(String detailAddress){
		this.detailAddress = detailAddress;
	}

	
	public String getDetailAddress(){
		return this.detailAddress;
	}

	
	public void setAddressId(Long addressId){
		this.addressId = addressId;
	}

	
	public Long getAddressId(){
		return this.addressId;
	}

	
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}

	
	public String getZipCode(){
		return this.zipCode;
	}

}