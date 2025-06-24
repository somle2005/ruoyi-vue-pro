package com.doudian.open.api.material_searchMaterial.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialSearchMaterialData {


	@SerializedName("material_info_list")
	@OpField(desc = "素材列表信息", example = "")
	private List<MaterialInfoListItem> materialInfoList;

	@SerializedName("total")
	@OpField(desc = "总数", example = "3")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialInfoList(List<MaterialInfoListItem> materialInfoList){
		this.materialInfoList = materialInfoList;
	}

	
	public List<MaterialInfoListItem> getMaterialInfoList(){
		return this.materialInfoList;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}