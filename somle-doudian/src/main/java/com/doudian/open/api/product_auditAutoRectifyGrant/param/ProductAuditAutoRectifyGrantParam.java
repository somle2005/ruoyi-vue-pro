package com.doudian.open.api.product_auditAutoRectifyGrant.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductAuditAutoRectifyGrantParam {


	@SerializedName("operate")
	@OpField(required = true , desc = "1、同意授权；2、拒绝授权；3、待定（代表先不做决策）", example= "1")
	private Integer operate;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOperate(Integer operate){
		this.operate = operate;
	}

	
	public Integer getOperate(){
		return this.operate;
	}

}