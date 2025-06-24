package com.doudian.open.api.order_logisticsAddMultiPack.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BundleListItem {


	@SerializedName("sub_product_id")
	@OpField(required = true , desc = "组套商品子商品ID", example= "12334122")
	private String subProductId;

	@SerializedName("sub_sku_id")
	@OpField(required = true , desc = "组套商品子商品SKU_ID", example= "1245")
	private String subSkuId;

	@SerializedName("combo_num")
	@OpField(required = true , desc = "组套商品子商品发货数量", example= "2")
	private Long comboNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSubProductId(String subProductId){
		this.subProductId = subProductId;
	}

	
	public String getSubProductId(){
		return this.subProductId;
	}

	
	public void setSubSkuId(String subSkuId){
		this.subSkuId = subSkuId;
	}

	
	public String getSubSkuId(){
		return this.subSkuId;
	}

	
	public void setComboNum(Long comboNum){
		this.comboNum = comboNum;
	}

	
	public Long getComboNum(){
		return this.comboNum;
	}

}