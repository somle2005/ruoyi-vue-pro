package com.doudian.open.api.material_getFolderInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialGetFolderInfoData {


	@SerializedName("folder_info")
	@OpField(desc = "文件夹信息", example = "")
	private FolderInfo folderInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFolderInfo(FolderInfo folderInfo){
		this.folderInfo = folderInfo;
	}

	
	public FolderInfo getFolderInfo(){
		return this.folderInfo;
	}

}