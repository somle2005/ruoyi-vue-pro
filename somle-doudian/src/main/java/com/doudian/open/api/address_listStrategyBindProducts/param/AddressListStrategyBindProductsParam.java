package com.doudian.open.api.address_listStrategyBindProducts.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressListStrategyBindProductsParam {


	@SerializedName("strategy_id")
	@OpField(required = false , desc = "策略id，必传，多地址策略对应的ID.", example= "AFS7418493389946110223")
	private String strategyId;

	@SerializedName("page")
	@OpField(required = false , desc = "页码,从1开始，", example= "1")
	private Long page;

	@SerializedName("page_size")
	@OpField(required = false , desc = "每页数目,最大100。地址策略目前最多支持拉取1w条记录，翻页数量超过1w会被系统拦截。", example= "20")
	private Long pageSize;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStrategyId(String strategyId){
		this.strategyId = strategyId;
	}

	
	public String getStrategyId(){
		return this.strategyId;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

}