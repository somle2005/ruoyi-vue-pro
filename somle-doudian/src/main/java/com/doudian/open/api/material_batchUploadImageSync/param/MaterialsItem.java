package com.doudian.open.api.material_batchUploadImageSync.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialsItem {


	@SerializedName("request_id")
	@OpField(required = true , desc = "该参数仅有2个作用：（1）一次请求中素材的唯一标示；（2）接口防并发，规则是：不同请求所有request_id排序之后拼接起来，若相同视为同一次请求", example= "1234567890")
	private String requestId;

	@SerializedName("folder_id")
	@OpField(required = true , desc = "文件夹id，0为素材中心根目录。若想创建文件夹，请参考：https://ehome.bytedance.net/djt/apiManage/doc/preview/946?doc=true", example= "0")
	private String folderId;

	@SerializedName("name")
	@OpField(required = true , desc = "素材名称，长度限制为50个字符", example= "这是一个图片")
	private String name;

	@SerializedName("url")
	@OpField(required = false , desc = "图片url。如果是二进制上传，请使用file_uri字段。url和file_uri二选一，不能同时为空", example= "http://xxx/origin")
	private String url;

	@SerializedName("file_uri")
	@OpField(required = false , desc = "二进制文件对应的uri，获取方式请参考：https://op.jinritemai.com/docs/guide-docs/171/1719", example= "tos-cn-i-7veqoeduo3/9e1df78157524c63abf7caa9bb1e88e0")
	private String fileUri;

	@SerializedName("material_type")
	@OpField(required = true , desc = "素材类型，请传固定值：photo", example= "photo")
	private String materialType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	
	public String getRequestId(){
		return this.requestId;
	}

	
	public void setFolderId(String folderId){
		this.folderId = folderId;
	}

	
	public String getFolderId(){
		return this.folderId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

	
	public void setFileUri(String fileUri){
		this.fileUri = fileUri;
	}

	
	public String getFileUri(){
		return this.fileUri;
	}

	
	public void setMaterialType(String materialType){
		this.materialType = materialType;
	}

	
	public String getMaterialType(){
		return this.materialType;
	}

}