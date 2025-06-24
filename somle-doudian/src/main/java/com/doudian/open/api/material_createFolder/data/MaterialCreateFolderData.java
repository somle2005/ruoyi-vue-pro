package com.doudian.open.api.material_createFolder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialCreateFolderData {


	@SerializedName("folder_id")
	@OpField(desc = "文件夹id，全局唯一", example = "7000254886243811628")
	private String folderId;

	@SerializedName("parent_folder_id")
	@OpField(desc = "父文件夹id，全局唯一", example = "7000254886243746092")
	private String parentFolderId;

	@SerializedName("name")
	@OpField(desc = "文件夹名称", example = "商品图片素材")
	private String name;

	@SerializedName("type")
	@OpField(desc = "文件夹类型。0-用户自建 1-默认 2-系统文件夹", example = "1")
	private Integer type;

	@SerializedName("is_new")
	@OpField(desc = "判断文件夹是否为新创建的；若父文件夹下存在同名文件夹，创建时返回该同名文件夹id，is_new为false；若不存在同名文件夹且创建成功，则is_new为true，表示为新创建的文件夹。", example = "true")
	private Boolean isNew;


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

	
	public void setParentFolderId(String parentFolderId){
		this.parentFolderId = parentFolderId;
	}

	
	public String getParentFolderId(){
		return this.parentFolderId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setType(Integer type){
		this.type = type;
	}

	
	public Integer getType(){
		return this.type;
	}

	
	public void setIsNew(Boolean isNew){
		this.isNew = isNew;
	}

	
	public Boolean getIsNew(){
		return this.isNew;
	}

}