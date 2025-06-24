package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MeasureInfo {


	@SerializedName("values")
	@OpField(required = false , desc = "度量衡模块信息，如示例中13克为一个模块", example= "")
	private List<ValuesItem> values;

	@SerializedName("template_id")
	@OpField(required = false , desc = "度量衡模版id，根据/getProductUpdateRule中回填", example= "1")
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