package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShareCost {


	@SerializedName("author_cost")
	@OpField(desc = "达人承担；分", example = "200")
	private Long authorCost;

	@SerializedName("shop_cost")
	@OpField(desc = "商家承担；分", example = "200")
	private Long shopCost;

	@SerializedName("platform_cost")
	@OpField(desc = "平台承担；分", example = "200")
	private Long platformCost;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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