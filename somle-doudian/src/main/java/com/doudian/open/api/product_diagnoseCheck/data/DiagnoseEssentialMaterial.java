package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DiagnoseEssentialMaterial {


	@SerializedName("essential_material_info_list")
	@OpField(desc = "必要图文", example = "")
	private List<EssentialMaterialInfoListItem> essentialMaterialInfoList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEssentialMaterialInfoList(List<EssentialMaterialInfoListItem> essentialMaterialInfoList){
		this.essentialMaterialInfoList = essentialMaterialInfoList;
	}

	
	public List<EssentialMaterialInfoListItem> getEssentialMaterialInfoList(){
		return this.essentialMaterialInfoList;
	}

}