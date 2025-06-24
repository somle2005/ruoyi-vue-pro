package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class GovSubsidyDetail {


	@SerializedName("supplier_shop_name")
	@OpField(desc = "实际销售公司", example = "abc 公司")
	private String supplierShopName;

	@SerializedName("supplier_shop_id")
	@OpField(desc = "实际销售公司 ID", example = "12345")
	private String supplierShopId;

	@SerializedName("product_tag")
	@OpField(desc = "government_subsidy_multis:一品多地订单", example = "government_subsidy_multis")
	private String productTag;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSupplierShopName(String supplierShopName){
		this.supplierShopName = supplierShopName;
	}

	
	public String getSupplierShopName(){
		return this.supplierShopName;
	}

	
	public void setSupplierShopId(String supplierShopId){
		this.supplierShopId = supplierShopId;
	}

	
	public String getSupplierShopId(){
		return this.supplierShopId;
	}

	
	public void setProductTag(String productTag){
		this.productTag = productTag;
	}

	
	public String getProductTag(){
		return this.productTag;
	}

}