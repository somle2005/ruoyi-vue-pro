package com.doudian.open.api.product_salesInherit_submit.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductSalesInheritSubmitData {


	@SerializedName("success_product_ids")
	@OpField(desc = "提报成功站内商品id列表", example = "3592552460734101255")
	private List<Long> successProductIds;

	@SerializedName("failed_product_list")
	@OpField(desc = "提报失败商品列表", example = "")
	private List<FailedProductListItem> failedProductList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccessProductIds(List<Long> successProductIds){
		this.successProductIds = successProductIds;
	}

	
	public List<Long> getSuccessProductIds(){
		return this.successProductIds;
	}

	
	public void setFailedProductList(List<FailedProductListItem> failedProductList){
		this.failedProductList = failedProductList;
	}

	
	public List<FailedProductListItem> getFailedProductList(){
		return this.failedProductList;
	}

}