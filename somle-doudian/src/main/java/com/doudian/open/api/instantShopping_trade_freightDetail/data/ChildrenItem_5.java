package com.doudian.open.api.instantShopping_trade_freightDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ChildrenItem_5 {


	@SerializedName("children")
	@OpField(desc = "当前规则生效的地址，统一以List<Struct>结构返回，该结构为嵌套结构。对应的json格式为[{id:32,children:[{id:320500,children:[{id:320508,children:[{id:320508014},{id:320508004}]}]}]}] 注意：返回的为最新的四级地址版本（地址存储升级变更的可能，以最新的返回）", example = "")
	private List<ChildrenItem_6> children;

	@SerializedName("id")
	@OpField(desc = "地址id，第一级是省份、第二级是城市、第三级是区、第四级是街道", example = "1100")
	private Long id;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setChildren(List<ChildrenItem_6> children){
		this.children = children;
	}

	
	public List<ChildrenItem_6> getChildren(){
		return this.children;
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

}