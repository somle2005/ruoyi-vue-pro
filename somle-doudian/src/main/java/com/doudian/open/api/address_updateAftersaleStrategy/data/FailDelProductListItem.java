package com.doudian.open.api.address_updateAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailDelProductListItem {


	@SerializedName("product_id")
	@OpField(desc = "商品ID;", example = "3709239428372365627")
	private String productId;

	@SerializedName("fail_reason")
	@OpField(desc = "失败原因", example = "商品正在审核中，禁止操作")
	private String failReason;

	@SerializedName("fail_code")
	@OpField(desc = "失败code", example = "10002")
	private Long failCode;


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

	
	public void setFailCode(Long failCode){
		this.failCode = failCode;
	}

	
	public Long getFailCode(){
		return this.failCode;
	}

}