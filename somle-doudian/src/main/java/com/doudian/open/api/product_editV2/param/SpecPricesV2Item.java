package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class SpecPricesV2Item {


	@SerializedName("multi_time_stocks")
	@OpField(required = false , desc = "时效库存", example= "")
	private List<MultiTimeStocksItem> multiTimeStocks;

	@SerializedName("sku_status")
	@OpField(required = false , desc = "true：表示sku上架 false：表示sku下架", example= "true")
	private Boolean skuStatus;

	@SerializedName("sku_classification_type")
	@OpField(required = false , desc = "sku分类信息，对应枚举值main_sale_single_product - 主售款（单品）main_sale_multi_product - 主售款（多件装）main_sale_combination - 主售款（组合品）non_main_sale - 非主售款information_description - 信息说明/防拍", example= "main_sale_single_product")
	private String skuClassificationType;

	@SerializedName("package_sku")
	@OpField(required = false , desc = "组套包信息", example= "")
	private List<PackageSkuItem> packageSku;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "skuId,支持基于skuId修改sku信息", example= "1")
	private Long skuId;

	@SerializedName("gold_process_charge")
	@OpField(required = false , desc = "黄金加工费，单位：分，nil代表不修改", example= "1")
	private Long goldProcessCharge;

	@SerializedName("sell_properties")
	@OpField(required = true , desc = "sku规格信息：规格项规格值", example= "")
	private List<SellPropertiesItem> sellProperties;

	@SerializedName("supply_price")
	@OpField(required = false , desc = "供货价,单位：分，nil代表不修改，0代表清空", example= "nil")
	private Long supplyPrice;

	@SerializedName("delivery_infos")
	@OpField(required = false , desc = "SKU运输信息", example= "")
	private List<DeliveryInfosItem> deliveryInfos;

	@SerializedName("cargo")
	@OpField(required = false , desc = "货品信息，如果传0 0 表示解绑）", example= "")
	private Cargo cargo;

	@SerializedName("barcodes")
	@OpField(required = false , desc = "条码信息", example= "[12]")
	private List<String> barcodes;

	@SerializedName("presell_delay")
	@OpField(required = false , desc = "SKU维度预售发货延迟时间", example= "1")
	private Long presellDelay;

	@SerializedName("spec_value_lib_id")
	@OpField(required = false , desc = "商品规格值id：懂车帝场景传递", example= "1")
	private Long specValueLibId;

	@SerializedName("tax_exemption_sku_info")
	@OpField(required = false , desc = "海南免税：Sku 额外信息", example= "")
	private TaxExemptionSkuInfo taxExemptionSkuInfo;

	@SerializedName("stock_num_map")
	@OpField(required = false , desc = "仓ID -> 库存数量", example= "FOURPLTEST: 10")
	private Map<String,Long> stockNumMap;

	@SerializedName("sku_type")
	@OpField(required = false , desc = "库存类型 0-普通库存，1-区域库存，10-阶梯库存", example= "0")
	private Long skuType;

	@SerializedName("customs_report_info")
	@OpField(required = false , desc = "海关申报要素", example= "")
	private CustomsReportInfo customsReportInfo;

	@SerializedName("outer_sku_id")
	@OpField(required = false , desc = "外部sku_id-string", example= "1")
	private String outerSkuId;

	@SerializedName("supplier_id")
	@OpField(required = false , desc = "供应商编码", example= "1")
	private String supplierId;

	@SerializedName("step_stock_num")
	@OpField(required = false , desc = "阶梯库存数", example= "1")
	private Long stepStockNum;

	@SerializedName("code")
	@OpField(required = false , desc = "商家编码", example= "888")
	private String code;

	@SerializedName("price")
	@OpField(required = false , desc = "价格", example= "1")
	private Long price;

	@SerializedName("stock_num")
	@OpField(required = false , desc = "库存数量", example= "1")
	private Long stockNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setPackageSku(List<PackageSkuItem> packageSku){
		this.packageSku = packageSku;
	}

	
	public List<PackageSkuItem> getPackageSku(){
		return this.packageSku;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setGoldProcessCharge(Long goldProcessCharge){
		this.goldProcessCharge = goldProcessCharge;
	}

	
	public Long getGoldProcessCharge(){
		return this.goldProcessCharge;
	}

	
	public void setSellProperties(List<SellPropertiesItem> sellProperties){
		this.sellProperties = sellProperties;
	}

	
	public List<SellPropertiesItem> getSellProperties(){
		return this.sellProperties;
	}

	
	public void setSupplyPrice(Long supplyPrice){
		this.supplyPrice = supplyPrice;
	}

	
	public Long getSupplyPrice(){
		return this.supplyPrice;
	}

	
	public void setDeliveryInfos(List<DeliveryInfosItem> deliveryInfos){
		this.deliveryInfos = deliveryInfos;
	}

	
	public List<DeliveryInfosItem> getDeliveryInfos(){
		return this.deliveryInfos;
	}

	
	public void setCargo(Cargo cargo){
		this.cargo = cargo;
	}

	
	public Cargo getCargo(){
		return this.cargo;
	}

	
	public void setBarcodes(List<String> barcodes){
		this.barcodes = barcodes;
	}

	
	public List<String> getBarcodes(){
		return this.barcodes;
	}

	
	public void setPresellDelay(Long presellDelay){
		this.presellDelay = presellDelay;
	}

	
	public Long getPresellDelay(){
		return this.presellDelay;
	}

	
	public void setSpecValueLibId(Long specValueLibId){
		this.specValueLibId = specValueLibId;
	}

	
	public Long getSpecValueLibId(){
		return this.specValueLibId;
	}

	
	public void setTaxExemptionSkuInfo(TaxExemptionSkuInfo taxExemptionSkuInfo){
		this.taxExemptionSkuInfo = taxExemptionSkuInfo;
	}

	
	public TaxExemptionSkuInfo getTaxExemptionSkuInfo(){
		return this.taxExemptionSkuInfo;
	}

	
	public void setStockNumMap(Map<String,Long> stockNumMap){
		this.stockNumMap = stockNumMap;
	}

	
	public Map<String,Long> getStockNumMap(){
		return this.stockNumMap;
	}

	
	public void setSkuType(Long skuType){
		this.skuType = skuType;
	}

	
	public Long getSkuType(){
		return this.skuType;
	}

	
	public void setCustomsReportInfo(CustomsReportInfo customsReportInfo){
		this.customsReportInfo = customsReportInfo;
	}

	
	public CustomsReportInfo getCustomsReportInfo(){
		return this.customsReportInfo;
	}

	
	public void setOuterSkuId(String outerSkuId){
		this.outerSkuId = outerSkuId;
	}

	
	public String getOuterSkuId(){
		return this.outerSkuId;
	}

	
	public void setSupplierId(String supplierId){
		this.supplierId = supplierId;
	}

	
	public String getSupplierId(){
		return this.supplierId;
	}

	
	public void setStepStockNum(Long stepStockNum){
		this.stepStockNum = stepStockNum;
	}

	
	public Long getStepStockNum(){
		return this.stepStockNum;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setStockNum(Long stockNum){
		this.stockNum = stockNum;
	}

	
	public Long getStockNum(){
		return this.stockNum;
	}

}