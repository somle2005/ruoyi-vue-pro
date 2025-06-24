package com.doudian.open.api.material_createFolder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialCreateFolderParam {


	@SerializedName("name")
	@OpField(required = true , desc = "文件夹名称。最多20字符", example= "商品图片素材")
	private String name;

	@SerializedName("parent_folder_id")
	@OpField(required = false , desc = "父文件夹id，根目录为0。不传该参数默认在根目录下创建文件夹", example= "70036799713989921721250")
	private String parentFolderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setParentFolderId(String parentFolderId){
		this.parentFolderId = parentFolderId;
	}

	
	public String getParentFolderId(){
		return this.parentFolderId;
	}

}