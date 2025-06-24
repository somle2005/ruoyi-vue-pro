package com.doudian.open.api.freightTemplate_detail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QueryOption {


	@SerializedName("query_transfer_rule")
	@OpField(required = true , desc = "是否查询中转规则，默认false", example= "false")
	private Boolean queryTransferRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setQueryTransferRule(Boolean queryTransferRule){
		this.queryTransferRule = queryTransferRule;
	}

	
	public Boolean getQueryTransferRule(){
		return this.queryTransferRule;
	}

}