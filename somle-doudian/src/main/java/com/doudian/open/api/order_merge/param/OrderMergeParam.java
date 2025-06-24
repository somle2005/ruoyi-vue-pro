package com.doudian.open.api.order_merge.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderMergeParam {


	@SerializedName("merge_list")
	@OpField(required = true , desc = "合并需求列表，最少支持2个，最多支持100个。order_id和open_address_id必须一一对应，不可传错", example= "")
	private List<MergeListItem> mergeList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMergeList(List<MergeListItem> mergeList){
		this.mergeList = mergeList;
	}

	
	public List<MergeListItem> getMergeList(){
		return this.mergeList;
	}

}