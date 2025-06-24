package com.doudian.open.api.spu_getSpuInfoBySpuId.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuGetSpuInfoBySpuIdData {


	@SerializedName("spu_property_infos")
	@OpField(desc = "spu属性信息", example = "-")
	private List<SpuPropertyInfosItem> spuPropertyInfos;

	@SerializedName("spu_info")
	@OpField(desc = "spu信息", example = "-")
	private SpuInfo spuInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuPropertyInfos(List<SpuPropertyInfosItem> spuPropertyInfos){
		this.spuPropertyInfos = spuPropertyInfos;
	}

	
	public List<SpuPropertyInfosItem> getSpuPropertyInfos(){
		return this.spuPropertyInfos;
	}

	
	public void setSpuInfo(SpuInfo spuInfo){
		this.spuInfo = spuInfo;
	}

	
	public SpuInfo getSpuInfo(){
		return this.spuInfo;
	}

}