package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MeasureInfo {


	@SerializedName("values")
	@OpField(desc = "度量衡模块", example = "")
	private List<ValuesItem> values;

	@SerializedName("template_id")
	@OpField(desc = "度量衡模版id", example = "234")
	private Long templateId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValues(List<ValuesItem> values){
		this.values = values;
	}

	
	public List<ValuesItem> getValues(){
		return this.values;
	}

	
	public void setTemplateId(Long templateId){
		this.templateId = templateId;
	}

	
	public Long getTemplateId(){
		return this.templateId;
	}

}