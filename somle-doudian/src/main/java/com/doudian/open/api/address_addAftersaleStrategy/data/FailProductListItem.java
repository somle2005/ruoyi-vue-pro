package com.doudian.open.api.address_addAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailProductListItem {


	@SerializedName("product_id")
	@OpField(desc = "商品ID;", example = "12233")
	private String productId;

	@SerializedName("fail_reason")
	@OpField(desc = "绑定失败的具体原因，开发者可以依据返回的结果对用户展示为什么绑定失败。", example = "商品正在审核中，暂不支持修改")
	private String failReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setFailReason(String failReason){
		this.failReason = failReason;
	}

	
	public String getFailReason(){
		return this.failReason;
	}

}