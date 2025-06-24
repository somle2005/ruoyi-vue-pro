package com.doudian.open.api.afterSale_rejectReasonCodeList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AfterSaleRejectReasonCodeListData {


	@SerializedName("items")
	@OpField(desc = "售后商家拒绝原因详情列表", example = "")
	private List<ItemsItem> items;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	
	public List<ItemsItem> getItems(){
		return this.items;
	}

}