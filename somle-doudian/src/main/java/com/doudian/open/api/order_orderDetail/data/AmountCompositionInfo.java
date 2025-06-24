package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AmountCompositionInfo {


	@SerializedName("platform_cost")
	@OpField(desc = "平台出资", example = "100")
	private Long platformCost;

	@SerializedName("shop_cost")
	@OpField(desc = "商家出资", example = "100")
	private Long shopCost;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlatformCost(Long platformCost){
		this.platformCost = platformCost;
	}

	
	public Long getPlatformCost(){
		return this.platformCost;
	}

	
	public void setShopCost(Long shopCost){
		this.shopCost = shopCost;
	}

	
	public Long getShopCost(){
		return this.shopCost;
	}

}