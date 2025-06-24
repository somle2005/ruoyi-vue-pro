package com.doudian.open.api.product_recommendProperties.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class MeasureInfo {


	@SerializedName("template_id")
	@OpField(required = false , desc = "度量衡模板id", example= "1")
	private Long templateId;

	@SerializedName("values")
	@OpField(required = false , desc = "度量衡内容", example= "")
	private List<ValuesItem> values;

	@SerializedName("extra")
	@OpField(required = false , desc = "自定义度量衡扩展信息", example= "{:}")
	private Map<String,String> extra;


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

	
	public void setExtra(Map<String,String> extra){
		this.extra = extra;
	}

	
	public Map<String,String> getExtra(){
		return this.extra;
	}

}