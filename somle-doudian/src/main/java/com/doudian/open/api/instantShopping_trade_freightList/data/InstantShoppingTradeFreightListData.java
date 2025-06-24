package com.doudian.open.api.instantShopping_trade_freightList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class InstantShoppingTradeFreightListData {


	@SerializedName("List")
	@OpField(desc = "返回结果", example = "")
	private List<ListItem> list;

	@SerializedName("Count")
	@OpField(desc = "模板数量", example = "10")
	private Long count;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setList(List<ListItem> list){
		this.list = list;
	}

	
	public List<ListItem> getList(){
		return this.list;
	}

	
	public void setCount(Long count){
		this.count = count;
	}

	
	public Long getCount(){
		return this.count;
	}

}