package com.doudian.open.api.logistics_templateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TemplateInfosItem {


	@SerializedName("template_id")
	@OpField(desc = "模版id", example = "14")
	private Long templateId;

	@SerializedName("template_code")
	@OpField(desc = "模版编码", example = "ems_100_180")
	private String templateCode;

	@SerializedName("template_name")
	@OpField(desc = "模版名称", example = "EMS二联单")
	private String templateName;

	@SerializedName("template_url")
	@OpField(desc = "模版URL", example = "https://lf3-cm.ecombdstatic.com/obj/logistics-davinci/template/template_ems100.xml")
	private String templateUrl;

	@SerializedName("version")
	@OpField(desc = "版本", example = "1")
	private Integer version;

	@SerializedName("template_type")
	@OpField(desc = "模版类型； 1-一联单 2-二联单", example = "2")
	private Integer templateType;

	@SerializedName("perview_url")
	@OpField(desc = "预览URL", example = "https://lf9-cm.ecombdstatic.com/obj/logistics-davinci/preview/jt_100_180.png")
	private String perviewUrl;


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

	
	public void setTemplateCode(String templateCode){
		this.templateCode = templateCode;
	}

	
	public String getTemplateCode(){
		return this.templateCode;
	}

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
	}

	
	public void setTemplateUrl(String templateUrl){
		this.templateUrl = templateUrl;
	}

	
	public String getTemplateUrl(){
		return this.templateUrl;
	}

	
	public void setVersion(Integer version){
		this.version = version;
	}

	
	public Integer getVersion(){
		return this.version;
	}

	
	public void setTemplateType(Integer templateType){
		this.templateType = templateType;
	}

	
	public Integer getTemplateType(){
		return this.templateType;
	}

	
	public void setPerviewUrl(String perviewUrl){
		this.perviewUrl = perviewUrl;
	}

	
	public String getPerviewUrl(){
		return this.perviewUrl;
	}

}