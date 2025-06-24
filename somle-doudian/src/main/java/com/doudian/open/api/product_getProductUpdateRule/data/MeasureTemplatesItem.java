package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MeasureTemplatesItem {


	@SerializedName("display_name")
	@OpField(desc = "模版名称", example = "xx模版")
	private String displayName;

	@SerializedName("template_id")
	@OpField(desc = "度量衡模版id", example = "12")
	private Long templateId;

	@SerializedName("value_modules")
	@OpField(desc = "度量衡模版模块内容，一个模版多个模块", example = "")
	private List<ValueModulesItem> valueModules;


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

	
	public void setTemplateId(Long templateId){
		this.templateId = templateId;
	}

	
	public Long getTemplateId(){
		return this.templateId;
	}

	
	public void setValueModules(List<ValueModulesItem> valueModules){
		this.valueModules = valueModules;
	}

	
	public List<ValueModulesItem> getValueModules(){
		return this.valueModules;
	}

}