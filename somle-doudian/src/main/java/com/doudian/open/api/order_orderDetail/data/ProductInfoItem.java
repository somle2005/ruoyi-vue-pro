package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductInfoItem {


	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "苹果")
	private String productName;

	@SerializedName("price")
	@OpField(desc = "商品价格", example = "1000")
	private Long price;

	@SerializedName("outer_sku_id")
	@OpField(desc = "商家编码", example = "sdfa")
	private String outerSkuId;

	@SerializedName("sku_id")
	@OpField(desc = "商品skuId", example = "3254535")
	private Long skuId;

	@SerializedName("sku_specs")
	@OpField(desc = "规格信息", example = "")
	private List<SkuSpecsItem> skuSpecs;

	@SerializedName("product_count")
	@OpField(desc = "发货商品数量", example = "2")
	private Long productCount;

	@SerializedName("product_id")
	@OpField(desc = "商品ID，字符串类型", example = "3473196049974326153")
	private Long productId;

	@SerializedName("sku_order_id")
	@OpField(desc = "店铺子订单号，抖店平台生成，平台下唯一；注意：一笔订单下有一个子订单和父订单单号相同。", example = "4781320682406083640")
	private String skuOrderId;

	@SerializedName("product_id_str")
	@OpField(desc = "商品ID，字符串类型", example = "3473196049974326153")
	private String productIdStr;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setOuterSkuId(String outerSkuId){
		this.outerSkuId = outerSkuId;
	}

	
	public String getOuterSkuId(){
		return this.outerSkuId;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setSkuSpecs(List<SkuSpecsItem> skuSpecs){
		this.skuSpecs = skuSpecs;
	}

	
	public List<SkuSpecsItem> getSkuSpecs(){
		return this.skuSpecs;
	}

	
	public void setProductCount(Long productCount){
		this.productCount = productCount;
	}

	
	public Long getProductCount(){
		return this.productCount;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setSkuOrderId(String skuOrderId){
		this.skuOrderId = skuOrderId;
	}

	
	public String getSkuOrderId(){
		return this.skuOrderId;
	}

	
	public void setProductIdStr(String productIdStr){
		this.productIdStr = productIdStr;
	}

	
	public String getProductIdStr(){
		return this.productIdStr;
	}

}