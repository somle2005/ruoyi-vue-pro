package com.doudian.open.api.logistics_getDesignTemplateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DesignTemplateDataItem {


	@SerializedName("design_template_code")
	@OpField(desc = "自定义模板code", example = "12QWER")
	private String designTemplateCode;

	@SerializedName("design_template_name")
	@OpField(desc = "自定义模板名称", example = "一号名")
	private String designTemplateName;

	@SerializedName("design_template_url")
	@OpField(desc = "自定义模板url", example = "1")
	private String designTemplateUrl;

	@SerializedName("design_template_key_list")
	@OpField(desc = "打印项中字段列表", example = "1")
	private List<String> designTemplateKeyList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDesignTemplateCode(String designTemplateCode){
		this.designTemplateCode = designTemplateCode;
	}

	
	public String getDesignTemplateCode(){
		return this.designTemplateCode;
	}

	
	public void setDesignTemplateName(String designTemplateName){
		this.designTemplateName = designTemplateName;
	}

	
	public String getDesignTemplateName(){
		return this.designTemplateName;
	}

	
	public void setDesignTemplateUrl(String designTemplateUrl){
		this.designTemplateUrl = designTemplateUrl;
	}

	
	public String getDesignTemplateUrl(){
		return this.designTemplateUrl;
	}

	
	public void setDesignTemplateKeyList(List<String> designTemplateKeyList){
		this.designTemplateKeyList = designTemplateKeyList;
	}

	
	public List<String> getDesignTemplateKeyList(){
		return this.designTemplateKeyList;
	}

}