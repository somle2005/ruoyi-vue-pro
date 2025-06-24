package com.doudian.open.api.logistics_listShopNetsite.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SenderAddressItem {


	@SerializedName("province_name")
	@OpField(desc = "省名称", example = "北京")
	private String provinceName;

	@SerializedName("city_name")
	@OpField(desc = "市名称", example = "北京市")
	private String cityName;

	@SerializedName("district_name")
	@OpField(desc = "区/县名称", example = "海淀区")
	private String districtName;

	@SerializedName("street_name")
	@OpField(desc = "街道名称", example = "E世界")
	private String streetName;

	@SerializedName("detail_address")
	@OpField(desc = "剩余详细地址", example = "E世界")
	private String detailAddress;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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