package com.doudian.open.api.sms_public_template.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SmsPublicTemplateParam {


	@SerializedName("size")
	@OpField(required = false , desc = "每页数据大小", example= "10")
	private Long size;

	@SerializedName("page")
	@OpField(required = false , desc = "第几页，从0开始", example= "0")
	private Long page;

	@SerializedName("template_id")
	@OpField(required = false , desc = "模版id", example= "ST_90251")
	private String templateId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	
	public String getTemplateId(){
		return this.templateId;
	}

}