package com.doudian.open.api.order_batchBindSerialNumber.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BindListItem {


	@SerializedName("shop_order_id")
	@OpField(required = false , desc = "订单号;", example= "6940658920780535662")
	private String shopOrderId;

	@SerializedName("sku_order_id")
	@OpField(required = false , desc = "Sku单号;", example= "6940658920780535662")
	private String skuOrderId;

	@SerializedName("serial_no_list")
	@OpField(required = false , desc = "序列号信息;", example= "")
	private List<SerialNoListItem> serialNoList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setSkuOrderId(String skuOrderId){
		this.skuOrderId = skuOrderId;
	}

	
	public String getSkuOrderId(){
		return this.skuOrderId;
	}

	
	public void setSerialNoList(List<SerialNoListItem> serialNoList){
		this.serialNoList = serialNoList;
	}

	
	public List<SerialNoListItem> getSerialNoList(){
		return this.serialNoList;
	}

}