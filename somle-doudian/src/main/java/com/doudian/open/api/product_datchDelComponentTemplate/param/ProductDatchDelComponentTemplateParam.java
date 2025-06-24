package com.doudian.open.api.product_datchDelComponentTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductDatchDelComponentTemplateParam {


	@SerializedName("template_id")
	@OpField(required = true , desc = "模板ID", example= "[101]")
	private List<Long> templateId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateId(List<Long> templateId){
		this.templateId = templateId;
	}

	
	public List<Long> getTemplateId(){
		return this.templateId;
	}

}