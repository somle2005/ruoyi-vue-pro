package com.doudian.open.msg.trade_DeliverReissue.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeDeliverReissueParam {


	@SerializedName("shop_order_id")
	@OpField(required = false , desc = "发货行为对应的店铺单单号", example= "6929492202186020473")
	private String shopOrderId;

	@SerializedName("sku_order_ids")
	@OpField(required = false , desc = "发货行为包含的商品单单号", example= "[6929492202186020474]")
	private List<String> skuOrderIds;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "12345")
	private Long shopId;

	@SerializedName("event_time")
	@OpField(required = false , desc = "事件发生时间", example= "1714995330")
	private Long eventTime;

	@SerializedName("logistics_msg")
	@OpField(required = false , desc = "物流信息", example= "")
	private LogisticsMsg logisticsMsg;

	@SerializedName("order_status")
	@OpField(required = false , desc = "订单状态", example= "3")
	private Long orderStatus;


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

	
	public void setSkuOrderIds(List<String> skuOrderIds){
		this.skuOrderIds = skuOrderIds;
	}

	
	public List<String> getSkuOrderIds(){
		return this.skuOrderIds;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setEventTime(Long eventTime){
		this.eventTime = eventTime;
	}

	
	public Long getEventTime(){
		return this.eventTime;
	}

	
	public void setLogisticsMsg(LogisticsMsg logisticsMsg){
		this.logisticsMsg = logisticsMsg;
	}

	
	public LogisticsMsg getLogisticsMsg(){
		return this.logisticsMsg;
	}

	
	public void setOrderStatus(Long orderStatus){
		this.orderStatus = orderStatus;
	}

	
	public Long getOrderStatus(){
		return this.orderStatus;
	}

}