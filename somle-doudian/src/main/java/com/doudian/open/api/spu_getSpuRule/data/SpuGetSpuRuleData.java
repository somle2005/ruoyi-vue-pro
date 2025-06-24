package com.doudian.open.api.spu_getSpuRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuGetSpuRuleData {


	@SerializedName("spu_property_rule")
	@OpField(desc = "SPU属性规则", example = "")
	private List<SpuPropertyRuleItem> spuPropertyRule;

	@SerializedName("spu_images_rule")
	@OpField(desc = "SPU图片规则(已废弃，请采用spu_material_rules字段)", example = "")
	private SpuImagesRule spuImagesRule;

	@SerializedName("spu_actual_images_rule")
	@OpField(desc = "SPU实物图规则（已废弃，请采用spu_proof_rules字段）", example = "")
	private SpuActualImagesRule spuActualImagesRule;

	@SerializedName("control_type")
	@OpField(desc = "0-不管控，商家在该类目下发布商品时，不强制要求命中SPU。 - 1-弱管控，商家在该类目下发布商品时，强制要求命中SPU（即关键属性必须一致），但绑定属性不强制要求一致。 - 2-强管控，商家在该类目下发布商品时，强制要求命中SPU，且绑定属性必须一致。", example = "2")
	private Long controlType;

	@SerializedName("support_spu_product")
	@OpField(desc = "- true 表示商家在该类目基于SPU发布商品，发商品的管控策略见管控类型。 - false 表示商家在该类目不需要基于SPU发布商品。不用发布SPU，直接发布商品即可。", example = "true")
	private Boolean supportSpuProduct;

	@SerializedName("support_create_spu")
	@OpField(desc = "true-可以发布SPU，false-不能发布SPU", example = "true")
	private Boolean supportCreateSpu;

	@SerializedName("spu_material_rules")
	@OpField(desc = "SPU素材规则（素材类型：主图）", example = "")
	private List<SpuMaterialRulesItem> spuMaterialRules;

	@SerializedName("spu_proof_rules")
	@OpField(desc = "证明材料规则（证明材料类型：实物图、版权页）", example = "")
	private List<SpuProofRulesItem> spuProofRules;

	@SerializedName("spu_barcode_rule")
	@OpField(desc = "条码规则", example = "")
	private SpuBarcodeRule spuBarcodeRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuPropertyRule(List<SpuPropertyRuleItem> spuPropertyRule){
		this.spuPropertyRule = spuPropertyRule;
	}

	
	public List<SpuPropertyRuleItem> getSpuPropertyRule(){
		return this.spuPropertyRule;
	}

	
	public void setSpuImagesRule(SpuImagesRule spuImagesRule){
		this.spuImagesRule = spuImagesRule;
	}

	
	public SpuImagesRule getSpuImagesRule(){
		return this.spuImagesRule;
	}

	
	public void setSpuActualImagesRule(SpuActualImagesRule spuActualImagesRule){
		this.spuActualImagesRule = spuActualImagesRule;
	}

	
	public SpuActualImagesRule getSpuActualImagesRule(){
		return this.spuActualImagesRule;
	}

	
	public void setControlType(Long controlType){
		this.controlType = controlType;
	}

	
	public Long getControlType(){
		return this.controlType;
	}

	
	public void setSupportSpuProduct(Boolean supportSpuProduct){
		this.supportSpuProduct = supportSpuProduct;
	}

	
	public Boolean getSupportSpuProduct(){
		return this.supportSpuProduct;
	}

	
	public void setSupportCreateSpu(Boolean supportCreateSpu){
		this.supportCreateSpu = supportCreateSpu;
	}

	
	public Boolean getSupportCreateSpu(){
		return this.supportCreateSpu;
	}

	
	public void setSpuMaterialRules(List<SpuMaterialRulesItem> spuMaterialRules){
		this.spuMaterialRules = spuMaterialRules;
	}

	
	public List<SpuMaterialRulesItem> getSpuMaterialRules(){
		return this.spuMaterialRules;
	}

	
	public void setSpuProofRules(List<SpuProofRulesItem> spuProofRules){
		this.spuProofRules = spuProofRules;
	}

	
	public List<SpuProofRulesItem> getSpuProofRules(){
		return this.spuProofRules;
	}

	
	public void setSpuBarcodeRule(SpuBarcodeRule spuBarcodeRule){
		this.spuBarcodeRule = spuBarcodeRule;
	}

	
	public SpuBarcodeRule getSpuBarcodeRule(){
		return this.spuBarcodeRule;
	}

}