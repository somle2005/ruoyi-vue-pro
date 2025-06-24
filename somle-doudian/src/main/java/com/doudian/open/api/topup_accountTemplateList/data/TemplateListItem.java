package com.doudian.open.api.topup_accountTemplateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TemplateListItem {


	@SerializedName("template_id")
	@OpField(desc = "模板id", example = "1")
	private Long templateId;

	@SerializedName("name")
	@OpField(desc = "模板名称", example = "手机充值")
	private String name;


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

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}