package com.doudian.open.api.product_getComponentTemplate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ComponentTemplateInfoListItem {


	@SerializedName("template_id")
	@OpField(desc = "模板ID", example = "101")
	private Long templateId;

	@SerializedName("template_type")
	@OpField(desc = "模板类型: size_info(尺码表)", example = "size_info")
	private String templateType;

	@SerializedName("template_sub_type")
	@OpField(desc = "组件模板子类型:clothing、undies、shoes、children_clothing", example = "clothing")
	private String templateSubType;

	@SerializedName("template_name")
	@OpField(desc = "模板名称", example = "模板名称1")
	private String templateName;

	@SerializedName("component_data")
	@OpField(desc = "模板数据", example = "{title:衣服尺码title,sub_title:衣服尺码desc,selected_size:[XS,M],selected_specs:[身高（cm）,体重（斤）,胸围（cm）],config:{M:{体重（斤）:70,胸围（cm）:67,身高（cm）:110},XS:{体重（斤）:55,胸围（cm）:66,身高（cm）:100}}}")
	private String componentData;

	@SerializedName("image")
	@OpField(desc = "尺码模板图片", example = "")
	private Image image;

	@SerializedName("shareable")
	@OpField(desc = "是否可共享 是-false 否-true", example = "false")
	private Boolean shareable;

	@SerializedName("category_id")
	@OpField(desc = "类目ID", example = "22465")
	private Long categoryId;

	@SerializedName("create_time")
	@OpField(desc = "创建时间", example = "1")
	private Long createTime;

	@SerializedName("update_time")
	@OpField(desc = "更新时间", example = "1")
	private Long updateTime;

	@SerializedName("component_front_data")
	@OpField(desc = "模板配置数据", example = "{title:衣服尺码title,desc:衣服尺码desc,tempName:0711衣服模板tempName,configTable:[{size:XS,specMap:{身高（cm）:100,体重（斤）:55,胸围（cm）:66}},{size:M,specMap:{身高（cm）:110,体重（斤）:70,胸围（cm）:67}}],selectedSpecs:[身高（cm）,体重（斤）,胸围（cm）],specOptions:[身高1（cm）,体重1（斤）,胸围1（cm）],selectedSize:[XS,M]}")
	private String componentFrontData;


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

	
	public void setComponentData(String componentData){
		this.componentData = componentData;
	}

	
	public String getComponentData(){
		return this.componentData;
	}

	
	public void setImage(Image image){
		this.image = image;
	}

	
	public Image getImage(){
		return this.image;
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

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setComponentFrontData(String componentFrontData){
		this.componentFrontData = componentFrontData;
	}

	
	public String getComponentFrontData(){
		return this.componentFrontData;
	}

}