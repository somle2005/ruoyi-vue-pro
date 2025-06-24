package com.doudian.open.api.material_recoverFolder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialRecoverFolderParam {


	@SerializedName("folder_ids")
	@OpField(required = false , desc = "需要恢复的文件夹的id列表，不能操作系统文件夹（0：根目录 -1：回收站）。批量操作每次最多20个。", example= "[7000254886243746092, 7000254886243746093]")
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