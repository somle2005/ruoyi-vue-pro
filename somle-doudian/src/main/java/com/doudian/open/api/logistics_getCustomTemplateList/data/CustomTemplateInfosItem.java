package com.doudian.open.api.logistics_getCustomTemplateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CustomTemplateInfosItem {


	@SerializedName("custom_template_code")
	@OpField(desc = "自定义区模板code", example = "123")
	private String customTemplateCode;

	@SerializedName("custom_template_name")
	@OpField(desc = "自定义区模板名称", example = "muban")
	private String customTemplateName;

	@SerializedName("parent_template_code")
	@OpField(desc = "父模板code(查询标准模板API中返回的template_code)", example = "1")
	private String parentTemplateCode;

	@SerializedName("custom_template_url")
	@OpField(desc = "自定义区模板url(URL资源的内容为xml格式的报文)", example = "1")
	private String customTemplateUrl;

	@SerializedName("custom_template_key_list")
	@OpField(desc = "customTemplateKeyList（打印项中字段列表）", example = "1")
	private List<String> customTemplateKeyList;

	@SerializedName("custom_template_id")
	@OpField(desc = "自定义区模板id", example = "1")
	private Long customTemplateId;

	@SerializedName("parent_template_id")
	@OpField(desc = "父模板id", example = "1")
	private Long parentTemplateId;


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

	
	public void setCustomTemplateUrl(String customTemplateUrl){
		this.customTemplateUrl = customTemplateUrl;
	}

	
	public String getCustomTemplateUrl(){
		return this.customTemplateUrl;
	}

	
	public void setCustomTemplateKeyList(List<String> customTemplateKeyList){
		this.customTemplateKeyList = customTemplateKeyList;
	}

	
	public List<String> getCustomTemplateKeyList(){
		return this.customTemplateKeyList;
	}

	
	public void setCustomTemplateId(Long customTemplateId){
		this.customTemplateId = customTemplateId;
	}

	
	public Long getCustomTemplateId(){
		return this.customTemplateId;
	}

	
	public void setParentTemplateId(Long parentTemplateId){
		this.parentTemplateId = parentTemplateId;
	}

	
	public Long getParentTemplateId(){
		return this.parentTemplateId;
	}

}