package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class SpecPricesItem {


	@SerializedName("barcodes")
	@OpField(desc = "条形码", example = "111111")
	private List<String> barcodes;

	@SerializedName("multi_time_stocks")
	@OpField(desc = "时效库存", example = "")
	private List<MultiTimeStocksItem> multiTimeStocks;

	@SerializedName("sku_status")
	@OpField(desc = "sku状态 true上架 false下架", example = "true")
	private Boolean skuStatus;

	@SerializedName("sku_classification_type")
	@OpField(desc = "sku分类信息", example = "main_sale_single_product")
	private String skuClassificationType;

	@SerializedName("sell_properties")
	@OpField(desc = "sku对应的销售属性信息", example = "")
	private List<SellPropertiesItem> sellProperties;

	@SerializedName("cargo_info")
	@OpField(desc = "货品信息（国内）", example = "")
	private CargoInfo cargoInfo;

	@SerializedName("gold_process_charge")
	@OpField(desc = "Sku的黄金加工费，单位：分", example = "12300")
	private Long goldProcessCharge;

	@SerializedName("sku_id")
	@OpField(desc = "规格id；抖店系统生成，商品id下唯一。", example = "1737398770243598")
	private Long skuId;

	@SerializedName("out_sku_id")
	@OpField(desc = "外部商家skui_id编码，商家自定义字段；推荐使用outer_sku_id字段", example = "0")
	private Long outSkuId;

	@SerializedName("outer_sku_id")
	@OpField(desc = "外部商家skui_id编码，商家自定义字段", example = "dy001-1")
	private String outerSkuId;

	@SerializedName("spec_detail_ids")
	@OpField(desc = "规格id列表,多规格以”,“分隔；", example = "[1695459998494734,1695459998494766]")
	private List<Long> specDetailIds;

	@SerializedName("stock_num")
	@OpField(desc = "可售库存；当前现货可售库存；", example = "13")
	private Long stockNum;

	@SerializedName("price")
	@OpField(desc = "商品价格；单位：分", example = "102")
	private Long price;

	@SerializedName("code")
	@OpField(desc = "编码", example = "aaa")
	private String code;

	@SerializedName("step_stock_num")
	@OpField(desc = "阶梯库存，规则详见名称解释：https://op.jinritemai.com/docs/guide-docs/202/170", example = "0")
	private Long stepStockNum;

	@SerializedName("prom_stock_num")
	@OpField(desc = "活动库存，，规则详见名称解释：https://op.jinritemai.com/docs/guide-docs/202/170", example = "0")
	private Long promStockNum;

	@SerializedName("prom_step_stock_num")
	@OpField(desc = "活动阶梯库存，，规则详见名称解释：https://op.jinritemai.com/docs/guide-docs/202/170", example = "0")
	private Long promStepStockNum;

	@SerializedName("spec_detail_id1")
	@OpField(desc = "【已废弃，无需使用】规格ID", example = "1695459998494734")
	private Long specDetailId1;

	@SerializedName("spec_detail_id2")
	@OpField(desc = "【已废弃，无需使用】规格ID", example = "1695459998494734")
	private Long specDetailId2;

	@SerializedName("spec_detail_id3")
	@OpField(desc = "【已废弃，无需使用】规格ID", example = "0")
	private Long specDetailId3;

	@SerializedName("sku_type")
	@OpField(desc = "sku类型；0-普通库存  1-区域库存  10-阶梯库存", example = "0")
	private Long skuType;

	@SerializedName("supplier_id")
	@OpField(desc = "供应商编码", example = "123")
	private String supplierId;

	@SerializedName("promotion_stock_num")
	@OpField(desc = "活动现货库存", example = "0")
	private Long promotionStockNum;

	@SerializedName("promotion_step_stock_num")
	@OpField(desc = "活动阶梯库存", example = "0")
	private Long promotionStepStockNum;

	@SerializedName("customs_report_info")
	@OpField(desc = "海关申报要素（仅海淘商品返回信息）", example = "")
	private CustomsReportInfo customsReportInfo;

	@SerializedName("lock_stock_num")
	@OpField(desc = "现货订单锁定库存", example = "1")
	private Long lockStockNum;

	@SerializedName("lock_step_stock_num")
	@OpField(desc = "阶梯订单锁定库存", example = "1")
	private Long lockStepStockNum;

	@SerializedName("stock_num_map")
	@OpField(desc = "仓ID->库存映射", example = "{   1: 10}")
	private Map<String,Long> stockNumMap;

	@SerializedName("tax_exemption_sku_info")
	@OpField(desc = "海南免税sku信息（仅海淘商品返回信息）", example = "")
	private TaxExemptionSkuInfo taxExemptionSkuInfo;

	@SerializedName("presell_delay")
	@OpField(desc = "发货时间（全款预售模式时的发货时间/阶梯模式下阶梯发货时间），9999是当日发、1次日发、2 是48小时发、5、15、45天等。发货时间规则可使用【product/getProductUpdateRule】获取", example = "5")
	private Long presellDelay;

	@SerializedName("delivery_infos")
	@OpField(desc = "SKU物流信息", example = "")
	private List<DeliveryInfosItem> deliveryInfos;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBarcodes(List<String> barcodes){
		this.barcodes = barcodes;
	}

	
	public List<String> getBarcodes(){
		return this.barcodes;
	}

	
	public void setMultiTimeStocks(List<MultiTimeStocksItem> multiTimeStocks){
		this.multiTimeStocks = multiTimeStocks;
	}

	
	public List<MultiTimeStocksItem> getMultiTimeStocks(){
		return this.multiTimeStocks;
	}

	
	public void setSkuStatus(Boolean skuStatus){
		this.skuStatus = skuStatus;
	}

	
	public Boolean getSkuStatus(){
		return this.skuStatus;
	}

	
	public void setSkuClassificationType(String skuClassificationType){
		this.skuClassificationType = skuClassificationType;
	}

	
	public String getSkuClassificationType(){
		return this.skuClassificationType;
	}

	
	public void setSellProperties(List<SellPropertiesItem> sellProperties){
		this.sellProperties = sellProperties;
	}

	
	public List<SellPropertiesItem> getSellProperties(){
		return this.sellProperties;
	}

	
	public void setCargoInfo(CargoInfo cargoInfo){
		this.cargoInfo = cargoInfo;
	}

	
	public CargoInfo getCargoInfo(){
		return this.cargoInfo;
	}

	
	public void setGoldProcessCharge(Long goldProcessCharge){
		this.goldProcessCharge = goldProcessCharge;
	}

	
	public Long getGoldProcessCharge(){
		return this.goldProcessCharge;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setOutSkuId(Long outSkuId){
		this.outSkuId = outSkuId;
	}

	
	public Long getOutSkuId(){
		return this.outSkuId;
	}

	
	public void setOuterSkuId(String outerSkuId){
		this.outerSkuId = outerSkuId;
	}

	
	public String getOuterSkuId(){
		return this.outerSkuId;
	}

	
	public void setSpecDetailIds(List<Long> specDetailIds){
		this.specDetailIds = specDetailIds;
	}

	
	public List<Long> getSpecDetailIds(){
		return this.specDetailIds;
	}

	
	public void setStockNum(Long stockNum){
		this.stockNum = stockNum;
	}

	
	public Long getStockNum(){
		return this.stockNum;
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setStepStockNum(Long stepStockNum){
		this.stepStockNum = stepStockNum;
	}

	
	public Long getStepStockNum(){
		return this.stepStockNum;
	}

	
	public void setPromStockNum(Long promStockNum){
		this.promStockNum = promStockNum;
	}

	
	public Long getPromStockNum(){
		return this.promStockNum;
	}

	
	public void setPromStepStockNum(Long promStepStockNum){
		this.promStepStockNum = promStepStockNum;
	}

	
	public Long getPromStepStockNum(){
		return this.promStepStockNum;
	}

	
	public void setSpecDetailId1(Long specDetailId1){
		this.specDetailId1 = specDetailId1;
	}

	
	public Long getSpecDetailId1(){
		return this.specDetailId1;
	}

	
	public void setSpecDetailId2(Long specDetailId2){
		this.specDetailId2 = specDetailId2;
	}

	
	public Long getSpecDetailId2(){
		return this.specDetailId2;
	}

	
	public void setSpecDetailId3(Long specDetailId3){
		this.specDetailId3 = specDetailId3;
	}

	
	public Long getSpecDetailId3(){
		return this.specDetailId3;
	}

	
	public void setSkuType(Long skuType){
		this.skuType = skuType;
	}

	
	public Long getSkuType(){
		return this.skuType;
	}

	
	public void setSupplierId(String supplierId){
		this.supplierId = supplierId;
	}

	
	public String getSupplierId(){
		return this.supplierId;
	}

	
	public void setPromotionStockNum(Long promotionStockNum){
		this.promotionStockNum = promotionStockNum;
	}

	
	public Long getPromotionStockNum(){
		return this.promotionStockNum;
	}

	
	public void setPromotionStepStockNum(Long promotionStepStockNum){
		this.promotionStepStockNum = promotionStepStockNum;
	}

	
	public Long getPromotionStepStockNum(){
		return this.promotionStepStockNum;
	}

	
	public void setCustomsReportInfo(CustomsReportInfo customsReportInfo){
		this.customsReportInfo = customsReportInfo;
	}

	
	public CustomsReportInfo getCustomsReportInfo(){
		return this.customsReportInfo;
	}

	
	public void setLockStockNum(Long lockStockNum){
		this.lockStockNum = lockStockNum;
	}

	
	public Long getLockStockNum(){
		return this.lockStockNum;
	}

	
	public void setLockStepStockNum(Long lockStepStockNum){
		this.lockStepStockNum = lockStepStockNum;
	}

	
	public Long getLockStepStockNum(){
		return this.lockStepStockNum;
	}

	
	public void setStockNumMap(Map<String,Long> stockNumMap){
		this.stockNumMap = stockNumMap;
	}

	
	public Map<String,Long> getStockNumMap(){
		return this.stockNumMap;
	}

	
	public void setTaxExemptionSkuInfo(TaxExemptionSkuInfo taxExemptionSkuInfo){
		this.taxExemptionSkuInfo = taxExemptionSkuInfo;
	}

	
	public TaxExemptionSkuInfo getTaxExemptionSkuInfo(){
		return this.taxExemptionSkuInfo;
	}

	
	public void setPresellDelay(Long presellDelay){
		this.presellDelay = presellDelay;
	}

	
	public Long getPresellDelay(){
		return this.presellDelay;
	}

	
	public void setDeliveryInfos(List<DeliveryInfosItem> deliveryInfos){
		this.deliveryInfos = deliveryInfos;
	}

	
	public List<DeliveryInfosItem> getDeliveryInfos(){
		return this.deliveryInfos;
	}

}