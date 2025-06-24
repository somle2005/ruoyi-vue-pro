package com.doudian.open.msg.order_JadeQualityChangeType.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderJadeQualityChangeTypeParam {


	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4829566578327619346")
	private Long pId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "1111114783")
	private Long shopId;


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

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

}