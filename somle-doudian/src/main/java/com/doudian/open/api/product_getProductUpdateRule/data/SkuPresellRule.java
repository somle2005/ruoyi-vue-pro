package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuPresellRule {


	@SerializedName("support")
	@OpField(desc = "是否支持", example = "false")
	private Boolean support;

	@SerializedName("min_presell_price")
	@OpField(desc = "预售门槛价", example = "2000")
	private Long minPresellPrice;

	@SerializedName("support_delivery_after_pay")
	@OpField(desc = "是否支持支付结束后发货", example = "false")
	private Boolean supportDeliveryAfterPay;

	@SerializedName("support_delivery_after_presell")
	@OpField(desc = "是否支持预售结束后发货", example = "false")
	private Boolean supportDeliveryAfterPresell;

	@SerializedName("delivery_after_pay_config")
	@OpField(desc = "支付结束后规则", example = "")
	private DeliveryAfterPayConfig deliveryAfterPayConfig;

	@SerializedName("delivery_after_presell_config")
	@OpField(desc = "预售结束后规则", example = "")
	private DeliveryAfterPresellConfig deliveryAfterPresellConfig;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSupport(Boolean support){
		this.support = support;
	}

	
	public Boolean getSupport(){
		return this.support;
	}

	
	public void setMinPresellPrice(Long minPresellPrice){
		this.minPresellPrice = minPresellPrice;
	}

	
	public Long getMinPresellPrice(){
		return this.minPresellPrice;
	}

	
	public void setSupportDeliveryAfterPay(Boolean supportDeliveryAfterPay){
		this.supportDeliveryAfterPay = supportDeliveryAfterPay;
	}

	
	public Boolean getSupportDeliveryAfterPay(){
		return this.supportDeliveryAfterPay;
	}

	
	public void setSupportDeliveryAfterPresell(Boolean supportDeliveryAfterPresell){
		this.supportDeliveryAfterPresell = supportDeliveryAfterPresell;
	}

	
	public Boolean getSupportDeliveryAfterPresell(){
		return this.supportDeliveryAfterPresell;
	}

	
	public void setDeliveryAfterPayConfig(DeliveryAfterPayConfig deliveryAfterPayConfig){
		this.deliveryAfterPayConfig = deliveryAfterPayConfig;
	}

	
	public DeliveryAfterPayConfig getDeliveryAfterPayConfig(){
		return this.deliveryAfterPayConfig;
	}

	
	public void setDeliveryAfterPresellConfig(DeliveryAfterPresellConfig deliveryAfterPresellConfig){
		this.deliveryAfterPresellConfig = deliveryAfterPresellConfig;
	}

	
	public DeliveryAfterPresellConfig getDeliveryAfterPresellConfig(){
		return this.deliveryAfterPresellConfig;
	}

}