package com.doudian.open.api.address_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressListItem {


	@SerializedName("biz_type")
	@OpField(desc = "即时零售商家：biz_type = 2代表发货仓地址，biz_type = 3代表自建地址", example = "1")
	private Long bizType;

	@SerializedName("biz_id")
	@OpField(desc = "业务id即时零售商家：如果biz_type = 2则是发货仓id，如果biz_type = 3则是门店id", example = "123")
	private Long bizId;

	@SerializedName("common_phone")
	@OpField(desc = "普通座机", example = "")
	private CommonPhone commonPhone;

	@SerializedName("company_phone")
	@OpField(desc = "企业座机信息", example = "")
	private CompanyPhone companyPhone;

	@SerializedName("link_type")
	@OpField(desc = "联系方式类型;0-手机，1-普通座机，2-企业座机", example = "1")
	private Integer linkType;

	@SerializedName("phone")
	@OpField(desc = "手机号，商家后台填写的手机号;", example = "13288889999")
	private String phone;

	@SerializedName("mobile")
	@OpField(desc = "默认联系方式，如果是手机，这里展示手机号；如果默认联系方式选择固定电话，这里是固定电话;", example = "0635-5781308")
	private String mobile;

	@SerializedName("address_id")
	@OpField(desc = "地址库id", example = "1")
	private Long addressId;

	@SerializedName("reciever_name")
	@OpField(desc = "收/发件人", example = "张三")
	private String recieverName;

	@SerializedName("is_default")
	@OpField(desc = "是否为退货默认", example = "1-是；0-否")
	private Long isDefault;

	@SerializedName("is_send_default")
	@OpField(desc = "是否为发货默认", example = "1-是；0-否")
	private Long isSendDefault;

	@SerializedName("create_time")
	@OpField(desc = "创建时间，时间戳，秒", example = "1622103276")
	private String createTime;

	@SerializedName("update_time")
	@OpField(desc = "更新时间，时间戳，秒", example = "1622103276")
	private String updateTime;

	@SerializedName("receiver_provinc")
	@OpField(desc = "收件人省份", example = "北京市")
	private String receiverProvinc;

	@SerializedName("receiver_city")
	@OpField(desc = "收件人城市", example = "北京")
	private String receiverCity;

	@SerializedName("receiver_district")
	@OpField(desc = "收件人地区", example = "海淀区")
	private String receiverDistrict;

	@SerializedName("receiver_detail")
	@OpField(desc = "收件人详情地址", example = "xxxx")
	private String receiverDetail;

	@SerializedName("receiver_street")
	@OpField(desc = "收件人街道", example = "丹棱街")
	private String receiverStreet;

	@SerializedName("remark")
	@OpField(desc = "地址备注信息", example = "请发顺丰快递")
	private String remark;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBizType(Long bizType){
		this.bizType = bizType;
	}

	
	public Long getBizType(){
		return this.bizType;
	}

	
	public void setBizId(Long bizId){
		this.bizId = bizId;
	}

	
	public Long getBizId(){
		return this.bizId;
	}

	
	public void setCommonPhone(CommonPhone commonPhone){
		this.commonPhone = commonPhone;
	}

	
	public CommonPhone getCommonPhone(){
		return this.commonPhone;
	}

	
	public void setCompanyPhone(CompanyPhone companyPhone){
		this.companyPhone = companyPhone;
	}

	
	public CompanyPhone getCompanyPhone(){
		return this.companyPhone;
	}

	
	public void setLinkType(Integer linkType){
		this.linkType = linkType;
	}

	
	public Integer getLinkType(){
		return this.linkType;
	}

	
	public void setPhone(String phone){
		this.phone = phone;
	}

	
	public String getPhone(){
		return this.phone;
	}

	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	
	public String getMobile(){
		return this.mobile;
	}

	
	public void setAddressId(Long addressId){
		this.addressId = addressId;
	}

	
	public Long getAddressId(){
		return this.addressId;
	}

	
	public void setRecieverName(String recieverName){
		this.recieverName = recieverName;
	}

	
	public String getRecieverName(){
		return this.recieverName;
	}

	
	public void setIsDefault(Long isDefault){
		this.isDefault = isDefault;
	}

	
	public Long getIsDefault(){
		return this.isDefault;
	}

	
	public void setIsSendDefault(Long isSendDefault){
		this.isSendDefault = isSendDefault;
	}

	
	public Long getIsSendDefault(){
		return this.isSendDefault;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

	
	public void setReceiverProvinc(String receiverProvinc){
		this.receiverProvinc = receiverProvinc;
	}

	
	public String getReceiverProvinc(){
		return this.receiverProvinc;
	}

	
	public void setReceiverCity(String receiverCity){
		this.receiverCity = receiverCity;
	}

	
	public String getReceiverCity(){
		return this.receiverCity;
	}

	
	public void setReceiverDistrict(String receiverDistrict){
		this.receiverDistrict = receiverDistrict;
	}

	
	public String getReceiverDistrict(){
		return this.receiverDistrict;
	}

	
	public void setReceiverDetail(String receiverDetail){
		this.receiverDetail = receiverDetail;
	}

	
	public String getReceiverDetail(){
		return this.receiverDetail;
	}

	
	public void setReceiverStreet(String receiverStreet){
		this.receiverStreet = receiverStreet;
	}

	
	public String getReceiverStreet(){
		return this.receiverStreet;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

}