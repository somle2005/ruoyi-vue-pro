package com.doudian.open.api.product_recommendProperties.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class ProductRecommendPropertiesData {


	@SerializedName("properties")
	@OpField(desc = "推荐的属性列表", example = "")
	private List<PropertiesItem> properties;

	@SerializedName("check_result")
	@OpField(desc = "属性判准结果；如果存在判准结果，且is_right为false，可以在properties找到对应建议结果", example = "")
	private Map<Long,CheckResultItem> checkResult;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProperties(List<PropertiesItem> properties){
		this.properties = properties;
	}

	
	public List<PropertiesItem> getProperties(){
		return this.properties;
	}

	
	public void setCheckResult(Map<Long,CheckResultItem> checkResult){
		this.checkResult = checkResult;
	}

	
	public Map<Long,CheckResultItem> getCheckResult(){
		return this.checkResult;
	}

}