package com.doudian.open.api.order_logisticsEditByPack.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderLogisticsEditByPackParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "父订单ID，由orderList接口返回", example= "6496679971677798670")
	private String orderId;

	@SerializedName("pack_id")
	@OpField(required = true , desc = "包裹ID", example= "23123123")
	private String packId;

	@SerializedName("logistics_code")
	@OpField(required = true , desc = "运单号", example= "9595123123")
	private String logisticsCode;

	@SerializedName("company_code")
	@OpField(required = false , desc = "物流公司ID，由接口/order/logisticsCompanyList返回的物流公司列表获得，必填", example= "shunfeng")
	private String companyCode;

	@SerializedName("logistics_id")
	@OpField(required = false , desc = "已废弃。物流公司ID。请使用company_code字段。", example= "12")
	private String logisticsId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "1234")
	private Long storeId;

	@SerializedName("after_sale_address_id")
	@OpField(required = false , desc = "退货地址id，通过地址库列表【/address/list】接口查询", example= "1")
	private Long afterSaleAddressId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setLogisticsId(String logisticsId){
		this.logisticsId = logisticsId;
	}

	
	public String getLogisticsId(){
		return this.logisticsId;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setAfterSaleAddressId(Long afterSaleAddressId){
		this.afterSaleAddressId = afterSaleAddressId;
	}

	
	public Long getAfterSaleAddressId(){
		return this.afterSaleAddressId;
	}

}