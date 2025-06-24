package com.doudian.open.api.material_searchFolder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialSearchFolderData {


	@SerializedName("folder_info_list")
	@OpField(desc = "文件夹列表", example = "")
	private List<FolderInfoListItem> folderInfoList;

	@SerializedName("total")
	@OpField(desc = "符合筛选条件的文件夹数量", example = "200")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFolderInfoList(List<FolderInfoListItem> folderInfoList){
		this.folderInfoList = folderInfoList;
	}

	
	public List<FolderInfoListItem> getFolderInfoList(){
		return this.folderInfoList;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}