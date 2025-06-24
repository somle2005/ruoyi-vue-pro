package com.doudian.open.api.product_getCatePropertyV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MeasureTemplatesItem {


	@SerializedName("display_name")
	@OpField(desc = "模版名称", example = "xx模版")
	private String displayName;

	@SerializedName("value_modules")
	@OpField(desc = "度量衡模版下的模块，可为多个，一般情况为一个，一般情况一个模块就是一个值+单位形式", example = "")
	private List<ValueModulesItem> valueModules;

	@SerializedName("template_id")
	@OpField(desc = "度量衡模版id", example = "23")
	private Long templateId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	
	public String getDisplayName(){
		return this.displayName;
	}

	
	public void setValueModules(List<ValueModulesItem> valueModules){
		this.valueModules = valueModules;
	}

	
	public List<ValueModulesItem> getValueModules(){
		return this.valueModules;
	}

	
	public void setTemplateId(Long templateId){
		this.templateId = templateId;
	}

	
	public Long getTemplateId(){
		return this.templateId;
	}

}