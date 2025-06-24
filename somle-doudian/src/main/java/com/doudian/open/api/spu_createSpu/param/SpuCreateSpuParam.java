package com.doudian.open.api.spu_createSpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuCreateSpuParam {


	@SerializedName("category_leaf_id")
	@OpField(required = true , desc = "叶子类目ID", example= "23362")
	private Long categoryLeafId;

	@SerializedName("spu_images")
	@OpField(required = false , desc = "SPU图片（已废弃，请采用materials字段）", example= "[https://p-boe.byted.org/tos-boe-i-c1s52z2b8k/47aae92445314984b27c3854ce2ec569~tplv-c1s52z2b8k-image.image]")
	private List<String> spuImages;

	@SerializedName("property_infos")
	@OpField(required = true , desc = "属性信息（/spu/getSpuRule接口可获取）", example= "")
	private List<PropertyInfosItem> propertyInfos;

	@SerializedName("spu_actual_images")
	@OpField(required = false , desc = "SPU实物图（已废弃，请采用proofs字段）", example= "[https://p-boe.byted.org/tos-boe-i-c1s52z2b8k/47aae92445314984b27c3854ce2ec569~tplv-c1s52z2b8k-image.image]")
	private List<String> spuActualImages;

	@SerializedName("materials")
	@OpField(required = false , desc = "SPU素材", example= "")
	private List<MaterialsItem> materials;

	@SerializedName("proofs")
	@OpField(required = false , desc = "证明信息", example= "")
	private List<ProofsItem> proofs;

	@SerializedName("barcodes")
	@OpField(required = false , desc = "条码", example= "")
	private List<BarcodesItem> barcodes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryLeafId(Long categoryLeafId){
		this.categoryLeafId = categoryLeafId;
	}

	
	public Long getCategoryLeafId(){
		return this.categoryLeafId;
	}

	
	public void setSpuImages(List<String> spuImages){
		this.spuImages = spuImages;
	}

	
	public List<String> getSpuImages(){
		return this.spuImages;
	}

	
	public void setPropertyInfos(List<PropertyInfosItem> propertyInfos){
		this.propertyInfos = propertyInfos;
	}

	
	public List<PropertyInfosItem> getPropertyInfos(){
		return this.propertyInfos;
	}

	
	public void setSpuActualImages(List<String> spuActualImages){
		this.spuActualImages = spuActualImages;
	}

	
	public List<String> getSpuActualImages(){
		return this.spuActualImages;
	}

	
	public void setMaterials(List<MaterialsItem> materials){
		this.materials = materials;
	}

	
	public List<MaterialsItem> getMaterials(){
		return this.materials;
	}

	
	public void setProofs(List<ProofsItem> proofs){
		this.proofs = proofs;
	}

	
	public List<ProofsItem> getProofs(){
		return this.proofs;
	}

	
	public void setBarcodes(List<BarcodesItem> barcodes){
		this.barcodes = barcodes;
	}

	
	public List<BarcodesItem> getBarcodes(){
		return this.barcodes;
	}

}