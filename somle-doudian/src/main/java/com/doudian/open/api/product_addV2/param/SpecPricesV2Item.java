package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class SpecPricesV2Item {


	@SerializedName("batch_stocks")
	@OpField(required = false , desc = "批次库存", example= "")
	private List<BatchStocksItem> batchStocks;

	@SerializedName("multi_time_stocks")
	@OpField(required = false , desc = "时效库存，一个sku可以配置0到多个时效库存", example= "")
	private List<MultiTimeStocksItem> multiTimeStocks;

	@SerializedName("sku_status")
	@OpField(required = false , desc = "true：表示sku上架 false：表示sku下架", example= "true")
	private Boolean skuStatus;

	@SerializedName("sku_type")
	@OpField(required = false , desc = "库存类型 0-普通库存，1-区域库存，10-阶梯库存", example= "0")
	private Long skuType;

	@SerializedName("stock_num")
	@OpField(required = false , desc = "库存数量。跨境必须走区域库存，stock_num设置0。", example= "10")
	private Long stockNum;

	@SerializedName("price")
	@OpField(required = false , desc = "价格", example= "100")
	private Long price;

	@SerializedName("code")
	@OpField(required = false , desc = "商家编码", example= "xxx")
	private String code;

	@SerializedName("step_stock_num")
	@OpField(required = false , desc = "阶梯库存数量", example= "12")
	private Long stepStockNum;

	@SerializedName("supplier_id")
	@OpField(required = false , desc = "供应商编码", example= "adb")
	private String supplierId;

	@SerializedName("out_sku_id")
	@OpField(required = false , desc = "外部skuid", example= "123")
	private Long outSkuId;

	@SerializedName("outer_sku_id")
	@OpField(required = false , desc = "外部skuid", example= "daf")
	private String outerSkuId;

	@SerializedName("customs_report_info")
	@OpField(required = false , desc = "海关申报要素", example= "")
	private CustomsReportInfo customsReportInfo;

	@SerializedName("stock_num_map")
	@OpField(required = false , desc = "仓ID -> 库存数量。跨境业务大部分都是必传，格式为：Map<商家仓ID, 库存数量>", example= "FOURPLTEST: 10")
	private Map<String,Long> stockNumMap;

	@SerializedName("package_sku")
	@OpField(required = false , desc = "组套包信息", example= "")
	private List<PackageSkuItem> packageSku;

	@SerializedName("tax_exemption_sku_info")
	@OpField(required = false , desc = "海南免税：Sku 额外信息", example= "")
	private TaxExemptionSkuInfo taxExemptionSkuInfo;

	@SerializedName("spec_value_lib_id")
	@OpField(required = false , desc = "商品规格值id：懂车帝场景传递", example= "0")
	private Long specValueLibId;

	@SerializedName("presell_delay")
	@OpField(required = false , desc = "预售天数", example= "5")
	private Long presellDelay;

	@SerializedName("barcodes")
	@OpField(required = false , desc = "条形码", example= "[]")
	private List<String> barcodes;

	@SerializedName("cargo")
	@OpField(required = false , desc = "货品信息，如果传0 0 表示解绑）", example= "")
	private Cargo cargo;

	@SerializedName("delivery_infos")
	@OpField(required = false , desc = "SKU运输信息", example= "")
	private List<DeliveryInfosItem> deliveryInfos;

	@SerializedName("supply_price")
	@OpField(required = false , desc = "供货价,单位：分，nil代表不修改，0代表清空", example= "13")
	private Long supplyPrice;

	@SerializedName("sell_properties")
	@OpField(required = true , desc = "规格信息", example= "")
	private List<SellPropertiesItem> sellProperties;

	@SerializedName("gold_process_charge")
	@OpField(required = false , desc = "黄金加工费，单位：分，nil代表不修改", example= "10")
	private Long goldProcessCharge;

	@SerializedName("sku_classification_type")
	@OpField(required = false , desc = "sku分类信息，对应枚举值main_sale_single_product - 主售款（单品）main_sale_multi_product - 主售款（多件装）main_sale_combination - 主售款（组合品）non_main_sale - 非主售款information_description - 信息说明/防拍", example= "main_sale_single_product")
	private String skuClassificationType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBatchStocks(List<BatchStocksItem> batchStocks){
		this.batchStocks = batchStocks;
	}

	
	public List<BatchStocksItem> getBatchStocks(){
		return this.batchStocks;
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

	
	public void setSkuType(Long skuType){
		this.skuType = skuType;
	}

	
	public Long getSkuType(){
		return this.skuType;
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

	
	public void setSupplierId(String supplierId){
		this.supplierId = supplierId;
	}

	
	public String getSupplierId(){
		return this.supplierId;
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

	
	public void setCustomsReportInfo(CustomsReportInfo customsReportInfo){
		this.customsReportInfo = customsReportInfo;
	}

	
	public CustomsReportInfo getCustomsReportInfo(){
		return this.customsReportInfo;
	}

	
	public void setStockNumMap(Map<String,Long> stockNumMap){
		this.stockNumMap = stockNumMap;
	}

	
	public Map<String,Long> getStockNumMap(){
		return this.stockNumMap;
	}

	
	public void setPackageSku(List<PackageSkuItem> packageSku){
		this.packageSku = packageSku;
	}

	
	public List<PackageSkuItem> getPackageSku(){
		return this.packageSku;
	}

	
	public void setTaxExemptionSkuInfo(TaxExemptionSkuInfo taxExemptionSkuInfo){
		this.taxExemptionSkuInfo = taxExemptionSkuInfo;
	}

	
	public TaxExemptionSkuInfo getTaxExemptionSkuInfo(){
		return this.taxExemptionSkuInfo;
	}

	
	public void setSpecValueLibId(Long specValueLibId){
		this.specValueLibId = specValueLibId;
	}

	
	public Long getSpecValueLibId(){
		return this.specValueLibId;
	}

	
	public void setPresellDelay(Long presellDelay){
		this.presellDelay = presellDelay;
	}

	
	public Long getPresellDelay(){
		return this.presellDelay;
	}

	
	public void setBarcodes(List<String> barcodes){
		this.barcodes = barcodes;
	}

	
	public List<String> getBarcodes(){
		return this.barcodes;
	}

	
	public void setCargo(Cargo cargo){
		this.cargo = cargo;
	}

	
	public Cargo getCargo(){
		return this.cargo;
	}

	
	public void setDeliveryInfos(List<DeliveryInfosItem> deliveryInfos){
		this.deliveryInfos = deliveryInfos;
	}

	
	public List<DeliveryInfosItem> getDeliveryInfos(){
		return this.deliveryInfos;
	}

	
	public void setSupplyPrice(Long supplyPrice){
		this.supplyPrice = supplyPrice;
	}

	
	public Long getSupplyPrice(){
		return this.supplyPrice;
	}

	
	public void setSellProperties(List<SellPropertiesItem> sellProperties){
		this.sellProperties = sellProperties;
	}

	
	public List<SellPropertiesItem> getSellProperties(){
		return this.sellProperties;
	}

	
	public void setGoldProcessCharge(Long goldProcessCharge){
		this.goldProcessCharge = goldProcessCharge;
	}

	
	public Long getGoldProcessCharge(){
		return this.goldProcessCharge;
	}

	
	public void setSkuClassificationType(String skuClassificationType){
		this.skuClassificationType = skuClassificationType;
	}

	
	public String getSkuClassificationType(){
		return this.skuClassificationType;
	}

}