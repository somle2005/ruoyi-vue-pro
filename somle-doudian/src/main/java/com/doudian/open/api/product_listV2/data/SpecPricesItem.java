package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpecPricesItem {


	@SerializedName("id")
	@OpField(desc = "skuId", example = "略")
	private Long id;

	@SerializedName("code")
	@OpField(desc = "skuCode", example = "略")
	private String code;

	@SerializedName("barcodes")
	@OpField(desc = "SKU Barcode", example = "略")
	private List<String> barcodes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setBarcodes(List<String> barcodes){
		this.barcodes = barcodes;
	}

	
	public List<String> getBarcodes(){
		return this.barcodes;
	}

}