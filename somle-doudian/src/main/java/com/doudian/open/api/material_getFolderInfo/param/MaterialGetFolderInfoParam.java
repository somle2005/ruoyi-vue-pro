package com.doudian.open.api.material_getFolderInfo.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialGetFolderInfoParam {


	@SerializedName("folder_id")
	@OpField(required = true , desc = "文件夹id", example= "70072571115706780601250")
	private String folderId;

	@SerializedName("page_num")
	@OpField(required = true , desc = "分页的页数，从1开始", example= "1")
	private Integer pageNum;

	@SerializedName("page_size")
	@OpField(required = true , desc = "每页返回的数量。最大为100，默认为50", example= "50")
	private Integer pageSize;


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

	
	public void setPageNum(Integer pageNum){
		this.pageNum = pageNum;
	}

	
	public Integer getPageNum(){
		return this.pageNum;
	}

	
	public void setPageSize(Integer pageSize){
		this.pageSize = pageSize;
	}

	
	public Integer getPageSize(){
		return this.pageSize;
	}

}