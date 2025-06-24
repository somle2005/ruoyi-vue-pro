package com.doudian.open.api.freightTemplate_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class FreightTemplateListData {


	@SerializedName("List")
	@OpField(desc = "运费模版列表", example = "")
	private List<ListItem> list;

	@SerializedName("Count")
	@OpField(desc = "总数", example = "1")
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