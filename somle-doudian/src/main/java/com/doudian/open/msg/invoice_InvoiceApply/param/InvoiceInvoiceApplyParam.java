package com.doudian.open.msg.invoice_InvoiceApply.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class InvoiceInvoiceApplyParam {


	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺 id", example= "77977")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("shop_order_id")
	@OpField(required = false , desc = "订单 id", example= "5007899872697073582")
	private String shopOrderId;

	@SerializedName("apply_time")
	@OpField(required = false , desc = "申请时间", example= "1671177127")
	private Long applyTime;

	@SerializedName("registation_id")
	@OpField(required = false , desc = "开票 id", example= "7174978093600489780")
	private String registationId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setApplyTime(Long applyTime){
		this.applyTime = applyTime;
	}

	
	public Long getApplyTime(){
		return this.applyTime;
	}

	
	public void setRegistationId(String registationId){
		this.registationId = registationId;
	}

	
	public String getRegistationId(){
		return this.registationId;
	}

}