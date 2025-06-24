package com.doudian.open.api.spu_createSpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProofsItem {


	@SerializedName("type")
	@OpField(required = true , desc = "证明信息（类型：实物图、版权页）", example= "2")
	private Integer type;

	@SerializedName("name")
	@OpField(required = true , desc = "证明信息类型，枚举值：2-实物图、6-版权页", example= "实物图")
	private String name;

	@SerializedName("description")
	@OpField(required = true , desc = "描述信息", example= "该实物图用于xxx")
	private String description;

	@SerializedName("content")
	@OpField(required = true , desc = "证明材料的实际内容", example= "")
	private List<ContentItem> content;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setType(Integer type){
		this.type = type;
	}

	
	public Integer getType(){
		return this.type;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setDescription(String description){
		this.description = description;
	}

	
	public String getDescription(){
		return this.description;
	}

	
	public void setContent(List<ContentItem> content){
		this.content = content;
	}

	
	public List<ContentItem> getContent(){
		return this.content;
	}

}