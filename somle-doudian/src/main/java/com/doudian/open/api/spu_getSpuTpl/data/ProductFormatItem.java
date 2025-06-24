package com.doudian.open.api.spu_getSpuTpl.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductFormatItem {


	@SerializedName("name")
	@OpField(desc = "属性名", example = "后置摄像头像素")
	private String name;

	@SerializedName("options")
	@OpField(desc = "选项", example = "-")
	private List<OptionsItem> options;

	@SerializedName("require")
	@OpField(desc = "是否必填 1是", example = "1")
	private Long require;

	@SerializedName("type")
	@OpField(desc = "类型 text：可输入，select：单选，multi_select: 多选", example = "select")
	private String type;

	@SerializedName("category_id")
	@OpField(desc = "类目id", example = "31860")
	private Long categoryId;

	@SerializedName("multi_select_max")
	@OpField(desc = "多选最大选项", example = "5")
	private Long multiSelectMax;

	@SerializedName("property_type")
	@OpField(desc = "属性类型 0 绑定类型。1关键属性", example = "0")
	private Long propertyType;

	@SerializedName("property_id")
	@OpField(desc = "属性id", example = "1001")
	private Long propertyId;

	@SerializedName("sequence")
	@OpField(desc = "顺序", example = "1")
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

	
	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	
	public List<OptionsItem> getOptions(){
		return this.options;
	}

	
	public void setRequire(Long require){
		this.require = require;
	}

	
	public Long getRequire(){
		return this.require;
	}

	
	public void setType(String type){
		this.type = type;
	}

	
	public String getType(){
		return this.type;
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setMultiSelectMax(Long multiSelectMax){
		this.multiSelectMax = multiSelectMax;
	}

	
	public Long getMultiSelectMax(){
		return this.multiSelectMax;
	}

	
	public void setPropertyType(Long propertyType){
		this.propertyType = propertyType;
	}

	
	public Long getPropertyType(){
		return this.propertyType;
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

	
	public void setSequence(Long sequence){
		this.sequence = sequence;
	}

	
	public Long getSequence(){
		return this.sequence;
	}

}