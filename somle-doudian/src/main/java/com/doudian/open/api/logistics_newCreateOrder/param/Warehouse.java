package com.doudian.open.api.logistics_newCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Warehouse {


	@SerializedName("is_sum_up")
	@OpField(required = true , desc = "true 总对总门店发货", example= "true")
	private Boolean isSumUp;

	@SerializedName("wh_code")
	@OpField(required = false , desc = "仓库id编码", example= "1")
	private String whCode;

	@SerializedName("wh_order_no")
	@OpField(required = false , desc = "仓库订单号(丹鸟等仓发链路使用)", example= "8837383")
	private String whOrderNo;

	@SerializedName("delivery_type")
	@OpField(required = false , desc = "发货方式，2-门店发货 3-仓库发货（不传默认为3）", example= "2")
	private String deliveryType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsSumUp(Boolean isSumUp){
		this.isSumUp = isSumUp;
	}

	
	public Boolean getIsSumUp(){
		return this.isSumUp;
	}

	
	public void setWhCode(String whCode){
		this.whCode = whCode;
	}

	
	public String getWhCode(){
		return this.whCode;
	}

	
	public void setWhOrderNo(String whOrderNo){
		this.whOrderNo = whOrderNo;
	}

	
	public String getWhOrderNo(){
		return this.whOrderNo;
	}

	
	public void setDeliveryType(String deliveryType){
		this.deliveryType = deliveryType;
	}

	
	public String getDeliveryType(){
		return this.deliveryType;
	}

}