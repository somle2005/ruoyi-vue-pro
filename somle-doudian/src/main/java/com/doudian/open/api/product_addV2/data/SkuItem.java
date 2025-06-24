package com.doudian.open.api.product_addV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuItem {


	@SerializedName("sku_id")
	@OpField(desc = "sku_id", example = "1")
	private Long skuId;

	@SerializedName("out_sku_id")
	@OpField(desc = "外部sku id", example = "1")
	private Long outSkuId;

	@SerializedName("outer_sku_id")
	@OpField(desc = "字符串形式外部sku id", example = "1")
	private String outerSkuId;

	@SerializedName("code")
	@OpField(desc = "sku code", example = "1")
	private String code;

	@SerializedName("spec_detail_id1")
	@OpField(desc = "子规格id", example = "1")
	private Long specDetailId1;

	@SerializedName("spec_detail_id2")
	@OpField(desc = "子规格id", example = "1")
	private Long specDetailId2;

	@SerializedName("spec_detail_id3")
	@OpField(desc = "子规格id", example = "1")
	private Long specDetailId3;

	@SerializedName("spec_detail_ids")
	@OpField(desc = "所有的规格值id，代替spec_detail_id123", example = "[111,222,333]")
	private List<Long> specDetailIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setOutSkuId(Long outSkuId){
		this.outSkuId = outSkuId;
	}

	
	public Long getOutSkuId(){
		return this.outSkuId;
	}

	
	public void setOuterSkuId(String outerSkuId){
		this.outerSkuId = outerSkuId;
	}

	
	public String getOuterSkuId(){
		return this.outerSkuId;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setSpecDetailId1(Long specDetailId1){
		this.specDetailId1 = specDetailId1;
	}

	
	public Long getSpecDetailId1(){
		return this.specDetailId1;
	}

	
	public void setSpecDetailId2(Long specDetailId2){
		this.specDetailId2 = specDetailId2;
	}

	
	public Long getSpecDetailId2(){
		return this.specDetailId2;
	}

	
	public void setSpecDetailId3(Long specDetailId3){
		this.specDetailId3 = specDetailId3;
	}

	
	public Long getSpecDetailId3(){
		return this.specDetailId3;
	}

	
	public void setSpecDetailIds(List<Long> specDetailIds){
		this.specDetailIds = specDetailIds;
	}

	
	public List<Long> getSpecDetailIds(){
		return this.specDetailIds;
	}

}