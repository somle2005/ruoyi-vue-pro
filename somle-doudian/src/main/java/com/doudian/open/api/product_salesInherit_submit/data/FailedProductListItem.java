package com.doudian.open.api.product_salesInherit_submit.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailedProductListItem {


	@SerializedName("product_id")
	@OpField(desc = "提报失败站内商品id", example = "3592552460734101255")
	private Long productId;

	@SerializedName("failed_msg")
	@OpField(desc = "失败原因描述", example = "请勿重复提报站内店铺商品")
	private String failedMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setFailedMsg(String failedMsg){
		this.failedMsg = failedMsg;
	}

	
	public String getFailedMsg(){
		return this.failedMsg;
	}

}