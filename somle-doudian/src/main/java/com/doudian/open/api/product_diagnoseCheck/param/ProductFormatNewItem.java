package com.doudian.open.api.product_diagnoseCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductFormatNewItem {


	@SerializedName("value")
	@OpField(required = false , desc = "属性值id", example= "纯棉")
	private Long value;

	@SerializedName("name")
	@OpField(required = false , desc = "属性值名称", example= "聚酯纤维")
	private String name;

	@SerializedName("diy_type")
	@OpField(required = false , desc = "是否为商家自定义属性值，1为是，0为不是，默认为0", example= "0")
	private Long diyType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValue(Long value){
		this.value = value;
	}

	
	public Long getValue(){
		return this.value;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setDiyType(Long diyType){
		this.diyType = diyType;
	}

	
	public Long getDiyType(){
		return this.diyType;
	}

}