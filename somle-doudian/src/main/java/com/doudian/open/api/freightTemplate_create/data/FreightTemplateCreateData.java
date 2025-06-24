package com.doudian.open.api.freightTemplate_create.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FreightTemplateCreateData {


	@SerializedName("template_id")
	@OpField(desc = "创建的模板的id", example = "1234")
	private Long templateId;


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

}