package com.doudian.open.msg.trade_TradeCanceled.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradeCanceledParam {


	@SerializedName("s_ids")
	@OpField(required = false , desc = "子订单ID", example= "[         4835696922606317095     ]")
	private List<Long> sIds;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "12036350")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("order_status")
	@OpField(required = false , desc = "父订单状态，订单取消消息的status值为4", example= "4")
	private Long orderStatus;

	@SerializedName("order_type")
	@OpField(required = false , desc = "订单类型： 0: 实物 2: 普通虚拟 4: poi核销 5: 三方核销 6: 服务市场", example= "0")
	private Long orderType;

	@SerializedName("biz")
	@OpField(required = false , desc = "订单业务类型，表示买家从哪里看到的这个商品、产生了订单: 1: 鲁班广告 2: 联盟 4: 商城 8:自主经营 10: 线索通支付表单 12: 抖音门店 14: 抖+ 15: 穿山甲", example= "2")
	private Long biz;

	@SerializedName("cancel_time")
	@OpField(required = false , desc = "订单取消时间", example= "1629993663")
	private Long cancelTime;

	@SerializedName("cancel_reason")
	@OpField(required = false , desc = "取消原因", example= "")
	private String cancelReason;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4835696922606317095")
	private Long pId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setOrderStatus(Long orderStatus){
		this.orderStatus = orderStatus;
	}

	
	public Long getOrderStatus(){
		return this.orderStatus;
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

	
	public void setCancelTime(Long cancelTime){
		this.cancelTime = cancelTime;
	}

	
	public Long getCancelTime(){
		return this.cancelTime;
	}

	
	public void setCancelReason(String cancelReason){
		this.cancelReason = cancelReason;
	}

	
	public String getCancelReason(){
		return this.cancelReason;
	}

	
	public void setPId(Long pId){
		this.pId = pId;
	}

	
	public Long getPId(){
		return this.pId;
	}

}