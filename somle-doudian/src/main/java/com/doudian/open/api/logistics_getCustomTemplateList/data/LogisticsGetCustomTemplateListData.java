package com.doudian.open.api.logistics_getCustomTemplateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsGetCustomTemplateListData {


	@SerializedName("custom_template_data")
	@OpField(desc = "商家所有快递自定义模板的数据列表", example = "")
	private List<CustomTemplateDataItem> customTemplateData;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCustomTemplateData(List<CustomTemplateDataItem> customTemplateData){
		this.customTemplateData = customTemplateData;
	}

	
	public List<CustomTemplateDataItem> getCustomTemplateData(){
		return this.customTemplateData;
	}

}