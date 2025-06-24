package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuOrderInfosItem {


	@SerializedName("delivery_infos")
	@OpField(desc = "称重品信息", example = "")
	private List<DeliveryInfosItem> deliveryInfos;

	@SerializedName("order_pkg_type")
	@OpField(desc = "仅即时零售使用, 判断是否是小时达, 次日达", example = "1")
	private String orderPkgType;

	@SerializedName("custom_property_list")
	@OpField(desc = "商品属性，适用于外卖或即时零售场景下商品存在属性的情况", example = "")
	private List<CustomPropertyListItem> customPropertyList;

	@SerializedName("sku_order_id")
	@OpField(desc = "sku单ID", example = "12345")
	private Long skuOrderId;

	@SerializedName("order_status")
	@OpField(desc = "订单状态", example = "4:订单取消")
	private Long orderStatus;

	@SerializedName("pay_amount")
	@OpField(desc = "买家实付金额（分）", example = "1000")
	private Long payAmount;

	@SerializedName("post_amount")
	@OpField(desc = "买家购买运费（分）", example = "100")
	private Long postAmount;

	@SerializedName("item_quantity")
	@OpField(desc = "订单件数", example = "1")
	private Long itemQuantity;

	@SerializedName("create_time")
	@OpField(desc = "订单创建时间", example = "1735660800")
	private Long createTime;

	@SerializedName("tax_amount")
	@OpField(desc = "购买税费（分）", example = "100")
	private Long taxAmount;

	@SerializedName("is_oversea_order")
	@OpField(desc = "是否为跨境业务", example = "0：不是 1：是")
	private Long isOverseaOrder;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "耐克球鞋")
	private String productName;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "12345")
	private Long productId;

	@SerializedName("product_image")
	@OpField(desc = "商品图片", example = "商品图片链接")
	private String productImage;

	@SerializedName("tags")
	@OpField(desc = "商品标签", example = "")
	private List<TagsItem> tags;

	@SerializedName("sku_spec")
	@OpField(desc = "商品规格信息", example = "")
	private List<SkuSpecItem> skuSpec;

	@SerializedName("shop_sku_code")
	@OpField(desc = "商家sku自定义编码", example = "12345")
	private String shopSkuCode;

	@SerializedName("sku_id")
	@OpField(desc = "skuID", example = "12345")
	private Long skuId;

	@SerializedName("item_sum_amount")
	@OpField(desc = "sku商品总原价（不含优惠）", example = "1000")
	private Long itemSumAmount;

	@SerializedName("sku_pay_amount")
	@OpField(desc = "商品实际支付金额", example = "900")
	private Long skuPayAmount;

	@SerializedName("promotion_amount")
	@OpField(desc = "优惠总金额", example = "100")
	private Long promotionAmount;

	@SerializedName("pay_type")
	@OpField(desc = "支付方式", example = "0 : 货到付款 1：在线支付")
	private Long payType;

	@SerializedName("insurance_tags")
	@OpField(desc = "保险及其状态", example = "")
	private List<InsuranceTagsItem> insuranceTags;

	@SerializedName("after_sale_item_count")
	@OpField(desc = "商品单对应的售后数量", example = "1")
	private Long afterSaleItemCount;

	@SerializedName("given_sku_details")
	@OpField(desc = "赠品信息", example = "")
	private List<GivenSkuDetailsItem> givenSkuDetails;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDeliveryInfos(List<DeliveryInfosItem> deliveryInfos){
		this.deliveryInfos = deliveryInfos;
	}

	
	public List<DeliveryInfosItem> getDeliveryInfos(){
		return this.deliveryInfos;
	}

	
	public void setOrderPkgType(String orderPkgType){
		this.orderPkgType = orderPkgType;
	}

	
	public String getOrderPkgType(){
		return this.orderPkgType;
	}

	
	public void setCustomPropertyList(List<CustomPropertyListItem> customPropertyList){
		this.customPropertyList = customPropertyList;
	}

	
	public List<CustomPropertyListItem> getCustomPropertyList(){
		return this.customPropertyList;
	}

	
	public void setSkuOrderId(Long skuOrderId){
		this.skuOrderId = skuOrderId;
	}

	
	public Long getSkuOrderId(){
		return this.skuOrderId;
	}

	
	public void setOrderStatus(Long orderStatus){
		this.orderStatus = orderStatus;
	}

	
	public Long getOrderStatus(){
		return this.orderStatus;
	}

	
	public void setPayAmount(Long payAmount){
		this.payAmount = payAmount;
	}

	
	public Long getPayAmount(){
		return this.payAmount;
	}

	
	public void setPostAmount(Long postAmount){
		this.postAmount = postAmount;
	}

	
	public Long getPostAmount(){
		return this.postAmount;
	}

	
	public void setItemQuantity(Long itemQuantity){
		this.itemQuantity = itemQuantity;
	}

	
	public Long getItemQuantity(){
		return this.itemQuantity;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setTaxAmount(Long taxAmount){
		this.taxAmount = taxAmount;
	}

	
	public Long getTaxAmount(){
		return this.taxAmount;
	}

	
	public void setIsOverseaOrder(Long isOverseaOrder){
		this.isOverseaOrder = isOverseaOrder;
	}

	
	public Long getIsOverseaOrder(){
		return this.isOverseaOrder;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setProductImage(String productImage){
		this.productImage = productImage;
	}

	
	public String getProductImage(){
		return this.productImage;
	}

	
	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	
	public List<TagsItem> getTags(){
		return this.tags;
	}

	
	public void setSkuSpec(List<SkuSpecItem> skuSpec){
		this.skuSpec = skuSpec;
	}

	
	public List<SkuSpecItem> getSkuSpec(){
		return this.skuSpec;
	}

	
	public void setShopSkuCode(String shopSkuCode){
		this.shopSkuCode = shopSkuCode;
	}

	
	public String getShopSkuCode(){
		return this.shopSkuCode;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setItemSumAmount(Long itemSumAmount){
		this.itemSumAmount = itemSumAmount;
	}

	
	public Long getItemSumAmount(){
		return this.itemSumAmount;
	}

	
	public void setSkuPayAmount(Long skuPayAmount){
		this.skuPayAmount = skuPayAmount;
	}

	
	public Long getSkuPayAmount(){
		return this.skuPayAmount;
	}

	
	public void setPromotionAmount(Long promotionAmount){
		this.promotionAmount = promotionAmount;
	}

	
	public Long getPromotionAmount(){
		return this.promotionAmount;
	}

	
	public void setPayType(Long payType){
		this.payType = payType;
	}

	
	public Long getPayType(){
		return this.payType;
	}

	
	public void setInsuranceTags(List<InsuranceTagsItem> insuranceTags){
		this.insuranceTags = insuranceTags;
	}

	
	public List<InsuranceTagsItem> getInsuranceTags(){
		return this.insuranceTags;
	}

	
	public void setAfterSaleItemCount(Long afterSaleItemCount){
		this.afterSaleItemCount = afterSaleItemCount;
	}

	
	public Long getAfterSaleItemCount(){
		return this.afterSaleItemCount;
	}

	
	public void setGivenSkuDetails(List<GivenSkuDetailsItem> givenSkuDetails){
		this.givenSkuDetails = givenSkuDetails;
	}

	
	public List<GivenSkuDetailsItem> getGivenSkuDetails(){
		return this.givenSkuDetails;
	}

}