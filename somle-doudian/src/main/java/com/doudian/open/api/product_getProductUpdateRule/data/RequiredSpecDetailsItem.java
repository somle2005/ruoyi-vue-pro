package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class RequiredSpecDetailsItem {


	@SerializedName("sell_property_name")
	@OpField(desc = "规格项名称", example = "颜色")
	private String sellPropertyName;

	@SerializedName("sell_property_id")
	@OpField(desc = "规格项id", example = "123")
	private Long sellPropertyId;

	@SerializedName("property_values")
	@OpField(desc = "规格值选项", example = "")
	private List<PropertyValuesItem> propertyValues;

	@SerializedName("support_remark")
	@OpField(desc = "是否支持备注", example = "true")
	private Boolean supportRemark;

	@SerializedName("support_diy")
	@OpField(desc = "是否可以自定义规格值", example = "false")
	private Boolean supportDiy;

	@SerializedName("is_required")
	@OpField(desc = "是否必填", example = "false")
	private Boolean isRequired;

	@SerializedName("value_display_style")
	@OpField(desc = "规格样式，cascader是为导航样式", example = "cascader")
	private String valueDisplayStyle;

	@SerializedName("measure_templates")
	@OpField(desc = "度量衡模版，可能有多个", example = "")
	private List<MeasureTemplatesItem> measureTemplates;

	@SerializedName("need_paging_query_value")
	@OpField(desc = "是否需要二次查询规格值", example = "false")
	private Boolean needPagingQueryValue;

	@SerializedName("navigation_properties")
	@OpField(desc = "导航属性", example = "")
	private List<NavigationPropertiesItem> navigationProperties;

	@SerializedName("property_default_display")
	@OpField(desc = "1", example = "1")
	private Boolean propertyDefaultDisplay;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSellPropertyName(String sellPropertyName){
		this.sellPropertyName = sellPropertyName;
	}

	
	public String getSellPropertyName(){
		return this.sellPropertyName;
	}

	
	public void setSellPropertyId(Long sellPropertyId){
		this.sellPropertyId = sellPropertyId;
	}

	
	public Long getSellPropertyId(){
		return this.sellPropertyId;
	}

	
	public void setPropertyValues(List<PropertyValuesItem> propertyValues){
		this.propertyValues = propertyValues;
	}

	
	public List<PropertyValuesItem> getPropertyValues(){
		return this.propertyValues;
	}

	
	public void setSupportRemark(Boolean supportRemark){
		this.supportRemark = supportRemark;
	}

	
	public Boolean getSupportRemark(){
		return this.supportRemark;
	}

	
	public void setSupportDiy(Boolean supportDiy){
		this.supportDiy = supportDiy;
	}

	
	public Boolean getSupportDiy(){
		return this.supportDiy;
	}

	
	public void setIsRequired(Boolean isRequired){
		this.isRequired = isRequired;
	}

	
	public Boolean getIsRequired(){
		return this.isRequired;
	}

	
	public void setValueDisplayStyle(String valueDisplayStyle){
		this.valueDisplayStyle = valueDisplayStyle;
	}

	
	public String getValueDisplayStyle(){
		return this.valueDisplayStyle;
	}

	
	public void setMeasureTemplates(List<MeasureTemplatesItem> measureTemplates){
		this.measureTemplates = measureTemplates;
	}

	
	public List<MeasureTemplatesItem> getMeasureTemplates(){
		return this.measureTemplates;
	}

	
	public void setNeedPagingQueryValue(Boolean needPagingQueryValue){
		this.needPagingQueryValue = needPagingQueryValue;
	}

	
	public Boolean getNeedPagingQueryValue(){
		return this.needPagingQueryValue;
	}

	
	public void setNavigationProperties(List<NavigationPropertiesItem> navigationProperties){
		this.navigationProperties = navigationProperties;
	}

	
	public List<NavigationPropertiesItem> getNavigationProperties(){
		return this.navigationProperties;
	}

	
	public void setPropertyDefaultDisplay(Boolean propertyDefaultDisplay){
		this.propertyDefaultDisplay = propertyDefaultDisplay;
	}

	
	public Boolean getPropertyDefaultDisplay(){
		return this.propertyDefaultDisplay;
	}

}