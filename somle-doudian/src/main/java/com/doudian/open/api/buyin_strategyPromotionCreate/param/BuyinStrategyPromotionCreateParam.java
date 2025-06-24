package com.doudian.open.api.buyin_strategyPromotionCreate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinStrategyPromotionCreateParam {


	@SerializedName("product_ids")
	@OpField(required = true , desc = "商品id", example= "123456789")
	private List<Long> productIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductIds(List<Long> productIds){
		this.productIds = productIds;
	}

	
	public List<Long> getProductIds(){
		return this.productIds;
	}

}