package com.doudian.open.api.product_salesInherit_submit.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SubmitRecordsItem {


	@SerializedName("platform_id")
	@OpField(required = true , desc = "站外平台类型；1-淘宝；", example= "1")
	private Long platformId;

	@SerializedName("product_id")
	@OpField(required = true , desc = "抖店店铺商品id", example= "3592552460734101255")
	private Long productId;

	@SerializedName("outside_product_id")
	@OpField(required = true , desc = "同主体站外店铺商品id，", example= "683305596514")
	private Long outsideProductId;

	@SerializedName("submit_sales_num")
	@OpField(required = true , desc = "站外商品30天内销量；最小销量上传销量不能低于100个", example= "200")
	private Long submitSalesNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlatformId(Long platformId){
		this.platformId = platformId;
	}

	
	public Long getPlatformId(){
		return this.platformId;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setOutsideProductId(Long outsideProductId){
		this.outsideProductId = outsideProductId;
	}

	
	public Long getOutsideProductId(){
		return this.outsideProductId;
	}

	
	public void setSubmitSalesNum(Long submitSalesNum){
		this.submitSalesNum = submitSalesNum;
	}

	
	public Long getSubmitSalesNum(){
		return this.submitSalesNum;
	}

}