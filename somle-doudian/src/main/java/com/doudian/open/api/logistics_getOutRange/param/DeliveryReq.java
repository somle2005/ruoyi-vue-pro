package com.doudian.open.api.logistics_getOutRange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DeliveryReq {


	@SerializedName("is_center_delivery")
	@OpField(required = false , desc = "是否接受仅镇中心派送  目前仅支持德邦", example= "true")
	private Boolean isCenterDelivery;

	@SerializedName("is_pickup_self")
	@OpField(required = false , desc = "是否接受合伙人自提，目前仅支持德邦", example= "true")
	private Boolean isPickupSelf;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsCenterDelivery(Boolean isCenterDelivery){
		this.isCenterDelivery = isCenterDelivery;
	}

	
	public Boolean getIsCenterDelivery(){
		return this.isCenterDelivery;
	}

	
	public void setIsPickupSelf(Boolean isPickupSelf){
		this.isPickupSelf = isPickupSelf;
	}

	
	public Boolean getIsPickupSelf(){
		return this.isPickupSelf;
	}

}