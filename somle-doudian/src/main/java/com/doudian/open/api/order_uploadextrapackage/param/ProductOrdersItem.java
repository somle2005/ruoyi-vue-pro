package com.doudian.open.api.order_uploadextrapackage.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductOrdersItem {


	@SerializedName("bundle_product_list")
	@OpField(required = false , desc = "组合商品信息列表", example= "")
	private List<BundleProductListItem> bundleProductList;

	@SerializedName("product_count")
	@OpField(required = false , desc = "选填。如果是组合商品，该字段为空，即使传递也不会被采用；如果是非组合商品，该字段必填，为大于0的整数。", example= "1")
	private Long productCount;

	@SerializedName("product_order_id")
	@OpField(required = true , desc = "商品单单号", example= "6919571420622558781")
	private String productOrderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBundleProductList(List<BundleProductListItem> bundleProductList){
		this.bundleProductList = bundleProductList;
	}

	
	public List<BundleProductListItem> getBundleProductList(){
		return this.bundleProductList;
	}

	
	public void setProductCount(Long productCount){
		this.productCount = productCount;
	}

	
	public Long getProductCount(){
		return this.productCount;
	}

	
	public void setProductOrderId(String productOrderId){
		this.productOrderId = productOrderId;
	}

	
	public String getProductOrderId(){
		return this.productOrderId;
	}

}