package com.doudian.open.api.order_logisticsAddSinglePack.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderSerialNumberItem {


	@SerializedName("order_id")
	@OpField(required = false , desc = "父订单号", example= "4846347827301748265")
	private String orderId;

	@SerializedName("serial_number_list")
	@OpField(required = false , desc = "商品序列号，单个序列号长度不能超过30位字符，其中手机序列号仅支持填写15～17位数字", example= "[546443524543534]")
	private List<String> serialNumberList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setSerialNumberList(List<String> serialNumberList){
		this.serialNumberList = serialNumberList;
	}

	
	public List<String> getSerialNumberList(){
		return this.serialNumberList;
	}

}