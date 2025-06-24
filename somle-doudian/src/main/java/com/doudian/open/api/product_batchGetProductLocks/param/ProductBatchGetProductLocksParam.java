package com.doudian.open.api.product_batchGetProductLocks.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductBatchGetProductLocksParam {


	@SerializedName("product_ids")
	@OpField(required = true , desc = "商品ID数组", example= "[3686835674755019677]")
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