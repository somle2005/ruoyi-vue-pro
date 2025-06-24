package com.doudian.open.api.freightTemplate_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ChildrenItem_5 {


	@SerializedName("id")
	@OpField(desc = "地址id，第一级是省份、第二级是城市、第三级是区、第四级是街道", example = "1")
	private String id;

	@SerializedName("children")
	@OpField(desc = "下一级地址信息", example = "")
	private List<ChildrenItem_6> children;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(String id){
		this.id = id;
	}

	
	public String getId(){
		return this.id;
	}

	
	public void setChildren(List<ChildrenItem_6> children){
		this.children = children;
	}

	
	public List<ChildrenItem_6> getChildren(){
		return this.children;
	}

}