package com.doudian.open.api.spu_QuerySpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuListItem {


	@SerializedName("spuId")
	@OpField(desc = "SPUID", example = "7340298802504761650")
	private Long spuId;

	@SerializedName("spuName")
	@OpField(desc = "SPU名称", example = "9787561139684/红点奖:全球最佳视觉传达设计年鉴")
	private String spuName;

	@SerializedName("categoryId")
	@OpField(desc = "类目ID", example = "23072")
	private Long categoryId;

	@SerializedName("brandId")
	@OpField(desc = "品牌ID", example = "437716142")
	private Long brandId;

	@SerializedName("status")
	@OpField(desc = "SPU状态", example = "1")
	private Long status;

	@SerializedName("spuPropertyInfos")
	@OpField(desc = "属性信息", example = "")
	private List<SpuPropertyInfosItem> spuPropertyInfos;

	@SerializedName("barcodes")
	@OpField(desc = "条码", example = "")
	private List<BarcodesItem> barcodes;

	@SerializedName("materials")
	@OpField(desc = "素材", example = "")
	private List<MaterialsItem> materials;


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

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}

	
	public Long getBrandId(){
		return this.brandId;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setSpuPropertyInfos(List<SpuPropertyInfosItem> spuPropertyInfos){
		this.spuPropertyInfos = spuPropertyInfos;
	}

	
	public List<SpuPropertyInfosItem> getSpuPropertyInfos(){
		return this.spuPropertyInfos;
	}

	
	public void setBarcodes(List<BarcodesItem> barcodes){
		this.barcodes = barcodes;
	}

	
	public List<BarcodesItem> getBarcodes(){
		return this.barcodes;
	}

	
	public void setMaterials(List<MaterialsItem> materials){
		this.materials = materials;
	}

	
	public List<MaterialsItem> getMaterials(){
		return this.materials;
	}

}