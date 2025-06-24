package com.doudian.open.api.promise_SaveTemplate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PromiseSaveTemplateData {


	@SerializedName("template_id")
	@OpField(desc = "模板ID", example = "18588559")
	private String templateId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	
	public String getTemplateId(){
		return this.templateId;
	}

}