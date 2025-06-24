package com.doudian.open.api.product_getPublishProductLimit.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetPublishProductLimitData {


	@SerializedName("product_limit_result")
	@OpField(desc = "返回校验结果列表", example = "")
	private List<ProductLimitResultItem> productLimitResult;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductLimitResult(List<ProductLimitResultItem> productLimitResult){
		this.productLimitResult = productLimitResult;
	}

	
	public List<ProductLimitResultItem> getProductLimitResult(){
		return this.productLimitResult;
	}

}