package com.doudian.open.api.material_uploadVideoAsync.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialUploadVideoAsyncParam {


	@SerializedName("folder_id")
	@OpField(required = true , desc = "父文件夹id，0为根目录。若需要创建文件夹，请参考：https://ehome.bytedance.net/djt/apiManage/doc/preview/946?doc=true", example= "0")
	private String folderId;

	@SerializedName("url")
	@OpField(required = false , desc = "视频url，url和file_uri二选一，不能同时为空，如果2者都传则取url", example= "https://xxxx.xxx.xx")
	private String url;

	@SerializedName("name")
	@OpField(required = true , desc = "视频名称，不得超过50个字符，最好带上后缀", example= "视频.mp4")
	private String name;

	@SerializedName("file_uri")
	@OpField(required = false , desc = "二进制文件对应的uri，获取方式请参考：https://op.jinritemai.com/docs/guide-docs/171/1719", example= "tos-cn-i-7veqoeduo3/9e1df78157524c63abf7caa9bb1e88e0")
	private String fileUri;


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

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setFileUri(String fileUri){
		this.fileUri = fileUri;
	}

	
	public String getFileUri(){
		return this.fileUri;
	}

}