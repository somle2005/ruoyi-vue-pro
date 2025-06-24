package com.doudian.open.api.order_searchList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CombineStatusItem {


	@SerializedName("order_status")
	@OpField(required = false , desc = "订单状态，,分隔多个状态；1-待支付；101-部分发货；105-已支付；2-待发货；3-已发货；4-已取消；5-已完成", example= "1")
	private String orderStatus;

	@SerializedName("main_status")
	@OpField(required = false , desc = "【已废弃，不推荐使用】主流程状态，,分隔多个状态；", example= "103")
	private String mainStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderStatus(String orderStatus){
		this.orderStatus = orderStatus;
	}

	
	public String getOrderStatus(){
		return this.orderStatus;
	}

	
	public void setMainStatus(String mainStatus){
		this.mainStatus = mainStatus;
	}

	
	public String getMainStatus(){
		return this.mainStatus;
	}

}