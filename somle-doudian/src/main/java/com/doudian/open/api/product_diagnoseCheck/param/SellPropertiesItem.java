package com.doudian.open.api.product_diagnoseCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SellPropertiesItem {


	@SerializedName("property_name")
	@OpField(required = false , desc = "销售属性项名称", example= "颜色分类")
	private String propertyName;

	@SerializedName("value_name")
	@OpField(required = false , desc = "销售属性值名字", example= "黄色")
	private String valueName;

	@SerializedName("measure_info")
	@OpField(required = false , desc = "度量衡信息", example= "")
	private MeasureInfo measureInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setValueName(String valueName){
		this.valueName = valueName;
	}

	
	public String getValueName(){
		return this.valueName;
	}

	
	public void setMeasureInfo(MeasureInfo measureInfo){
		this.measureInfo = measureInfo;
	}

	
	public MeasureInfo getMeasureInfo(){
		return this.measureInfo;
	}

}