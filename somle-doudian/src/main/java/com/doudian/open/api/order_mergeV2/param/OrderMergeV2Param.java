package com.doudian.open.api.order_mergeV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderMergeV2Param {


	@SerializedName("merge_list")
	@OpField(required = false , desc = "合单列表", example= "")
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