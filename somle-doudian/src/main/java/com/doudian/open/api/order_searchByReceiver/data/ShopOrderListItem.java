package com.doudian.open.api.order_searchByReceiver.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopOrderListItem {


	@SerializedName("create_time")
	@OpField(desc = "下单时间，时间戳，秒", example = "1617355413")
	private String createTime;

	@SerializedName("order_status")
	@OpField(desc = "订单状态：1-待确认/待支付（订单创建完毕），105-已支付，2 备货中，101-部分发货，3-已发货（全部发货），4-已取消，5-已完成（已收货）", example = "3")
	private String orderStatus;

	@SerializedName("order_id")
	@OpField(desc = "店铺订单号", example = "4781320682406083640")
	private String orderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setOrderStatus(String orderStatus){
		this.orderStatus = orderStatus;
	}

	
	public String getOrderStatus(){
		return this.orderStatus;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

}