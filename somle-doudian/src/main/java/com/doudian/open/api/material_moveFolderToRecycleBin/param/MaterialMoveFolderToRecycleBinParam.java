package com.doudian.open.api.material_moveFolderToRecycleBin.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialMoveFolderToRecycleBinParam {


	@SerializedName("folder_ids")
	@OpField(required = true , desc = "移动到回收站的文件夹id列表", example= "[70032596029638413241510]")
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