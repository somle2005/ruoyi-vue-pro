package com.doudian.open.msg.trade_TradePartlySellerShip.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradePartlySellerShipParam {


	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单id", example= "4705288465508532862")
	private Long pId;

	@SerializedName("order_status")
	@OpField(required = false , desc = "父订单状态，卖家发货消息的status值为2", example= "2")
	private Long orderStatus;

	@SerializedName("logistics_msg")
	@OpField(required = false , desc = "发货物流信息", example= "")
	private LogisticsMsg logisticsMsg;

	@SerializedName("receiver_msg")
	@OpField(required = false , desc = "收货人信息", example= "")
	private ReceiverMsg receiverMsg;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "子订单ID列表", example= "[4705288465508532862]")
	private List<Long> sIds;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺id，即时零售店铺该字段为即时零售总部id", example= "77977")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("order_type")
	@OpField(required = false , desc = "订单类型： 0: 实物 2: 普通虚拟 4: poi核销 5: 三方核销 6: 服务市场", example= "2")
	private Long orderType;

	@SerializedName("biz")
	@OpField(required = false , desc = "订单业务类型，表示买家从哪里看到的这个商品、产生了订单: 1: 鲁班广告 2: 联盟 4: 商城 8:自主经营 10: 线索通支付表单 12: 抖音门店 14: 抖+ 15: 穿山甲", example= "2")
	private Long biz;

	@SerializedName("update_time")
	@OpField(required = false , desc = "订单发货时间", example= "订单发货时间")
	private Long updateTime;


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

	
	public void setOrderStatus(Long orderStatus){
		this.orderStatus = orderStatus;
	}

	
	public Long getOrderStatus(){
		return this.orderStatus;
	}

	
	public void setLogisticsMsg(LogisticsMsg logisticsMsg){
		this.logisticsMsg = logisticsMsg;
	}

	
	public LogisticsMsg getLogisticsMsg(){
		return this.logisticsMsg;
	}

	
	public void setReceiverMsg(ReceiverMsg receiverMsg){
		this.receiverMsg = receiverMsg;
	}

	
	public ReceiverMsg getReceiverMsg(){
		return this.receiverMsg;
	}

	
	public void setSIds(List<Long> sIds){
		this.sIds = sIds;
	}

	
	public List<Long> getSIds(){
		return this.sIds;
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

	
	public void setOrderType(Long orderType){
		this.orderType = orderType;
	}

	
	public Long getOrderType(){
		return this.orderType;
	}

	
	public void setBiz(Long biz){
		this.biz = biz;
	}

	
	public Long getBiz(){
		return this.biz;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

}