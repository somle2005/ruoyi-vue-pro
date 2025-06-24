package com.doudian.open.api.product_createComponentTemplateV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductCreateComponentTemplateV2Param {


	@SerializedName("template_type")
	@OpField(required = true , desc = "模板类型：尺码模板", example= "size_info")
	private String templateType;

	@SerializedName("template_sub_type")
	@OpField(required = true , desc = "模板子类型: clothing(服装)、undies(内衣)、shoes(鞋靴类)、children_clothing(童装)", example= "clothing")
	private String templateSubType;

	@SerializedName("template_name")
	@OpField(required = true , desc = "模板名称", example= "模板名称1")
	private String templateName;

	@SerializedName("component_front_data")
	@OpField(required = true , desc = "商品组件数据 json，表格行列顺序以selectedSize和selectedSpecs的顺序为准", example= "{title:测试模板3,desc:测试,tempName:测试模板3副本1副本1,configTable:[{size:XS,specMap:{身高（cm）:1,体重（斤）:2,胸围（cm）:3}},{size:M,specMap:{身高（cm）:10,体重（斤）:10,胸围（cm）:10}}],selectedSpecs:[身高（cm）,体重（斤）,胸围（cm）],specOptions:[身高（cm）,体重（斤）,胸围（cm）],selectedSize:[XS,M]}")
	private String componentFrontData;

	@SerializedName("shareable")
	@OpField(required = false , desc = "是否设置为公有模板(多个商品可共用)。true-是，false-不是；不传默认fasle", example= "true")
	private Boolean shareable;

	@SerializedName("category_id")
	@OpField(required = false , desc = "类目id，用来确定模板类型", example= "214691")
	private Long categoryId;


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

	
	public void setShareable(Boolean shareable){
		this.shareable = shareable;
	}

	
	public Boolean getShareable(){
		return this.shareable;
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

}