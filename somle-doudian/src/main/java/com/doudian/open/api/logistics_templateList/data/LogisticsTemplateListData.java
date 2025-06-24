package com.doudian.open.api.logistics_templateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsTemplateListData {


	@SerializedName("template_data")
	@OpField(desc = "模版数据", example = "")
	private List<TemplateDataItem> templateData;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateData(List<TemplateDataItem> templateData){
		this.templateData = templateData;
	}

	
	public List<TemplateDataItem> getTemplateData(){
		return this.templateData;
	}

}