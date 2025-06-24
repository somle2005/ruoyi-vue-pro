package com.doudian.open.api.material_uploadImageSync.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialUploadImageSyncParam {


	@SerializedName("folder_id")
	@OpField(required = true , desc = "文件夹id，0为根目录", example= "2")
	private String folderId;

	@SerializedName("url")
	@OpField(required = false , desc = "图片url，必须是公网可访问。url和file_uri二选一，不能同时为空，如果2者都不为空取url", example= "http://xxx.xxx")
	private String url;

	@SerializedName("material_name")
	@OpField(required = true , desc = "图片名称，开发者自定义，不得超过50个字符。", example= "图片名称.jpg")
	private String materialName;

	@SerializedName("file_uri")
	@OpField(required = false , desc = "二进制文件对应的uri，获取方式请参考：https://op.jinritemai.com/docs/guide-docs/171/1719", example= "tos-cn-i-7veqoeduo3/9e1df78157524c63abf7caa9bb1e88e0")
	private String fileUri;

	@SerializedName("need_distinct")
	@OpField(required = false , desc = "是否需要去重（true/false），默认为false。去重是指：存在已经审核通过且内容相同的图片，直接返回已存在的图片地址。", example= "false")
	private Boolean needDistinct;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFolderId(String folderId){
		this.folderId = folderId;
	}

	
	public String getFolderId(){
		return this.folderId;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

	
	public void setMaterialName(String materialName){
		this.materialName = materialName;
	}

	
	public String getMaterialName(){
		return this.materialName;
	}

	
	public void setFileUri(String fileUri){
		this.fileUri = fileUri;
	}

	
	public String getFileUri(){
		return this.fileUri;
	}

	
	public void setNeedDistinct(Boolean needDistinct){
		this.needDistinct = needDistinct;
	}

	
	public Boolean getNeedDistinct(){
		return this.needDistinct;
	}

}