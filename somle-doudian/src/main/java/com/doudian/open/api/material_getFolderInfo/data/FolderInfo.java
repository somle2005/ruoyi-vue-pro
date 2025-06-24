package com.doudian.open.api.material_getFolderInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class FolderInfo {


	@SerializedName("folder_id")
	@OpField(desc = "文件夹id", example = "70072571115706780601250")
	private String folderId;

	@SerializedName("folder_type")
	@OpField(desc = "文件夹类型", example = "0")
	private Integer folderType;

	@SerializedName("folder_name")
	@OpField(desc = "文件夹名称", example = "文件夹名称")
	private String folderName;

	@SerializedName("operate_status")
	@OpField(desc = "文件夹状态，1-有效 4-在回收站中", example = "1")
	private Integer operateStatus;

	@SerializedName("child_folder")
	@OpField(desc = "子文件夹列表", example = "")
	private List<ChildFolderItem> childFolder;

	@SerializedName("child_material")
	@OpField(desc = "素材列表", example = "")
	private List<ChildMaterialItem> childMaterial;

	@SerializedName("parent_folder_id")
	@OpField(desc = "父文件夹id，0-素材中心根目录", example = "0")
	private String parentFolderId;

	@SerializedName("create_time")
	@OpField(desc = "文件夹创建时间", example = "2021-09-12 12:23:23")
	private String createTime;

	@SerializedName("update_time")
	@OpField(desc = "文件夹最近一次修改时间", example = "2021-09-12 12:23:23")
	private String updateTime;

	@SerializedName("delete_time")
	@OpField(desc = "文件夹移动到回收站的时间，只有在回收站中，该字段才有意义", example = "0")
	private String deleteTime;

	@SerializedName("total_child_material_num")
	@OpField(desc = "文件夹下素材总数目", example = "12")
	private Long totalChildMaterialNum;

	@SerializedName("folder_attr")
	@OpField(desc = "文件夹属性，0-文件夹（不限素材类型），1-图片文件夹（只能上传图片），2-视频文件夹（只能上传视频）", example = "0")
	private Integer folderAttr;


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

	
	public void setFolderType(Integer folderType){
		this.folderType = folderType;
	}

	
	public Integer getFolderType(){
		return this.folderType;
	}

	
	public void setFolderName(String folderName){
		this.folderName = folderName;
	}

	
	public String getFolderName(){
		return this.folderName;
	}

	
	public void setOperateStatus(Integer operateStatus){
		this.operateStatus = operateStatus;
	}

	
	public Integer getOperateStatus(){
		return this.operateStatus;
	}

	
	public void setChildFolder(List<ChildFolderItem> childFolder){
		this.childFolder = childFolder;
	}

	
	public List<ChildFolderItem> getChildFolder(){
		return this.childFolder;
	}

	
	public void setChildMaterial(List<ChildMaterialItem> childMaterial){
		this.childMaterial = childMaterial;
	}

	
	public List<ChildMaterialItem> getChildMaterial(){
		return this.childMaterial;
	}

	
	public void setParentFolderId(String parentFolderId){
		this.parentFolderId = parentFolderId;
	}

	
	public String getParentFolderId(){
		return this.parentFolderId;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

	
	public void setDeleteTime(String deleteTime){
		this.deleteTime = deleteTime;
	}

	
	public String getDeleteTime(){
		return this.deleteTime;
	}

	
	public void setTotalChildMaterialNum(Long totalChildMaterialNum){
		this.totalChildMaterialNum = totalChildMaterialNum;
	}

	
	public Long getTotalChildMaterialNum(){
		return this.totalChildMaterialNum;
	}

	
	public void setFolderAttr(Integer folderAttr){
		this.folderAttr = folderAttr;
	}

	
	public Integer getFolderAttr(){
		return this.folderAttr;
	}

}