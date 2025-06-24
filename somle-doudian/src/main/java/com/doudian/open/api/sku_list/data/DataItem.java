package com.doudian.open.api.sku_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class DataItem {


	@SerializedName("multi_time_stocks")
	@OpField(desc = "时效库存", example = "")
	private List<MultiTimeStocksItem> multiTimeStocks;

	@SerializedName("sku_status")
	@OpField(desc = "sku状态 true上架 false下架", example = "true")
	private Boolean skuStatus;

	@SerializedName("id")
	@OpField(desc = "商品sku_id;抖店系统生成。", example = "1736402086955032")
	private Long id;

	@SerializedName("open_user_id")
	@OpField(desc = "app_key", example = "0")
	private Long openUserId;

	@SerializedName("out_sku_id")
	@OpField(desc = "外部的skuId；商家自定义；未设置返回为0。", example = "0")
	private Long outSkuId;

	@SerializedName("product_id")
	@OpField(desc = "商品ID；抖店系统生成。", example = "3557453527615939930")
	private Long productId;

	@SerializedName("spec_detail_id1")
	@OpField(desc = "第一级子规格", example = "1737037851057159")
	private Long specDetailId1;

	@SerializedName("spec_detail_id2")
	@OpField(desc = "第二级子规格", example = "0")
	private Long specDetailId2;

	@SerializedName("spec_detail_id3")
	@OpField(desc = "第三级子规格", example = "0")
	private Long specDetailId3;

	@SerializedName("spec_detail_name1")
	@OpField(desc = "第一级子规格名", example = "默认")
	private String specDetailName1;

	@SerializedName("spec_detail_name2")
	@OpField(desc = "第二级子规格名", example = "")
	private String specDetailName2;

	@SerializedName("spec_detail_name3")
	@OpField(desc = "第三级子规格名", example = "")
	private String specDetailName3;

	@SerializedName("customs_report_info")
	@OpField(desc = "海关申报要素", example = "")
	private CustomsReportInfo customsReportInfo;

	@SerializedName("price")
	@OpField(desc = "商品价格，单位：分", example = "12")
	private Long price;

	@SerializedName("settlement_price")
	@OpField(desc = "结算价格，【已废弃】价格字段是price", example = "12")
	private Long settlementPrice;

	@SerializedName("spec_id")
	@OpField(desc = "规格ID", example = "1737037851056167")
	private Long specId;

	@SerializedName("create_time")
	@OpField(desc = "创建时间，时间戳：单位秒；", example = "1621611875")
	private Long createTime;

	@SerializedName("code")
	@OpField(desc = "sku外部编码", example = "dy001")
	private String code;

	@SerializedName("sku_type")
	@OpField(desc = "库存类型；0-普通；1-区域库存；10-阶梯库存；", example = "0")
	private Long skuType;

	@SerializedName("supplier_id")
	@OpField(desc = "供应商ID", example = "333")
	private String supplierId;

	@SerializedName("stock_num")
	@OpField(desc = "sku_type=0时，表示普通库存数量 ;sku_type=1时，使用stock_map，表示区域库存数量", example = "100")
	private Long stockNum;

	@SerializedName("prehold_stock_num")
	@OpField(desc = "sku_type=0时，表示预占库存数量； sku_type=1时，表示区域库存数量，使用prehold_stock_map", example = "50")
	private Long preholdStockNum;

	@SerializedName("prom_stock_num")
	@OpField(desc = "活动库存", example = "50")
	private Long promStockNum;

	@SerializedName("step_stock_num")
	@OpField(desc = "阶梯库存", example = "100")
	private Long stepStockNum;

	@SerializedName("prehold_step_stock_num")
	@OpField(desc = "预占阶梯库存", example = "20")
	private Long preholdStepStockNum;

	@SerializedName("prom_step_stock_num")
	@OpField(desc = "活动阶梯库存", example = "100")
	private Long promStepStockNum;

	@SerializedName("stock_map")
	@OpField(desc = "如果sku_type=0，为空 如果sku_type=1，则为区域仓库存映射表，key为out_warehouse_id（区域仓库id使用【/warehouse/list】查询），value为库存", example = "{}")
	private Map<String,Long> stockMap;

	@SerializedName("prehold_stock_map")
	@OpField(desc = "如果sku_type=0，为空 如果sku_type=1，则为区域仓库存映射表，key为out_warehouse_id（区域仓库id使用【/warehouse/list】查询），value为占用库存", example = "{}")
	private Map<String,Long> preholdStockMap;

	@SerializedName("product_id_str")
	@OpField(desc = "商品 ID字符串类型", example = "3557453527615939930")
	private String productIdStr;

	@SerializedName("ship_rule_map")
	@OpField(desc = "如果sku_type=0，为空 如果sku_type=1，则为区域仓库存映射表，key为out_warehouse_id（区域仓库id使用【/warehouse/list】查询），value为sku 在对应仓中的发货时效", example = "")
	private Map<String,ShipRuleMapItem> shipRuleMap;

	@SerializedName("is_suit")
	@OpField(desc = "海南免税：是否套装，0 否，1 是", example = "0")
	private Integer isSuit;

	@SerializedName("suit_num")
	@OpField(desc = "海南免税：套装数量", example = "0")
	private Long suitNum;

	@SerializedName("volume")
	@OpField(desc = "海南免税：净含量", example = "0")
	private Long volume;

	@SerializedName("normal_stock_num")
	@OpField(desc = "库存模型V2新增 普通库存 非活动可售", example = "11")
	private Long normalStockNum;

	@SerializedName("channel_stock_num")
	@OpField(desc = "库存模型V2新增 渠道库存", example = "11")
	private Long channelStockNum;

	@SerializedName("sell_properties")
	@OpField(desc = "销售属性，代替spec_detail_id123、spec_detail_name123", example = "")
	private List<SellPropertiesItem> sellProperties;


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

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setOpenUserId(Long openUserId){
		this.openUserId = openUserId;
	}

	
	public Long getOpenUserId(){
		return this.openUserId;
	}

	
	public void setOutSkuId(Long outSkuId){
		this.outSkuId = outSkuId;
	}

	
	public Long getOutSkuId(){
		return this.outSkuId;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
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

	
	public void setSpecDetailName1(String specDetailName1){
		this.specDetailName1 = specDetailName1;
	}

	
	public String getSpecDetailName1(){
		return this.specDetailName1;
	}

	
	public void setSpecDetailName2(String specDetailName2){
		this.specDetailName2 = specDetailName2;
	}

	
	public String getSpecDetailName2(){
		return this.specDetailName2;
	}

	
	public void setSpecDetailName3(String specDetailName3){
		this.specDetailName3 = specDetailName3;
	}

	
	public String getSpecDetailName3(){
		return this.specDetailName3;
	}

	
	public void setCustomsReportInfo(CustomsReportInfo customsReportInfo){
		this.customsReportInfo = customsReportInfo;
	}

	
	public CustomsReportInfo getCustomsReportInfo(){
		return this.customsReportInfo;
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setSettlementPrice(Long settlementPrice){
		this.settlementPrice = settlementPrice;
	}

	
	public Long getSettlementPrice(){
		return this.settlementPrice;
	}

	
	public void setSpecId(Long specId){
		this.specId = specId;
	}

	
	public Long getSpecId(){
		return this.specId;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
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

	
	public void setStockNum(Long stockNum){
		this.stockNum = stockNum;
	}

	
	public Long getStockNum(){
		return this.stockNum;
	}

	
	public void setPreholdStockNum(Long preholdStockNum){
		this.preholdStockNum = preholdStockNum;
	}

	
	public Long getPreholdStockNum(){
		return this.preholdStockNum;
	}

	
	public void setPromStockNum(Long promStockNum){
		this.promStockNum = promStockNum;
	}

	
	public Long getPromStockNum(){
		return this.promStockNum;
	}

	
	public void setStepStockNum(Long stepStockNum){
		this.stepStockNum = stepStockNum;
	}

	
	public Long getStepStockNum(){
		return this.stepStockNum;
	}

	
	public void setPreholdStepStockNum(Long preholdStepStockNum){
		this.preholdStepStockNum = preholdStepStockNum;
	}

	
	public Long getPreholdStepStockNum(){
		return this.preholdStepStockNum;
	}

	
	public void setPromStepStockNum(Long promStepStockNum){
		this.promStepStockNum = promStepStockNum;
	}

	
	public Long getPromStepStockNum(){
		return this.promStepStockNum;
	}

	
	public void setStockMap(Map<String,Long> stockMap){
		this.stockMap = stockMap;
	}

	
	public Map<String,Long> getStockMap(){
		return this.stockMap;
	}

	
	public void setPreholdStockMap(Map<String,Long> preholdStockMap){
		this.preholdStockMap = preholdStockMap;
	}

	
	public Map<String,Long> getPreholdStockMap(){
		return this.preholdStockMap;
	}

	
	public void setProductIdStr(String productIdStr){
		this.productIdStr = productIdStr;
	}

	
	public String getProductIdStr(){
		return this.productIdStr;
	}

	
	public void setShipRuleMap(Map<String,ShipRuleMapItem> shipRuleMap){
		this.shipRuleMap = shipRuleMap;
	}

	
	public Map<String,ShipRuleMapItem> getShipRuleMap(){
		return this.shipRuleMap;
	}

	
	public void setIsSuit(Integer isSuit){
		this.isSuit = isSuit;
	}

	
	public Integer getIsSuit(){
		return this.isSuit;
	}

	
	public void setSuitNum(Long suitNum){
		this.suitNum = suitNum;
	}

	
	public Long getSuitNum(){
		return this.suitNum;
	}

	
	public void setVolume(Long volume){
		this.volume = volume;
	}

	
	public Long getVolume(){
		return this.volume;
	}

	
	public void setNormalStockNum(Long normalStockNum){
		this.normalStockNum = normalStockNum;
	}

	
	public Long getNormalStockNum(){
		return this.normalStockNum;
	}

	
	public void setChannelStockNum(Long channelStockNum){
		this.channelStockNum = channelStockNum;
	}

	
	public Long getChannelStockNum(){
		return this.channelStockNum;
	}

	
	public void setSellProperties(List<SellPropertiesItem> sellProperties){
		this.sellProperties = sellProperties;
	}

	
	public List<SellPropertiesItem> getSellProperties(){
		return this.sellProperties;
	}

}