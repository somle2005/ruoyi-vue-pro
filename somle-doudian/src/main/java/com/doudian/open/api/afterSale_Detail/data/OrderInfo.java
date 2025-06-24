package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderInfo {


	@SerializedName("order_voucher_code_st_name")
	@OpField(desc = "核销状态文案", example = "未核销")
	private String orderVoucherCodeStName;

	@SerializedName("order_voucher_code_st")
	@OpField(desc = "核销状态码 1: 未核销, 2: 已核销, 3: 已过期,", example = "1")
	private Long orderVoucherCodeSt;

	@SerializedName("shop_order_id")
	@OpField(desc = "店铺单ID", example = "12345")
	private Long shopOrderId;

	@SerializedName("sku_order_infos")
	@OpField(desc = "sku单信息", example = "")
	private List<SkuOrderInfosItem> skuOrderInfos;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderVoucherCodeStName(String orderVoucherCodeStName){
		this.orderVoucherCodeStName = orderVoucherCodeStName;
	}

	
	public String getOrderVoucherCodeStName(){
		return this.orderVoucherCodeStName;
	}

	
	public void setOrderVoucherCodeSt(Long orderVoucherCodeSt){
		this.orderVoucherCodeSt = orderVoucherCodeSt;
	}

	
	public Long getOrderVoucherCodeSt(){
		return this.orderVoucherCodeSt;
	}

	
	public void setShopOrderId(Long shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public Long getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setSkuOrderInfos(List<SkuOrderInfosItem> skuOrderInfos){
		this.skuOrderInfos = skuOrderInfos;
	}

	
	public List<SkuOrderInfosItem> getSkuOrderInfos(){
		return this.skuOrderInfos;
	}

}