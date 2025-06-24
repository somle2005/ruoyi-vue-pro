package com.doudian.open.api.logistics_customTemplateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CustomTemplateInfosItem {


	@SerializedName("custom_template_code")
	@OpField(desc = "自定义模板code", example = "C1asaeew2")
	private String customTemplateCode;

	@SerializedName("custom_template_url")
	@OpField(desc = "自定义区模板url(URL资源的内容为xml格式的报文)", example = "http://ekdj")
	private String customTemplateUrl;

	@SerializedName("custom_template_name")
	@OpField(desc = "自定义区模板名称", example = "jtexpress自定义模版")
	private String customTemplateName;

	@SerializedName("parent_template_code")
	@OpField(desc = "父模板code(查询标准模板API中返回的template_code)", example = "jtexpress_76_130")
	private String parentTemplateCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCustomTemplateCode(String customTemplateCode){
		this.customTemplateCode = customTemplateCode;
	}

	
	public String getCustomTemplateCode(){
		return this.customTemplateCode;
	}

	
	public void setCustomTemplateUrl(String customTemplateUrl){
		this.customTemplateUrl = customTemplateUrl;
	}

	
	public String getCustomTemplateUrl(){
		return this.customTemplateUrl;
	}

	
	public void setCustomTemplateName(String customTemplateName){
		this.customTemplateName = customTemplateName;
	}

	
	public String getCustomTemplateName(){
		return this.customTemplateName;
	}

	
	public void setParentTemplateCode(String parentTemplateCode){
		this.parentTemplateCode = parentTemplateCode;
	}

	
	public String getParentTemplateCode(){
		return this.parentTemplateCode;
	}

}