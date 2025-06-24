package com.doudian.open.api.address_getAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Address {


	@SerializedName("id")
	@OpField(desc = "自增ID, 也是地址的ID;", example = "32693731")
	private Long id;

	@SerializedName("street_name")
	@OpField(desc = "街道名称;", example = "海淀街道")
	private String streetName;

	@SerializedName("is_default")
	@OpField(desc = "是否是默认地址，0-不是默认地址，1-是默认地址;", example = "1")
	private Long isDefault;

	@SerializedName("province_name")
	@OpField(desc = "省的名称;", example = "北京市")
	private String provinceName;

	@SerializedName("street_id")
	@OpField(desc = "街道ID;", example = "110108012")
	private Long streetId;

	@SerializedName("link_type")
	@OpField(desc = "联系方式类型;", example = "2")
	private Integer linkType;

	@SerializedName("common_phone")
	@OpField(desc = "普通座机;22: CommonPhone Comm", example = "")
	private CommonPhone commonPhone;

	@SerializedName("create_time")
	@OpField(desc = "创建时间;", example = "2024-09-25 16:33:15")
	private String createTime;

	@SerializedName("city_id")
	@OpField(desc = "城市ID;", example = "110000")
	private Long cityId;

	@SerializedName("biz_type")
	@OpField(desc = "业务类型 0:抖店店铺 1:门店", example = "0")
	private Integer bizType;

	@SerializedName("user_name")
	@OpField(desc = "售后地址联系人;", example = "xiaoming")
	private String userName;

	@SerializedName("mobile")
	@OpField(desc = "默认联系方式，如果是手机，这里展示手机号；如果默认联系方式选择固定电话，这里是固定电话;", example = "400-8888111-1234")
	private String mobile;

	@SerializedName("city_name")
	@OpField(desc = "城市名称;", example = "北京市")
	private String cityName;

	@SerializedName("after_sale_note")
	@OpField(desc = "售后备注", example = "测试备注")
	private String afterSaleNote;

	@SerializedName("shop_id")
	@OpField(desc = "店铺ID;", example = "77977")
	private Long shopId;

	@SerializedName("is_send_default")
	@OpField(desc = "是否是默认发货地址;", example = "1")
	private Long isSendDefault;

	@SerializedName("update_time")
	@OpField(desc = "更新时间;", example = "2024-09-25 22:04:14")
	private String updateTime;

	@SerializedName("detail")
	@OpField(desc = "详细地址;", example = "花园路牡丹园中兴大厦")
	private String detail;

	@SerializedName("province_id")
	@OpField(desc = "省ID;", example = "11")
	private Long provinceId;

	@SerializedName("town_id")
	@OpField(desc = "区县ID;", example = "110108")
	private Long townId;

	@SerializedName("town_name")
	@OpField(desc = "区县名称;", example = "海淀区")
	private String townName;

	@SerializedName("biz_id")
	@OpField(desc = "业务id，如门店ID", example = "0")
	private Long bizId;

	@SerializedName("address")
	@OpField(desc = "地址,详细地址;", example = "北京市北京市海淀区海淀街道花园路牡丹园中兴大厦")
	private String address;

	@SerializedName("company_phone")
	@OpField(desc = "企业座机;", example = "")
	private CompanyPhone companyPhone;

	@SerializedName("phone")
	@OpField(desc = "手机号，商家后台填写的手机号;", example = "13288889999")
	private String phone;


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

	
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}

	
	public String getStreetName(){
		return this.streetName;
	}

	
	public void setIsDefault(Long isDefault){
		this.isDefault = isDefault;
	}

	
	public Long getIsDefault(){
		return this.isDefault;
	}

	
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}

	
	public String getProvinceName(){
		return this.provinceName;
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

	
	public void setCommonPhone(CommonPhone commonPhone){
		this.commonPhone = commonPhone;
	}

	
	public CommonPhone getCommonPhone(){
		return this.commonPhone;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setCityId(Long cityId){
		this.cityId = cityId;
	}

	
	public Long getCityId(){
		return this.cityId;
	}

	
	public void setBizType(Integer bizType){
		this.bizType = bizType;
	}

	
	public Integer getBizType(){
		return this.bizType;
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

	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	
	public String getCityName(){
		return this.cityName;
	}

	
	public void setAfterSaleNote(String afterSaleNote){
		this.afterSaleNote = afterSaleNote;
	}

	
	public String getAfterSaleNote(){
		return this.afterSaleNote;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setIsSendDefault(Long isSendDefault){
		this.isSendDefault = isSendDefault;
	}

	
	public Long getIsSendDefault(){
		return this.isSendDefault;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

	
	public void setDetail(String detail){
		this.detail = detail;
	}

	
	public String getDetail(){
		return this.detail;
	}

	
	public void setProvinceId(Long provinceId){
		this.provinceId = provinceId;
	}

	
	public Long getProvinceId(){
		return this.provinceId;
	}

	
	public void setTownId(Long townId){
		this.townId = townId;
	}

	
	public Long getTownId(){
		return this.townId;
	}

	
	public void setTownName(String townName){
		this.townName = townName;
	}

	
	public String getTownName(){
		return this.townName;
	}

	
	public void setBizId(Long bizId){
		this.bizId = bizId;
	}

	
	public Long getBizId(){
		return this.bizId;
	}

	
	public void setAddress(String address){
		this.address = address;
	}

	
	public String getAddress(){
		return this.address;
	}

	
	public void setCompanyPhone(CompanyPhone companyPhone){
		this.companyPhone = companyPhone;
	}

	
	public CompanyPhone getCompanyPhone(){
		return this.companyPhone;
	}

	
	public void setPhone(String phone){
		this.phone = phone;
	}

	
	public String getPhone(){
		return this.phone;
	}

}