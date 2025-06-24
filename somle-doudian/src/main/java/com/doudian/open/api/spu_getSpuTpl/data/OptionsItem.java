package com.doudian.open.api.spu_getSpuTpl.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OptionsItem {


	@SerializedName("name")
	@OpField(desc = "属性值名称", example = "1300万像素")
	private String name;

	@SerializedName("value_id")
	@OpField(desc = "属性值id", example = "26219")
	private Long valueId;

	@SerializedName("sequence")
	@OpField(desc = "属性值顺序", example = "1")
	private Long sequence;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setValueId(Long valueId){
		this.valueId = valueId;
	}

	
	public Long getValueId(){
		return this.valueId;
	}

	
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	
	public Long getSequence(){
		return this.sequence;
	}

}