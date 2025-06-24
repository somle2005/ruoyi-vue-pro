package com.doudian.open.api.material_easyShuttle.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialEasyShuttleParam {


	@SerializedName("folder_id_list")
	@OpField(required = true , desc = "文件夹ID列表，对该文件夹下的文件夹或素材进行操作；0:开放平台；1:图片根目录；2:视频根目录；-1:回收站", example= "[0]")
	private List<String> folderIdList;

	@SerializedName("operate_type")
	@OpField(required = true , desc = "操作类型：移到回收站：to_recycle，彻底删除：delete_forever", example= "to_recycle")
	private String operateType;

	@SerializedName("material_type_list")
	@OpField(required = true , desc = "操作的素材类型", example= "[photo,video]")
	private List<String> materialTypeList;

	@SerializedName("only_material")
	@OpField(required = false , desc = "是否只操作素材", example= "true")
	private Boolean onlyMaterial;

	@SerializedName("create_time_end")
	@OpField(required = false , desc = "所操作的素材或文件夹的创建时间在该时间点之前", example= "2022-02-22 22:22:22")
	private String createTimeEnd;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFolderIdList(List<String> folderIdList){
		this.folderIdList = folderIdList;
	}

	
	public List<String> getFolderIdList(){
		return this.folderIdList;
	}

	
	public void setOperateType(String operateType){
		this.operateType = operateType;
	}

	
	public String getOperateType(){
		return this.operateType;
	}

	
	public void setMaterialTypeList(List<String> materialTypeList){
		this.materialTypeList = materialTypeList;
	}

	
	public List<String> getMaterialTypeList(){
		return this.materialTypeList;
	}

	
	public void setOnlyMaterial(Boolean onlyMaterial){
		this.onlyMaterial = onlyMaterial;
	}

	
	public Boolean getOnlyMaterial(){
		return this.onlyMaterial;
	}

	
	public void setCreateTimeEnd(String createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	
	public String getCreateTimeEnd(){
		return this.createTimeEnd;
	}

}