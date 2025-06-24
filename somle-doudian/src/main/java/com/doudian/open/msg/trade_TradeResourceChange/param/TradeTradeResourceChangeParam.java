package com.doudian.open.msg.trade_TradeResourceChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradeResourceChangeParam {


	@SerializedName("p_id")
	@OpField(required = false , desc = "店铺单ID", example= "4837328765348566675")
	private Long pId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "77977")
	private Long shopId;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "子订单列表", example= "[5039743693955923503]")
	private List<String> sIds;

	@SerializedName("event_time")
	@OpField(required = false , desc = "事件发生时间，Unix时间戳单位：秒", example= "1677504074")
	private Long eventTime;

	@SerializedName("create_time")
	@OpField(required = false , desc = "订单创建时间", example= "1677503094")
	private Long createTime;

	@SerializedName("appointment_ship_time")
	@OpField(required = false , desc = "预约发货订单，该字段为修改后的预约发货时效；预约送达订单该字段为0", example= "1677503094")
	private Long appointmentShipTime;

	@SerializedName("latest_receipt_time")
	@OpField(required = false , desc = "预约送达时间，该字段为新的预约送达时间；预约发货订单该字段为0;", example= "1677503094")
	private Long latestReceiptTime;

	@SerializedName("sku_orders")
	@OpField(required = false , desc = "废弃--勿使用", example= "")
	private List<SkuOrdersItem> skuOrders;

	@SerializedName("sku_order_list")
	@OpField(required = false , desc = "商品单时效变更(周期购关注)", example= "")
	private List<SkuOrderListItem> skuOrderList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPId(Long pId){
		this.pId = pId;
	}

	
	public Long getPId(){
		return this.pId;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setSIds(List<String> sIds){
		this.sIds = sIds;
	}

	
	public List<String> getSIds(){
		return this.sIds;
	}

	
	public void setEventTime(Long eventTime){
		this.eventTime = eventTime;
	}

	
	public Long getEventTime(){
		return this.eventTime;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setAppointmentShipTime(Long appointmentShipTime){
		this.appointmentShipTime = appointmentShipTime;
	}

	
	public Long getAppointmentShipTime(){
		return this.appointmentShipTime;
	}

	
	public void setLatestReceiptTime(Long latestReceiptTime){
		this.latestReceiptTime = latestReceiptTime;
	}

	
	public Long getLatestReceiptTime(){
		return this.latestReceiptTime;
	}

	
	public void setSkuOrders(List<SkuOrdersItem> skuOrders){
		this.skuOrders = skuOrders;
	}

	
	public List<SkuOrdersItem> getSkuOrders(){
		return this.skuOrders;
	}

	
	public void setSkuOrderList(List<SkuOrderListItem> skuOrderList){
		this.skuOrderList = skuOrderList;
	}

	
	public List<SkuOrderListItem> getSkuOrderList(){
		return this.skuOrderList;
	}

}