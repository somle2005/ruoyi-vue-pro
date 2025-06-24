package com.doudian.open.api.address_listAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AddressListAftersaleStrategyData {


	@SerializedName("size")
	@OpField(desc = "每页数量;", example = "2")
	private Long size;

	@SerializedName("strategy_list")
	@OpField(desc = "策略列表;", example = "")
	private List<StrategyListItem> strategyList;

	@SerializedName("total")
	@OpField(desc = "总量;", example = "12")
	private Long total;

	@SerializedName("page")
	@OpField(desc = "页数;", example = "1")
	private Long page;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setStrategyList(List<StrategyListItem> strategyList){
		this.strategyList = strategyList;
	}

	
	public List<StrategyListItem> getStrategyList(){
		return this.strategyList;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

}