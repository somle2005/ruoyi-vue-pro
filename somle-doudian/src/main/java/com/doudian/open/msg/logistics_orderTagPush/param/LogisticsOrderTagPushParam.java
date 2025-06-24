package com.doudian.open.msg.logistics_orderTagPush.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsOrderTagPushParam {


	@SerializedName("shop_order_id")
	@OpField(required = false , desc = "店铺单id", example= "123")
	private Long shopOrderId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺id", example= "4463798")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("order_tag_list")
	@OpField(required = false , desc = "订单标记列表", example= "")
	private List<OrderTagListItem> orderTagList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(Long shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public Long getShopOrderId(){
		return this.shopOrderId;
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

	
	public void setOrderTagList(List<OrderTagListItem> orderTagList){
		this.orderTagList = orderTagList;
	}

	
	public List<OrderTagListItem> getOrderTagList(){
		return this.orderTagList;
	}

}