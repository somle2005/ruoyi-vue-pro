package com.doudian.open.api.material_editFolder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialEditFolderParam {


	@SerializedName("folder_id")
	@OpField(required = true , desc = "文件夹id，不能操作系统文件夹（0：根目录 -1：回收站）", example= "70029608590225411001510")
	private String folderId;

	@SerializedName("name")
	@OpField(required = false , desc = "新的文件夹名称", example= "我是新的文件夹名称")
	private String name;

	@SerializedName("to_folder_id")
	@OpField(required = false , desc = "需要移动到的父文件夹id", example= "70029608590225411001510")
	private String toFolderId;


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

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setToFolderId(String toFolderId){
		this.toFolderId = toFolderId;
	}

	
	public String getToFolderId(){
		return this.toFolderId;
	}

}