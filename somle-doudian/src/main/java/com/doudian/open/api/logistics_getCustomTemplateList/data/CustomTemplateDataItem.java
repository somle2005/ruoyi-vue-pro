package com.doudian.open.api.logistics_getCustomTemplateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CustomTemplateDataItem {


	@SerializedName("logistics_code")
	@OpField(desc = "物流服务商编码", example = "shunfeng")
	private String logisticsCode;

	@SerializedName("custom_template_infos")
	@OpField(desc = "用户使用的模板数据", example = "")
	private List<CustomTemplateInfosItem> customTemplateInfos;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setCustomTemplateInfos(List<CustomTemplateInfosItem> customTemplateInfos){
		this.customTemplateInfos = customTemplateInfos;
	}

	
	public List<CustomTemplateInfosItem> getCustomTemplateInfos(){
		return this.customTemplateInfos;
	}

}