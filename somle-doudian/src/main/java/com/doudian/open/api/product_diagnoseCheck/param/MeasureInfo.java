package com.doudian.open.api.product_diagnoseCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MeasureInfo {


	@SerializedName("template_id")
	@OpField(required = false , desc = "标准化的公式模板ID", example= "1212")
	private Long templateId;

	@SerializedName("values")
	@OpField(required = false , desc = "度量衡值组", example= "")
	private List<ValuesItem> values;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateId(Long templateId){
		this.templateId = templateId;
	}

	
	public Long getTemplateId(){
		return this.templateId;
	}

	
	public void setValues(List<ValuesItem> values){
		this.values = values;
	}

	
	public List<ValuesItem> getValues(){
		return this.values;
	}

}