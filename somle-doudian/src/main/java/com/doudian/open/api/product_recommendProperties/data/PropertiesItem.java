package com.doudian.open.api.product_recommendProperties.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PropertiesItem {


	@SerializedName("property_name")
	@OpField(desc = "属性项名称", example = "厚度")
	private String propertyName;

	@SerializedName("property_values")
	@OpField(desc = "推荐的属性值列表", example = "")
	private List<PropertyValuesItem> propertyValues;

	@SerializedName("recommend_source")
	@OpField(desc = "属性推荐来源：SimilarProductRecommend表示同款属性推荐DescPredictRecommend表示来自信息实时预测", example = "SimilarProductRecommend")
	private String recommendSource;

	@SerializedName("property_id")
	@OpField(desc = "属性项ID", example = "241")
	private Long propertyId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setPropertyValues(List<PropertyValuesItem> propertyValues){
		this.propertyValues = propertyValues;
	}

	
	public List<PropertyValuesItem> getPropertyValues(){
		return this.propertyValues;
	}

	
	public void setRecommendSource(String recommendSource){
		this.recommendSource = recommendSource;
	}

	
	public String getRecommendSource(){
		return this.recommendSource;
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

}