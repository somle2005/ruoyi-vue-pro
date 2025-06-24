package com.doudian.open.api.material_searchFolder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialSearchFolderParam {


	@SerializedName("order_by")
	@OpField(required = true , desc = "排序方式 0-创建时间倒序 1-创建时间正序 2-修改时间倒序 3-修改时间正序 4-文件夹名倒序 5-文件夹名正序", example= "1")
	private Integer orderBy;

	@SerializedName("page_num")
	@OpField(required = true , desc = "分页的页数，从1开始", example= "1")
	private Integer pageNum;

	@SerializedName("page_size")
	@OpField(required = true , desc = "每页返回的数量。最大为100，默认为50", example= "40")
	private Integer pageSize;

	@SerializedName("name")
	@OpField(required = false , desc = "需要搜索的文件名片段", example= "图片")
	private String name;

	@SerializedName("folder_id")
	@OpField(required = false , desc = "文件夹id", example= "70032596029638413241510")
	private String folderId;

	@SerializedName("create_time_start")
	@OpField(required = false , desc = "创建时间最小值，包含这一秒", example= "2020-09-03 18:28:00")
	private String createTimeStart;

	@SerializedName("create_time_end")
	@OpField(required = false , desc = "创建时间最大值，包含这一秒", example= "2020-09-03 18:28:01")
	private String createTimeEnd;

	@SerializedName("parent_folder_id")
	@OpField(required = false , desc = "父文件夹id", example= "70032596029638413241510")
	private String parentFolderId;

	@SerializedName("operate_status")
	@OpField(required = false , desc = "文件夹状态。1-有效 4-在回收站中", example= "1")
	private List<Integer> operateStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderBy(Integer orderBy){
		this.orderBy = orderBy;
	}

	
	public Integer getOrderBy(){
		return this.orderBy;
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

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setFolderId(String folderId){
		this.folderId = folderId;
	}

	
	public String getFolderId(){
		return this.folderId;
	}

	
	public void setCreateTimeStart(String createTimeStart){
		this.createTimeStart = createTimeStart;
	}

	
	public String getCreateTimeStart(){
		return this.createTimeStart;
	}

	
	public void setCreateTimeEnd(String createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	
	public String getCreateTimeEnd(){
		return this.createTimeEnd;
	}

	
	public void setParentFolderId(String parentFolderId){
		this.parentFolderId = parentFolderId;
	}

	
	public String getParentFolderId(){
		return this.parentFolderId;
	}

	
	public void setOperateStatus(List<Integer> operateStatus){
		this.operateStatus = operateStatus;
	}

	
	public List<Integer> getOperateStatus(){
		return this.operateStatus;
	}

}