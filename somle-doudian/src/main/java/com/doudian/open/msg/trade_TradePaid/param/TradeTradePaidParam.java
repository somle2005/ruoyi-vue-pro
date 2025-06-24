package com.doudian.open.msg.trade_TradePaid.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradePaidParam {


	@SerializedName("pay_amount")
	@OpField(required = false , desc = "订单实付金额", example= "1990")
	private Long payAmount;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "子订单ID列表", example= "[4837328765348566675]")
	private List<Long> sIds;

	@SerializedName("order_status")
	@OpField(required = false , desc = "父订单状态，订单支付消息的status值为2", example= "2")
	private Long orderStatus;

	@SerializedName("order_type")
	@OpField(required = false , desc = "订单类型： 0: 实物 2: 普通虚拟 4: poi核销 5: 三方核销 6: 服务市场", example= "0")
	private Long orderType;

	@SerializedName("pay_time")
	@OpField(required = false , desc = "1: 在线订单支付时间 2: 货到付款订单确认时间", example= "1630373504")
	private Long payTime;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4837328765348566675")
	private Long pId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "77977")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("pay_type")
	@OpField(required = false , desc = "订单支付方式： 0: 货到付款 1: 微信 2: 支付宝", example= "1")
	private Long payType;

	@SerializedName("biz")
	@OpField(required = false , desc = "订单业务类型，表示买家从哪里看到的这个商品、产生了订单: 1: 鲁班广告 2: 联盟 4: 商城 8:自主经营 10: 线索通支付表单 12: 抖音门店 14: 抖+ 15: 穿山甲", example= "2")
	private Long biz;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPayAmount(Long payAmount){
		this.payAmount = payAmount;
	}

	
	public Long getPayAmount(){
		return this.payAmount;
	}

	
	public void setSIds(List<Long> sIds){
		this.sIds = sIds;
	}

	
	public List<Long> getSIds(){
		return this.sIds;
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

	
	public void setPayTime(Long payTime){
		this.payTime = payTime;
	}

	
	public Long getPayTime(){
		return this.payTime;
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

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setPayType(Long payType){
		this.payType = payType;
	}

	
	public Long getPayType(){
		return this.payType;
	}

	
	public void setBiz(Long biz){
		this.biz = biz;
	}

	
	public Long getBiz(){
		return this.biz;
	}

}