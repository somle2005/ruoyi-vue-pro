package com.doudian.open.api.logistics_newCreateOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class EbillInfosItem {


	@SerializedName("company")
	@OpField(desc = "面单对应的物流商code", example = "zhongtong")
	private String company;

	@SerializedName("hint_msg")
	@OpField(desc = "成功的单子的提示信息", example = "您传入的收件地址与订单不一致，已采用平台订单地址完成取号")
	private String hintMsg;

	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "202011809")
	private String orderId;

	@SerializedName("pack_id")
	@OpField(desc = "包裹id", example = "1")
	private String packId;

	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "202011809")
	private String trackNo;

	@SerializedName("sort_code")
	@OpField(desc = "分拣码（三段码）", example = "400-W00 000")
	private String sortCode;

	@SerializedName("package_center_code")
	@OpField(desc = "集包地代码", example = "1")
	private String packageCenterCode;

	@SerializedName("package_center_name")
	@OpField(desc = "集包名称", example = "1")
	private String packageCenterName;

	@SerializedName("short_address_code")
	@OpField(desc = "大头笔编码", example = "1")
	private String shortAddressCode;

	@SerializedName("short_address_name")
	@OpField(desc = "大头笔名称", example = "1")
	private String shortAddressName;

	@SerializedName("extra_resp")
	@OpField(desc = "额外打印信息（众邮、京东、丰网使用），具体请参考[抖音电商电子面单对接文档](https://op.jinritemai.com/docs/guide-docs/33/338)附录4", example = "1")
	private String extraResp;

	@SerializedName("sub_waybill_codes")
	@OpField(desc = "子母件列表英文逗号分隔", example = "13,434,556")
	private String subWaybillCodes;

	@SerializedName("order_channel")
	@OpField(desc = "2；详情请看文档映射表", example = "c")
	private String orderChannel;

	@SerializedName("shipping_code")
	@OpField(desc = "快递商侧系统生成的寄件码", example = "34343")
	private String shippingCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCompany(String company){
		this.company = company;
	}

	
	public String getCompany(){
		return this.company;
	}

	
	public void setHintMsg(String hintMsg){
		this.hintMsg = hintMsg;
	}

	
	public String getHintMsg(){
		return this.hintMsg;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setPackId(String packId){
		this.packId = packId;
	}

	
	public String getPackId(){
		return this.packId;
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setSortCode(String sortCode){
		this.sortCode = sortCode;
	}

	
	public String getSortCode(){
		return this.sortCode;
	}

	
	public void setPackageCenterCode(String packageCenterCode){
		this.packageCenterCode = packageCenterCode;
	}

	
	public String getPackageCenterCode(){
		return this.packageCenterCode;
	}

	
	public void setPackageCenterName(String packageCenterName){
		this.packageCenterName = packageCenterName;
	}

	
	public String getPackageCenterName(){
		return this.packageCenterName;
	}

	
	public void setShortAddressCode(String shortAddressCode){
		this.shortAddressCode = shortAddressCode;
	}

	
	public String getShortAddressCode(){
		return this.shortAddressCode;
	}

	
	public void setShortAddressName(String shortAddressName){
		this.shortAddressName = shortAddressName;
	}

	
	public String getShortAddressName(){
		return this.shortAddressName;
	}

	
	public void setExtraResp(String extraResp){
		this.extraResp = extraResp;
	}

	
	public String getExtraResp(){
		return this.extraResp;
	}

	
	public void setSubWaybillCodes(String subWaybillCodes){
		this.subWaybillCodes = subWaybillCodes;
	}

	
	public String getSubWaybillCodes(){
		return this.subWaybillCodes;
	}

	
	public void setOrderChannel(String orderChannel){
		this.orderChannel = orderChannel;
	}

	
	public String getOrderChannel(){
		return this.orderChannel;
	}

	
	public void setShippingCode(String shippingCode){
		this.shippingCode = shippingCode;
	}

	
	public String getShippingCode(){
		return this.shippingCode;
	}

}