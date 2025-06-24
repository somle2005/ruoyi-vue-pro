package com.doudian.open.msg.yunc_orderStatusChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SubOrderListItem {


	@SerializedName("current_business_stage")
	@OpField(required = false , desc = "物流订单状态: 1:未分配 2:已分配未发货 3:已发货", example= "2")
	private String currentBusinessStage;

	@SerializedName("sub_order_id")
	@OpField(required = false , desc = "平台交易子订单号", example= "111")
	private String subOrderId;

	@SerializedName("order_id")
	@OpField(required = false , desc = "平台交易父订单号", example= "666666")
	private String orderId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "抖店店铺ID", example= "777777")
	private String shopId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCurrentBusinessStage(String currentBusinessStage){
		this.currentBusinessStage = currentBusinessStage;
	}

	
	public String getCurrentBusinessStage(){
		return this.currentBusinessStage;
	}

	
	public void setSubOrderId(String subOrderId){
		this.subOrderId = subOrderId;
	}

	
	public String getSubOrderId(){
		return this.subOrderId;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setShopId(String shopId){
		this.shopId = shopId;
	}

	
	public String getShopId(){
		return this.shopId;
	}

}