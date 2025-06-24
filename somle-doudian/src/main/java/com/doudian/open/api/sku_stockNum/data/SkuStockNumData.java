package com.doudian.open.api.sku_stockNum.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;
import java.util.List;

//auto generated, do not edit

public class SkuStockNumData {


	@SerializedName("sku_id")
	@OpField(desc = "商品规格id，店铺商品id下唯一，抖店平台生成", example = "12345")
	private Long skuId;

	@SerializedName("out_sku_id")
	@OpField(desc = "外部开发者自定义商品规格id，会校验再店铺下唯一性", example = "12345")
	private Long outSkuId;

	@SerializedName("code")
	@OpField(desc = "sku商家编码，对应抖店后台商品sku商家编码", example = "abc")
	private String code;

	@SerializedName("sku_type")
	@OpField(desc = "sku库存类型，0-普通库存；1-区域库存；10-阶梯库存；", example = "0")
	private Long skuType;

	@SerializedName("stock_num")
	@OpField(desc = "商品规格库存；如果sku_type=0，表示全国库存； 如果sku_type=1，且入参有out_warehouse_id，则表示该仓库的库存； 如果sku_type=1，且入参无out_warehouse_id，则为空；", example = "12")
	private Long stockNum;

	@SerializedName("prehold_stock_num")
	@OpField(desc = "占用库存", example = "12")
	private Long preholdStockNum;

	@SerializedName("prom_stock_num")
	@OpField(desc = "活动库存", example = "12")
	private Long promStockNum;

	@SerializedName("step_stock_num")
	@OpField(desc = "阶梯库存", example = "12")
	private Long stepStockNum;

	@SerializedName("prehold_step_stock_num")
	@OpField(desc = "阶梯占用库存", example = "12")
	private Long preholdStepStockNum;

	@SerializedName("prom_step_stock_num")
	@OpField(desc = "活动阶梯库存", example = "12")
	private Long promStepStockNum;

	@SerializedName("stock_num_map")
	@OpField(desc = "如果sku_type=0，为空 如果sku_type=1，则为区域仓库存映射表，key为out_warehouse_id，value为库存", example = "1")
	private Map<String,Long> stockNumMap;

	@SerializedName("prehold_stock_map")
	@OpField(desc = "如果sku_type=0，为空 如果sku_type=1，则为区域仓库存映射表，key为out_warehouse_id，value为占用库存", example = "1")
	private Map<String,Long> preholdStockMap;

	@SerializedName("ship_rule_map")
	@OpField(desc = "如果sku_type=0，为空 如果sku_type=1，则为区域仓库存映射表，key为out_warehouse_id，value为sku在仓中的发货时效", example = "")
	private Map<String,ShipRuleMapItem> shipRuleMap;

	@SerializedName("normal_stock_num")
	@OpField(desc = "普通库存，非活动可售", example = "1")
	private Long normalStockNum;

	@SerializedName("channel_stock_num")
	@OpField(desc = "渠道库存", example = "1")
	private Long channelStockNum;

	@SerializedName("batch_stocks")
	@OpField(desc = "批次库存", example = "")
	private List<BatchStocksItem> batchStocks;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setStockNumMap(Map<String,Long> stockNumMap){
		this.stockNumMap = stockNumMap;
	}

	
	public Map<String,Long> getStockNumMap(){
		return this.stockNumMap;
	}

	
	public void setPreholdStockMap(Map<String,Long> preholdStockMap){
		this.preholdStockMap = preholdStockMap;
	}

	
	public Map<String,Long> getPreholdStockMap(){
		return this.preholdStockMap;
	}

	
	public void setShipRuleMap(Map<String,ShipRuleMapItem> shipRuleMap){
		this.shipRuleMap = shipRuleMap;
	}

	
	public Map<String,ShipRuleMapItem> getShipRuleMap(){
		return this.shipRuleMap;
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

	
	public void setBatchStocks(List<BatchStocksItem> batchStocks){
		this.batchStocks = batchStocks;
	}

	
	public List<BatchStocksItem> getBatchStocks(){
		return this.batchStocks;
	}

}