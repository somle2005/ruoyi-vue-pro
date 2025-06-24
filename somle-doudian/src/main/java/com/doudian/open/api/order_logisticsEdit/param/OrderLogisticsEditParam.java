package com.doudian.open.api.order_logisticsEdit.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderLogisticsEditParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单ID", example= "4782813149182887526A")
	private String orderId;

	@SerializedName("logistics_id")
	@OpField(required = false , desc = "已废弃。物流公司ID。请使用company_code字段。", example= "12")
	private Long logisticsId;

	@SerializedName("company_code")
	@OpField(required = false , desc = "物流公司code,由接口/order/logisticsCompanyList返回的物流公司列表获得，必填", example= "shunfeng、qita")
	private String companyCode;

	@SerializedName("logistics_code")
	@OpField(required = false , desc = "快递单号", example= "sf1231231231234")
	private String logisticsCode;

	@SerializedName("company")
	@OpField(required = false , desc = "已废弃。物流公司名称", example= "顺丰")
	private String company;

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

	
	public void setLogisticsId(Long logisticsId){
		this.logisticsId = logisticsId;
	}

	
	public Long getLogisticsId(){
		return this.logisticsId;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setCompany(String company){
		this.company = company;
	}

	
	public String getCompany(){
		return this.company;
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