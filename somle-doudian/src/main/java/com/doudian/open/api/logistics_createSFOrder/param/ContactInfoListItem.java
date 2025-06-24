package com.doudian.open.api.logistics_createSFOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ContactInfoListItem {


	@SerializedName("contact_type")
	@OpField(required = true , desc = "地址类型： 1，寄件方信息 2，到件方信息", example= "1")
	private Integer contactType;

	@SerializedName("biz_company")
	@OpField(required = false , desc = "公司名称", example= "1")
	private String bizCompany;

	@SerializedName("contact")
	@OpField(required = false , desc = "联系人", example= "张三")
	private String contact;

	@SerializedName("tel")
	@OpField(required = false , desc = "联系电话（二选一）", example= "13456784563")
	private String tel;

	@SerializedName("mobile")
	@OpField(required = false , desc = "手机", example= "1")
	private String mobile;

	@SerializedName("country")
	@OpField(required = false , desc = "国家或地区 2位代码（默认是CN）", example= "CN")
	private String country;

	@SerializedName("province")
	@OpField(required = true , desc = "所在省级行政区名称，必须是 标准的省级行政区名称如：北 京、广东省、广西壮族自治区 等；此字段影响原寄地代码识 别", example= "北京市")
	private String province;

	@SerializedName("city")
	@OpField(required = false , desc = "所在地级行政区名称，必须是 标准的城市称谓 如：北京市、 深圳市、大理白族自治州等； 此字段影响原寄地代码识别", example= "市辖区")
	private String city;

	@SerializedName("county")
	@OpField(required = false , desc = "所在县/区级行政区名称，必须 是标准的县/区称谓，如：福田 区，南涧彝族自治县、准格尔旗等", example= "海淀区")
	private String county;

	@SerializedName("address")
	@OpField(required = false , desc = "剩余详细地址", example= "棱街1号")
	private String address;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setContactType(Integer contactType){
		this.contactType = contactType;
	}

	
	public Integer getContactType(){
		return this.contactType;
	}

	
	public void setBizCompany(String bizCompany){
		this.bizCompany = bizCompany;
	}

	
	public String getBizCompany(){
		return this.bizCompany;
	}

	
	public void setContact(String contact){
		this.contact = contact;
	}

	
	public String getContact(){
		return this.contact;
	}

	
	public void setTel(String tel){
		this.tel = tel;
	}

	
	public String getTel(){
		return this.tel;
	}

	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	
	public String getMobile(){
		return this.mobile;
	}

	
	public void setCountry(String country){
		this.country = country;
	}

	
	public String getCountry(){
		return this.country;
	}

	
	public void setProvince(String province){
		this.province = province;
	}

	
	public String getProvince(){
		return this.province;
	}

	
	public void setCity(String city){
		this.city = city;
	}

	
	public String getCity(){
		return this.city;
	}

	
	public void setCounty(String county){
		this.county = county;
	}

	
	public String getCounty(){
		return this.county;
	}

	
	public void setAddress(String address){
		this.address = address;
	}

	
	public String getAddress(){
		return this.address;
	}

}