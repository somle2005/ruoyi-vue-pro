package com.doudian.open.api.afterSale_operate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleAddressDetail {


	@SerializedName("province_name")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段省；使用【/address/getProvince】接口获取", example= "北京")
	private String provinceName;

	@SerializedName("city_name")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段市；需要使用【/address/getAreasByProvince】接口响应参数获取", example= "北京")
	private String cityName;

	@SerializedName("town_name")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段区；需要使用【/address/getAreasByProvince】接口响应参数获取", example= "海淀")
	private String townName;

	@SerializedName("street_name")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段街道名称", example= "xxx街道")
	private String streetName;

	@SerializedName("detail")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段地址详情", example= "北京市海淀区丹棱街1号305")
	private String detail;

	@SerializedName("user_name")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段收件人", example= "张三")
	private String userName;

	@SerializedName("mobile")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段联系电话，支持手机号和固定电话；固定电话需要传入区号。注意：区号和号码之间一定要传入“-”传值示例：0571-1234567；否则会报错电话号码不合法。", example= "17777777777")
	private String mobile;

	@SerializedName("province_id")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段省id；使用【/address/getProvince】接口获取", example= "10")
	private Long provinceId;

	@SerializedName("city_id")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段市id；需要使用【/address/getAreasByProvince】接口响应参数获取", example= "10")
	private Long cityId;

	@SerializedName("town_id")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段区id；需要使用【/address/getAreasByProvince】接口响应参数获取", example= "01")
	private Long townId;

	@SerializedName("street_id")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段街道id；需要使用【/address/getAreasByProvince】接口响应参数获取", example= "12")
	private Long streetId;


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

	
	public void setTownName(String townName){
		this.townName = townName;
	}

	
	public String getTownName(){
		return this.townName;
	}

	
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}

	
	public String getStreetName(){
		return this.streetName;
	}

	
	public void setDetail(String detail){
		this.detail = detail;
	}

	
	public String getDetail(){
		return this.detail;
	}

	
	public void setUserName(String userName){
		this.userName = userName;
	}

	
	public String getUserName(){
		return this.userName;
	}

	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	
	public String getMobile(){
		return this.mobile;
	}

	
	public void setProvinceId(Long provinceId){
		this.provinceId = provinceId;
	}

	
	public Long getProvinceId(){
		return this.provinceId;
	}

	
	public void setCityId(Long cityId){
		this.cityId = cityId;
	}

	
	public Long getCityId(){
		return this.cityId;
	}

	
	public void setTownId(Long townId){
		this.townId = townId;
	}

	
	public Long getTownId(){
		return this.townId;
	}

	
	public void setStreetId(Long streetId){
		this.streetId = streetId;
	}

	
	public Long getStreetId(){
		return this.streetId;
	}

}