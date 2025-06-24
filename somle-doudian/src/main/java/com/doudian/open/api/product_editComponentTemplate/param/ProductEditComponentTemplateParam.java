package com.doudian.open.api.product_editComponentTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductEditComponentTemplateParam {


	@SerializedName("template_id")
	@OpField(required = true , desc = "模板ID", example= "101")
	private Long templateId;

	@SerializedName("template_name")
	@OpField(required = false , desc = "模板名称", example= "模板名称2")
	private String templateName;

	@SerializedName("component_data")
	@OpField(required = false , desc = "模板数据json", example= "{title:服装上衣模板,desc:dy服装上衣模板,tempName:dy服装上衣模板,configTable:[{size:XS,specMap:{身高（cm）:180,体重（斤）:70,胸围（cm）:80}},{size:M,specMap:{身高（cm）:185,体重（斤）:80,胸围（cm）:85}}],selectedSpecs:[身高（cm）,体重（斤）,胸围（cm）],specOptions:[身高（cm）,体重（斤）,胸围（cm）],selectedSize:[xl,xxl]}")
	private String componentData;

	@SerializedName("shareable")
	@OpField(required = false , desc = "是否为公有模板(多个商品可共用)", example= "true")
	private Boolean shareable;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateId(Long templateId){
		this.templateId = templateId;
	}

	
	public Long getTemplateId(){
		return this.templateId;
	}

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
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