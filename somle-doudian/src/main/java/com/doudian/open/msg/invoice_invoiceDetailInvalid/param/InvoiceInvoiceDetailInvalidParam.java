package com.doudian.open.msg.invoice_invoiceDetailInvalid.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class InvoiceInvoiceDetailInvalidParam {


	@SerializedName("registation_id")
	@OpField(required = false , desc = "开票id", example= "7047761415113081132")
	private String registationId;

	@SerializedName("shop_order_id")
	@OpField(required = false , desc = "父订单id", example= "4882679226239354474")
	private String shopOrderId;

	@SerializedName("end_time")
	@OpField(required = false , desc = "订单开票关闭时间", example= "1640935998")
	private Long endTime;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺id", example= "1111237663")
	private Long shopId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRegistationId(String registationId){
		this.registationId = registationId;
	}

	
	public String getRegistationId(){
		return this.registationId;
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setEndTime(Long endTime){
		this.endTime = endTime;
	}

	
	public Long getEndTime(){
		return this.endTime;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

}