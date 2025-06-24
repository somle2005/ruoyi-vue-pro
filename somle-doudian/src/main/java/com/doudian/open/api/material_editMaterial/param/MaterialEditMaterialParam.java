package com.doudian.open.api.material_editMaterial.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialEditMaterialParam {


	@SerializedName("material_id")
	@OpField(required = true , desc = "素材id", example= "7000291764753940780")
	private String materialId;

	@SerializedName("material_name")
	@OpField(required = false , desc = "素材名称，不得超过50个字符", example= "编辑功能.jpg")
	private String materialName;

	@SerializedName("to_folder_id")
	@OpField(required = false , desc = "目标文件夹id，0--素材中心", example= "6999833978756661548")
	private String toFolderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialId(String materialId){
		this.materialId = materialId;
	}

	
	public String getMaterialId(){
		return this.materialId;
	}

	
	public void setMaterialName(String materialName){
		this.materialName = materialName;
	}

	
	public String getMaterialName(){
		return this.materialName;
	}

	
	public void setToFolderId(String toFolderId){
		this.toFolderId = toFolderId;
	}

	
	public String getToFolderId(){
		return this.toFolderId;
	}

}