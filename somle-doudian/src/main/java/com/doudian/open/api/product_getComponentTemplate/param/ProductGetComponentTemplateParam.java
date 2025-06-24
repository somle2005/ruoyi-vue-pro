package com.doudian.open.api.product_getComponentTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductGetComponentTemplateParam {


	@SerializedName("template_type")
	@OpField(required = false , desc = "模板类型: size_info(尺码表)", example= "size_info")
	private String templateType;

	@SerializedName("template_sub_type")
	@OpField(required = false , desc = "组件模板子类型；clothing -饰；undies-内衣；shoes 鞋靴；children_clothing-童装", example= "clothing")
	private String templateSubType;

	@SerializedName("template_id")
	@OpField(required = false , desc = "模板ID", example= "101")
	private Long templateId;

	@SerializedName("shareable")
	@OpField(required = false , desc = "是否设置为公有模板(多个商品可共用)。true-是，false-不是；不传默认true", example= "true")
	private Boolean shareable;

	@SerializedName("page_num")
	@OpField(required = false , desc = "页码，从0开始，最大支持100", example= "0")
	private Long pageNum;

	@SerializedName("page_size")
	@OpField(required = false , desc = "每页条数，最大支持20；page_size和template_id二选一入参", example= "20")
	private Long pageSize;


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

	
	public void setTemplateId(Long templateId){
		this.templateId = templateId;
	}

	
	public Long getTemplateId(){
		return this.templateId;
	}

	
	public void setShareable(Boolean shareable){
		this.shareable = shareable;
	}

	
	public Boolean getShareable(){
		return this.shareable;
	}

	
	public void setPageNum(Long pageNum){
		this.pageNum = pageNum;
	}

	
	public Long getPageNum(){
		return this.pageNum;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

}