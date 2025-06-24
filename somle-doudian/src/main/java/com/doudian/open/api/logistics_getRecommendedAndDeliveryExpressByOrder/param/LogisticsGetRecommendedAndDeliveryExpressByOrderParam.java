package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsGetRecommendedAndDeliveryExpressByOrderParam {


	@SerializedName("sender_address")
	@OpField(required = true , desc = "发货地址", example= "")
	private SenderAddress senderAddress;

	@SerializedName("order_info_list")
	@OpField(required = true , desc = "订单信息列表", example= "")
	private List<OrderInfoListItem> orderInfoList;

	@SerializedName("order_channel")
	@OpField(required = false , desc = "订单平台来源编码，不传默认抖店", example= "1")
	private String orderChannel;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSenderAddress(SenderAddress senderAddress){
		this.senderAddress = senderAddress;
	}

	
	public SenderAddress getSenderAddress(){
		return this.senderAddress;
	}

	
	public void setOrderInfoList(List<OrderInfoListItem> orderInfoList){
		this.orderInfoList = orderInfoList;
	}

	
	public List<OrderInfoListItem> getOrderInfoList(){
		return this.orderInfoList;
	}

	
	public void setOrderChannel(String orderChannel){
		this.orderChannel = orderChannel;
	}

	
	public String getOrderChannel(){
		return this.orderChannel;
	}

}