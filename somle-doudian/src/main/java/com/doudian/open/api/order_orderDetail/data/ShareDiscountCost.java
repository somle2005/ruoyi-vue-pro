package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class ShareDiscountCost {


	@SerializedName("extra_map")
	@OpField(desc = "第三方平台承担明细", example = "1")
	private Map<String,String> extraMap;

	@SerializedName("third_platform_cost")
	@OpField(desc = "第三方平台承担金额，具体的承担明细详见extra_map", example = "0")
	private Long thirdPlatformCost;

	@SerializedName("author_cost")
	@OpField(desc = "作者承担金额，单位：分", example = "0")
	private Long authorCost;

	@SerializedName("shop_cost")
	@OpField(desc = "商家承担金额，单位：分", example = "0")
	private Long shopCost;

	@SerializedName("platform_cost")
	@OpField(desc = "平台承担金额，单位：分", example = "0")
	private Long platformCost;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExtraMap(Map<String,String> extraMap){
		this.extraMap = extraMap;
	}

	
	public Map<String,String> getExtraMap(){
		return this.extraMap;
	}

	
	public void setThirdPlatformCost(Long thirdPlatformCost){
		this.thirdPlatformCost = thirdPlatformCost;
	}

	
	public Long getThirdPlatformCost(){
		return this.thirdPlatformCost;
	}

	
	public void setAuthorCost(Long authorCost){
		this.authorCost = authorCost;
	}

	
	public Long getAuthorCost(){
		return this.authorCost;
	}

	
	public void setShopCost(Long shopCost){
		this.shopCost = shopCost;
	}

	
	public Long getShopCost(){
		return this.shopCost;
	}

	
	public void setPlatformCost(Long platformCost){
		this.platformCost = platformCost;
	}

	
	public Long getPlatformCost(){
		return this.platformCost;
	}

}