package com.doudian.open.api.buyin_strategyPromotionCreate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ResultItem {


	@SerializedName("success")
	@OpField(desc = "是否操作成功", example = "true")
	private Boolean success;

	@SerializedName("product_id")
	@OpField(desc = "商品id", example = "123456789")
	private Long productId;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "测试商品")
	private String productName;

	@SerializedName("reason")
	@OpField(desc = "绑定失败原因", example = "商品不允许创建推广")
	private String reason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccess(Boolean success){
		this.success = success;
	}

	
	public Boolean getSuccess(){
		return this.success;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setReason(String reason){
		this.reason = reason;
	}

	
	public String getReason(){
		return this.reason;
	}

}