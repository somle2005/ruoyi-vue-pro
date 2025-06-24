package com.doudian.open.api.address_addAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AddressAddAftersaleStrategyData {


	@SerializedName("fail_product_list")
	@OpField(desc = "绑定失败商品id列表", example = "")
	private List<FailProductListItem> failProductList;

	@SerializedName("success_product_list")
	@OpField(desc = "绑定成功的商品ID;", example = "1233")
	private List<String> successProductList;

	@SerializedName("strategy_id")
	@OpField(desc = "策略ID;", example = "AFS1234")
	private String strategyId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFailProductList(List<FailProductListItem> failProductList){
		this.failProductList = failProductList;
	}

	
	public List<FailProductListItem> getFailProductList(){
		return this.failProductList;
	}

	
	public void setSuccessProductList(List<String> successProductList){
		this.successProductList = successProductList;
	}

	
	public List<String> getSuccessProductList(){
		return this.successProductList;
	}

	
	public void setStrategyId(String strategyId){
		this.strategyId = strategyId;
	}

	
	public String getStrategyId(){
		return this.strategyId;
	}

}