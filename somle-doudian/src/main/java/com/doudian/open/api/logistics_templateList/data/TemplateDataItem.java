package com.doudian.open.api.logistics_templateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TemplateDataItem {


	@SerializedName("template_infos")
	@OpField(desc = "模版信息", example = "")
	private List<TemplateInfosItem> templateInfos;

	@SerializedName("logistics_code")
	@OpField(desc = "物流公司", example = "ems")
	private String logisticsCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateInfos(List<TemplateInfosItem> templateInfos){
		this.templateInfos = templateInfos;
	}

	
	public List<TemplateInfosItem> getTemplateInfos(){
		return this.templateInfos;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

}