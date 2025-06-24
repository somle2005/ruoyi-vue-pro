package com.doudian.open.api.product_diagnoseCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ComponentTemplate {


	@SerializedName("template_type")
	@OpField(required = false , desc = "模板类型: size_info(尺码表)", example= "size_info")
	private String templateType;

	@SerializedName("template_sub_type")
	@OpField(required = false , desc = "指定模板类型: clothing、undies、shoes、children_clothing", example= "clothing")
	private String templateSubType;

	@SerializedName("template_name")
	@OpField(required = false , desc = "模板名称", example= "模板名称")
	private String templateName;

	@SerializedName("component_front_data")
	@OpField(required = false , desc = "商品组件编辑器源数据 json", example= "{title:连身衣/爬服/哈衣,desc:连身衣/爬服/哈衣,tempName:,configTable:[{size:66cm,specMap:{体重(斤):5-7,身高(CM):66}},{size:73cm,specMap:{体重(斤):7-9,身高(CM):73}},{size:80cm,specMap:{体重(斤):9-12,身高(CM):80}},{size:90cm,specMap:{体重(斤):11-15,身高(CM):90}}],selectedSpecs:[身高(CM),体重(斤)],headerName:尺码,specOptions:[身高(CM),体重(斤)],selectedSize:[66cm,73cm,80cm,90cm],selectedSizeSpecValMap:{}}")
	private String componentFrontData;

	@SerializedName("component_data")
	@OpField(required = false , desc = "商品组件数据 json", example= "{title:连身衣/爬服/哈衣,sub_title:连身衣/爬服/哈衣,selected_size:[66cm,73cm,80cm,90cm],selected_specs:[身高(CM),体重(斤)],config:{66cm:{体重(斤):5-7,身高(CM):66},73cm:{体重(斤):7-9,身高(CM):73},80cm:{体重(斤):9-12,身高(CM):80},90cm:{体重(斤):11-15,身高(CM):90}},selected_size_spec_val_map:{}}")
	private String componentData;

	@SerializedName("shareable")
	@OpField(required = false , desc = "是否可共享", example= "false")
	private Boolean shareable;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateType(String templateType){
		this.templateType = templateType;
	}

	
	public String getTemplateType(){
		return this.templateType;
	}

	
	public void setTemplateSubType(String templateSubType){
		this.templateSubType = templateSubType;
	}

	
	public String getTemplateSubType(){
		return this.templateSubType;
	}

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
	}

	
	public void setComponentFrontData(String componentFrontData){
		this.componentFrontData = componentFrontData;
	}

	
	public String getComponentFrontData(){
		return this.componentFrontData;
	}

	
	public void setComponentData(String componentData){
		this.componentData = componentData;
	}

	
	public String getComponentData(){
		return this.componentData;
	}

	
	public void setShareable(Boolean shareable){
		this.shareable = shareable;
	}

	
	public Boolean getShareable(){
		return this.shareable;
	}

}