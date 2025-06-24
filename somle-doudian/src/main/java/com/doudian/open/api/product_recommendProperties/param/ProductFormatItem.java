package com.doudian.open.api.product_recommendProperties.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductFormatItem {


	@SerializedName("value")
	@OpField(required = false , desc = "属性值id", example= "1024")
	private Long value;

	@SerializedName("name")
	@OpField(required = false , desc = "属性值名称", example= "短款")
	private String name;

	@SerializedName("diy_type")
	@OpField(required = false , desc = "是否为商家自定义属性值，1为是，0为不是", example= "0")
	private Long diyType;

	@SerializedName("measure_info")
	@OpField(required = false , desc = "度量衡信息，对本接口暂时不需要传", example= "")
	private MeasureInfo measureInfo;


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

	
	public void setMeasureInfo(MeasureInfo measureInfo){
		this.measureInfo = measureInfo;
	}

	
	public MeasureInfo getMeasureInfo(){
		return this.measureInfo;
	}

}