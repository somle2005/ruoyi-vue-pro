package com.doudian.open.api.order_logisticsAddMultiPack.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderLogisticsAddMultiPackData {


	@SerializedName("pack_list")
	@OpField(desc = "包裹信息", example = "")
	private List<PackListItem> packList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPackList(List<PackListItem> packList){
		this.packList = packList;
	}

	
	public List<PackListItem> getPackList(){
		return this.packList;
	}

}