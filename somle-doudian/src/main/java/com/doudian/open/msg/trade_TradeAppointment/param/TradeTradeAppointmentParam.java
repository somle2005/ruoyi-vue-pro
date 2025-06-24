package com.doudian.open.msg.trade_TradeAppointment.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradeAppointmentParam {


	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4836822388705449082")
	private Long pId;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "子订单ID列表", example= "[4836822388705449082]")
	private List<Long> sIds;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "7220271")
	private Long shopId;

	@SerializedName("order_status")
	@OpField(required = false , desc = "父订单状态，订单创建消息的order_status值为1", example= "2")
	private Long orderStatus;

	@SerializedName("order_type")
	@OpField(required = false , desc = "订单类型： 0: 实物 2: 普通虚拟 4: poi核销 5: 三方核销 6: 服务市场", example= "0")
	private Long orderType;

	@SerializedName("exp_delivery_time")
	@OpField(required = false , desc = "预约发货时间", example= "2021-09-30")
	private String expDeliveryTime;


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

	
	public void setExpDeliveryTime(String expDeliveryTime){
		this.expDeliveryTime = expDeliveryTime;
	}

	
	public String getExpDeliveryTime(){
		return this.expDeliveryTime;
	}

}