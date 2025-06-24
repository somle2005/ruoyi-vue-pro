package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class EssentialMaterialInfoListItem {


	@SerializedName("material_source")
	@OpField(desc = "无", example = "无")
	private String materialSource;

	@SerializedName("material_component_id")
	@OpField(desc = "无", example = "0")
	private Long materialComponentId;

	@SerializedName("code")
	@OpField(desc = "无", example = "0")
	private Long code;

	@SerializedName("url")
	@OpField(desc = "无", example = "无")
	private String url;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialSource(String materialSource){
		this.materialSource = materialSource;
	}

	
	public String getMaterialSource(){
		return this.materialSource;
	}

	
	public void setMaterialComponentId(Long materialComponentId){
		this.materialComponentId = materialComponentId;
	}

	
	public Long getMaterialComponentId(){
		return this.materialComponentId;
	}

	
	public void setCode(Long code){
		this.code = code;
	}

	
	public Long getCode(){
		return this.code;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

}