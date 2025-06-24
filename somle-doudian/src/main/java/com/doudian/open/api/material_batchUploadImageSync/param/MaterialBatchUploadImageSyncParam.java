package com.doudian.open.api.material_batchUploadImageSync.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialBatchUploadImageSyncParam {


	@SerializedName("materials")
	@OpField(required = true , desc = "素材信息", example= "")
	private List<MaterialsItem> materials;

	@SerializedName("need_distinct")
	@OpField(required = false , desc = "是否需要去重（true/false），默认为false。去重是指：存在已经审核通过切内容内容相同的图片，直接返回已存在的图片地址。", example= "false")
	private Boolean needDistinct;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterials(List<MaterialsItem> materials){
		this.materials = materials;
	}

	
	public List<MaterialsItem> getMaterials(){
		return this.materials;
	}

	
	public void setNeedDistinct(Boolean needDistinct){
		this.needDistinct = needDistinct;
	}

	
	public Boolean getNeedDistinct(){
		return this.needDistinct;
	}

}