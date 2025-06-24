package com.doudian.open.api.material_deleteFolder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialDeleteFolderParam {


	@SerializedName("folder_ids")
	@OpField(required = false , desc = "文件夹id list，最多不超过20个", example= "[7001012973925941548]")
	private List<String> folderIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFolderIds(List<String> folderIds){
		this.folderIds = folderIds;
	}

	
	public List<String> getFolderIds(){
		return this.folderIds;
	}

}