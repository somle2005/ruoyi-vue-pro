package com.doudian.open.api.product_qualificationConfig.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductQualificationConfigData {


	@SerializedName("config_list")
	@OpField(desc = "资质列表", example = "")
	private List<ConfigListItem> configList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setConfigList(List<ConfigListItem> configList){
		this.configList = configList;
	}

	
	public List<ConfigListItem> getConfigList(){
		return this.configList;
	}

}