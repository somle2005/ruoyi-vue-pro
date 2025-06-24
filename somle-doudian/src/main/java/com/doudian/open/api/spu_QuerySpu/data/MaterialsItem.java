package com.doudian.open.api.spu_QuerySpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialsItem {


	@SerializedName("type")
	@OpField(desc = "类型: 1-主图", example = "1")
	private Long type;

	@SerializedName("content")
	@OpField(desc = "内容", example = "")
	private List<ContentItem> content;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setType(Long type){
		this.type = type;
	}

	
	public Long getType(){
		return this.type;
	}

	
	public void setContent(List<ContentItem> content){
		this.content = content;
	}

	
	public List<ContentItem> getContent(){
		return this.content;
	}

}