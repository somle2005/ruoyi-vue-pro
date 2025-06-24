package com.doudian.open.api.spu_getSpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuGetSpuData {


	@SerializedName("spu_id")
	@OpField(desc = "SPU ID", example = "7120712486076088620")
	private Long spuId;

	@SerializedName("spu_name")
	@OpField(desc = "SPU名", example = "小王子/981013")
	private String spuName;

	@SerializedName("category_leaf_id")
	@OpField(desc = "类目ID", example = "23362")
	private Long categoryLeafId;

	@SerializedName("property_infos")
	@OpField(desc = "属性信息", example = "")
	private List<PropertyInfosItem> propertyInfos;

	@SerializedName("cspus")
	@OpField(desc = "CSPU信息", example = "")
	private List<CspusItem> cspus;

	@SerializedName("status")
	@OpField(desc = "1:上线，2:下线，3:审核中，4:审核不通过", example = "状态")
	private Long status;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

	
	public void setSpuName(String spuName){
		this.spuName = spuName;
	}

	
	public String getSpuName(){
		return this.spuName;
	}

	
	public void setCategoryLeafId(Long categoryLeafId){
		this.categoryLeafId = categoryLeafId;
	}

	
	public Long getCategoryLeafId(){
		return this.categoryLeafId;
	}

	
	public void setPropertyInfos(List<PropertyInfosItem> propertyInfos){
		this.propertyInfos = propertyInfos;
	}

	
	public List<PropertyInfosItem> getPropertyInfos(){
		return this.propertyInfos;
	}

	
	public void setCspus(List<CspusItem> cspus){
		this.cspus = cspus;
	}

	
	public List<CspusItem> getCspus(){
		return this.cspus;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

}