package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class RelatedOrderInfoItem {


	@SerializedName("delivery_infos")
	@OpField(desc = "称重品信息", example = "")
	private List<DeliveryInfosItem> deliveryInfos;

	@SerializedName("sku_order_id")
	@OpField(desc = "商品单信息", example = "4821780700279174718")
	private String skuOrderId;

	@SerializedName("order_status")
	@OpField(desc = "订单状态，枚举为2(未发货),3(已发货),5(已收货或已完成),255(已完成)", example = "3")
	private Long orderStatus;

	@SerializedName("pay_amount")
	@OpField(desc = "付款金额", example = "20")
	private Long payAmount;

	@SerializedName("post_amount")
	@OpField(desc = "付运费金额", example = "0")
	private Long postAmount;

	@SerializedName("item_num")
	@OpField(desc = "购买数量", example = "1")
	private Long itemNum;

	@SerializedName("create_time")
	@OpField(desc = "下单时间", example = "1626753467")
	private Long createTime;

	@SerializedName("tax_amount")
	@OpField(desc = "税费", example = "0")
	private Long taxAmount;

	@SerializedName("is_oversea_order")
	@OpField(desc = "是否为海外订单", example = "0")
	private Long isOverseaOrder;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "小兔子T恤")
	private String productName;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "9999888777666")
	private Long productId;

	@SerializedName("product_image")
	@OpField(desc = "商品图片", example = "https://bytedance.com/image/rabbit.jpg")
	private String productImage;

	@SerializedName("tags")
	@OpField(desc = "订单标签；标签在平台侧会有更新，标签仅做展示使用，请勿作为系统判断依赖。", example = "")
	private List<TagsItem> tags;

	@SerializedName("sku_spec")
	@OpField(desc = "商品规格", example = "")
	private List<SkuSpecItem> skuSpec;

	@SerializedName("shop_sku_code")
	@OpField(desc = "商家SKU编码", example = "")
	private String shopSkuCode;

	@SerializedName("logistics_code")
	@OpField(desc = "发货物流编码", example = "RABBIT123123")
	private String logisticsCode;

	@SerializedName("aftersale_pay_amount")
	@OpField(desc = "售后退款金额", example = "20")
	private Long aftersalePayAmount;

	@SerializedName("aftersale_post_amount")
	@OpField(desc = "售后退运费金额", example = "0")
	private Long aftersalePostAmount;

	@SerializedName("aftersale_tax_amount")
	@OpField(desc = "售后退税费金额", example = "0")
	private Long aftersaleTaxAmount;

	@SerializedName("aftersale_item_num")
	@OpField(desc = "售后商品数量", example = "1")
	private Long aftersaleItemNum;

	@SerializedName("promotion_pay_amount")
	@OpField(desc = "优惠券金额", example = "0")
	private Long promotionPayAmount;

	@SerializedName("price")
	@OpField(desc = "价格", example = "20")
	private Long price;

	@SerializedName("logistics_company_name")
	@OpField(desc = "【已废弃】正向物流公司名称,替代字段：aftersale_info.order_logistics.company_name字段", example = "顺丰速运")
	private String logisticsCompanyName;

	@SerializedName("given_sku_order_ids")
	@OpField(desc = "赠品订单id", example = "4863025593329976686")
	private List<String> givenSkuOrderIds;


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

	
	public void setSkuOrderId(String skuOrderId){
		this.skuOrderId = skuOrderId;
	}

	
	public String getSkuOrderId(){
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

	
	public void setItemNum(Long itemNum){
		this.itemNum = itemNum;
	}

	
	public Long getItemNum(){
		return this.itemNum;
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

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setAftersalePayAmount(Long aftersalePayAmount){
		this.aftersalePayAmount = aftersalePayAmount;
	}

	
	public Long getAftersalePayAmount(){
		return this.aftersalePayAmount;
	}

	
	public void setAftersalePostAmount(Long aftersalePostAmount){
		this.aftersalePostAmount = aftersalePostAmount;
	}

	
	public Long getAftersalePostAmount(){
		return this.aftersalePostAmount;
	}

	
	public void setAftersaleTaxAmount(Long aftersaleTaxAmount){
		this.aftersaleTaxAmount = aftersaleTaxAmount;
	}

	
	public Long getAftersaleTaxAmount(){
		return this.aftersaleTaxAmount;
	}

	
	public void setAftersaleItemNum(Long aftersaleItemNum){
		this.aftersaleItemNum = aftersaleItemNum;
	}

	
	public Long getAftersaleItemNum(){
		return this.aftersaleItemNum;
	}

	
	public void setPromotionPayAmount(Long promotionPayAmount){
		this.promotionPayAmount = promotionPayAmount;
	}

	
	public Long getPromotionPayAmount(){
		return this.promotionPayAmount;
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setLogisticsCompanyName(String logisticsCompanyName){
		this.logisticsCompanyName = logisticsCompanyName;
	}

	
	public String getLogisticsCompanyName(){
		return this.logisticsCompanyName;
	}

	
	public void setGivenSkuOrderIds(List<String> givenSkuOrderIds){
		this.givenSkuOrderIds = givenSkuOrderIds;
	}

	
	public List<String> getGivenSkuOrderIds(){
		return this.givenSkuOrderIds;
	}

}