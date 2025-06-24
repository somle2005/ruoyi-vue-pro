package com.doudian.open.api.freightTemplate_create.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ChildrenItem_4 {


	@SerializedName("id")
	@OpField(required = false , desc = "地址id，第一级是省份、第二级是城市、第三级是区、第四级是街道", example= "2222")
	private Long id;

	@SerializedName("children")
	@OpField(required = false , desc = "下一级地址信息", example= "")
	private List<ChildrenItem_5> children;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setChildren(List<ChildrenItem_5> children){
		this.children = children;
	}

	
	public List<ChildrenItem_5> getChildren(){
		return this.children;
	}

}