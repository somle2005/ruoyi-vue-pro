package com.doudian.open.api.spu_getSpuRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuProofRulesItem {


	@SerializedName("proof_type")
	@OpField(desc = "实物证明类型，枚举值：2-实物图、3-说明书图片、4-说明书PDF、5-医疗器械注册证、6-版权页。其中说明书PDF和说明书图片要求二者必填其一", example = "6")
	private Integer proofType;

	@SerializedName("proof_rule")
	@OpField(desc = "SPU证明材料的具体规则", example = "")
	private ProofRule proofRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProofType(Integer proofType){
		this.proofType = proofType;
	}

	
	public Integer getProofType(){
		return this.proofType;
	}

	
	public void setProofRule(ProofRule proofRule){
		this.proofRule = proofRule;
	}

	
	public ProofRule getProofRule(){
		return this.proofRule;
	}

}