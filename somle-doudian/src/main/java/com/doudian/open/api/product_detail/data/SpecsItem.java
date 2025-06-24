package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpecsItem {


	@SerializedName("property_id")
	@OpField(desc = "标准销售属性id", example = "123")
	private Long propertyId;

	@SerializedName("id")
	@OpField(desc = "【无需使用】规格模版id", example = "1713023986705415")
	private Long id;

	@SerializedName("spec_id")
	@OpField(desc = "【无需使用】规格id", example = "1713023983665214")
	private Long specId;

	@SerializedName("name")
	@OpField(desc = "销售属性", example = "颜色")
	private String name;

	@SerializedName("pid")
	@OpField(desc = "【无需使用】规格父id", example = "1713023986705415")
	private Long pid;

	@SerializedName("is_leaf")
	@OpField(desc = "是否是销售属性值", example = "0")
	private Integer isLeaf;

	@SerializedName("values")
	@OpField(desc = "销售属性值", example = "")
	private List<ValuesItem_3> values;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setSpecId(Long specId){
		this.specId = specId;
	}

	
	public Long getSpecId(){
		return this.specId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setPid(Long pid){
		this.pid = pid;
	}

	
	public Long getPid(){
		return this.pid;
	}

	
	public void setIsLeaf(Integer isLeaf){
		this.isLeaf = isLeaf;
	}

	
	public Integer getIsLeaf(){
		return this.isLeaf;
	}

	
	public void setValues(List<ValuesItem_3> values){
		this.values = values;
	}

	
	public List<ValuesItem_3> getValues(){
		return this.values;
	}

}