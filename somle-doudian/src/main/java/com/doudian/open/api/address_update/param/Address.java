package com.doudian.open.api.address_update.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Address {


	@SerializedName("id")
	@OpField(required = true , desc = "地址ID", example= "10000")
	private Long id;

	@SerializedName("user_name")
	@OpField(required = true , desc = "联系人姓名", example= "张三")
	private String userName;

	@SerializedName("mobile")
	@OpField(required = false , desc = "手机号码", example= "18012345678")
	private String mobile;

	@SerializedName("province_id")
	@OpField(required = true , desc = "省ID", example= "33")
	private Long provinceId;

	@SerializedName("city_id")
	@OpField(required = true , desc = "城市ID", example= "330700")
	private Long cityId;

	@SerializedName("town_id")
	@OpField(required = true , desc = "区ID", example= "330782")
	private Long townId;

	@SerializedName("detail")
	@OpField(required = true , desc = "详细地址", example= "xxxxxxxx")
	private String detail;

	@SerializedName("street_id")
	@OpField(required = true , desc = "街道ID", example= "330782003")
	private Long streetId;

	@SerializedName("link_type")
	@OpField(required = true , desc = "联系方式类型(0-手机,1-普通座机,2-企业座机)", example= "0-手机,1-普通座机,2-企业座机")
	private Integer linkType;

	@SerializedName("fixed_phone")
	@OpField(required = false , desc = "普通座机格式：区号-座机号-分机号(分机号选填)、区号3~4位、座机号7~8位、分机号不超过5位。企业座机：400/800开头不超过10位、95开头在5~8we", example= "普通座机：400-12345678-1234，企业座机：40012345")
	private String fixedPhone;

	@SerializedName("remark")
	@OpField(required = false , desc = "售后备注，限制200个字符", example= "拒收到付")
	private String remark;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
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

	
	public void setDetail(String detail){
		this.detail = detail;
	}

	
	public String getDetail(){
		return this.detail;
	}

	
	public void setStreetId(Long streetId){
		this.streetId = streetId;
	}

	
	public Long getStreetId(){
		return this.streetId;
	}

	
	public void setLinkType(Integer linkType){
		this.linkType = linkType;
	}

	
	public Integer getLinkType(){
		return this.linkType;
	}

	
	public void setFixedPhone(String fixedPhone){
		this.fixedPhone = fixedPhone;
	}

	
	public String getFixedPhone(){
		return this.fixedPhone;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

}