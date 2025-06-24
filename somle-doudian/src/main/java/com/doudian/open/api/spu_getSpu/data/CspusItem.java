package com.doudian.open.api.spu_getSpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CspusItem {


	@SerializedName("cspu_id")
	@OpField(desc = "CSPU ID", example = "7120712207235555563")
	private Long cspuId;

	@SerializedName("spu_id")
	@OpField(desc = "SPU ID", example = "7120712486076088620")
	private Long spuId;

	@SerializedName("sale_properties")
	@OpField(desc = "销售属性", example = "")
	private List<SalePropertiesItem> saleProperties;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCspuId(Long cspuId){
		this.cspuId = cspuId;
	}

	
	public Long getCspuId(){
		return this.cspuId;
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

	
	public void setSaleProperties(List<SalePropertiesItem> saleProperties){
		this.saleProperties = saleProperties;
	}

	
	public List<SalePropertiesItem> getSaleProperties(){
		return this.saleProperties;
	}

}