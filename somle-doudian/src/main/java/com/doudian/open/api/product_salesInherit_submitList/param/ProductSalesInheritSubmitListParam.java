package com.doudian.open.api.product_salesInherit_submitList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductSalesInheritSubmitListParam {


	@SerializedName("product_ids")
	@OpField(required = false , desc = "抖店店铺商品id列表,最大支持50条；", example= "[3592552460734101255,3592552460734101255]")
	private List<Long> productIds;

	@SerializedName("outside_product_ids")
	@OpField(required = false , desc = "站外商品id列表（与站内商品id条件取）；最大支持50条；", example= "[683305596514,683305596514]]")
	private List<Long> outsideProductIds;

	@SerializedName("page")
	@OpField(required = true , desc = "分页参数", example= "")
	private Page page;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductIds(List<Long> productIds){
		this.productIds = productIds;
	}

	
	public List<Long> getProductIds(){
		return this.productIds;
	}

	
	public void setOutsideProductIds(List<Long> outsideProductIds){
		this.outsideProductIds = outsideProductIds;
	}

	
	public List<Long> getOutsideProductIds(){
		return this.outsideProductIds;
	}

	
	public void setPage(Page page){
		this.page = page;
	}

	
	public Page getPage(){
		return this.page;
	}

}