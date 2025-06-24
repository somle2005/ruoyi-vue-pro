package com.doudian.open.api.product_getCatePropertyV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OptionsItem {


	@SerializedName("name")
	@OpField(desc = "可选值名称", example = "ON:THE BODY/安宝笛")
	private String name;

	@SerializedName("value")
	@OpField(desc = "可选值", example = "1062254699")
	private String value;

	@SerializedName("value_id")
	@OpField(desc = "值的id", example = "1")
	private Long valueId;

	@SerializedName("sequence")
	@OpField(desc = "属性值顺序", example = "2")
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

	
	public void setValue(String value){
		this.value = value;
	}

	
	public String getValue(){
		return this.value;
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