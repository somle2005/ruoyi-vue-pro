package com.doudian.open.api.brand_getSug.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BrandGetSugData {


	@SerializedName("sug_list")
	@OpField(desc = "品牌信息列表", example = "")
	private List<SugListItem> sugList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSugList(List<SugListItem> sugList){
		this.sugList = sugList;
	}

	
	public List<SugListItem> getSugList(){
		return this.sugList;
	}

}