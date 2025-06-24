package com.doudian.open.api.logistics_getDesignTemplateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsGetDesignTemplateListData {


	@SerializedName("design_template_data")
	@OpField(desc = "已发布的自定义模板列表", example = "")
	private List<DesignTemplateDataItem> designTemplateData;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDesignTemplateData(List<DesignTemplateDataItem> designTemplateData){
		this.designTemplateData = designTemplateData;
	}

	
	public List<DesignTemplateDataItem> getDesignTemplateData(){
		return this.designTemplateData;
	}

}