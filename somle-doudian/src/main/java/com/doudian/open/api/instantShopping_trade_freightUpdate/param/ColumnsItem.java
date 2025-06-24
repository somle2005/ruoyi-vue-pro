package com.doudian.open.api.instantShopping_trade_freightUpdate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ColumnsItem {


	@SerializedName("add_weight_price")
	@OpField(required = false , desc = "续重价格(单位:元) 按重量计价必填 0.00-30.00之间的小数，小数点后两位", example= "0")
	private Double addWeightPrice;

	@SerializedName("add_num")
	@OpField(required = false , desc = "续件(单位:个) 按数量计价必填 1-999的整数", example= "1")
	private Long addNum;

	@SerializedName("over_weight")
	@OpField(required = false , desc = "满xx重量包邮 单位：kg", example= "0")
	private Double overWeight;

	@SerializedName("province_infos")
	@OpField(required = false , desc = "当前规则生效的地址，统一以List<Struct>结构返回，该结构为嵌套结构。对应的json格式为[{id:32,children:[{id:320500,children:[{id:320508,children:[{id:320508014},{id:320508004}]}]}]}] 注意：返回的为最新的四级地址版本（地址存储升级变更的可能，以最新的返回）", example= "")
	private List<ProvinceInfosItem> provinceInfos;

	@SerializedName("end_time")
	@OpField(required = false , desc = "限售自动解除时间戳，单位秒", example= "-")
	private Long endTime;

	@SerializedName("first_num")
	@OpField(required = false , desc = "首件数量(单位:个) 按数量计价必填 1-999的整数", example= "1")
	private Long firstNum;

	@SerializedName("first_num_price")
	@OpField(required = false , desc = "首件价格(单位:元)按数量计价必填 0.00-30.00之间的小数，小数点后两位", example= "1")
	private Double firstNumPrice;

	@SerializedName("is_default")
	@OpField(required = false , desc = "是否默认计价方式(1:是；0:不是)", example= "1")
	private Long isDefault;

	@SerializedName("is_limited")
	@OpField(required = false , desc = "是否限运规则", example= "0")
	private Boolean isLimited;

	@SerializedName("min_sku_amount")
	@OpField(required = false , desc = "最小商品金额限制条件", example= "0")
	private Long minSkuAmount;

	@SerializedName("reason")
	@OpField(required = false , desc = "限售原因。枚举值 distance_shipping_cost_high：因配送距离导致运费过高 weight_shipping_cost_high：因商品重量导致运费过高 force_majeure：因不可抗力（如会议赛事、自然灾害）不配送 cooperation_express_not_deliver：合作快递不配送 cooperation_express_poor_service：合作快递该区域服务差 other：其他", example= "-")
	private String reason;

	@SerializedName("calculate_type")
	@OpField(required = false , desc = "计价方式-1.按重量计价 2.按数量计价", example= "2")
	private Long calculateType;

	@SerializedName("max_sku_amount")
	@OpField(required = false , desc = "最大商品金额限制条件", example= "0")
	private Long maxSkuAmount;

	@SerializedName("rule_type")
	@OpField(required = false , desc = "运费规则类型，同template.rule_type字段;0:阶梯计价；1:固定运费；2:卖家包邮", example= "2")
	private Long ruleType;

	@SerializedName("first_weight")
	@OpField(required = false , desc = "首重(单位:kg) 按重量计价必填 0.1-999.9之间的小数，小数点后一位", example= "1")
	private Double firstWeight;

	@SerializedName("add_weight")
	@OpField(required = false , desc = "续重(单位:kg) 按重量计价必填 0.1-999.9之间的小数，小数点后一位", example= "0")
	private Double addWeight;

	@SerializedName("fixed_amount")
	@OpField(required = false , desc = "固定运费金额（单位：分）", example= "0")
	private Long fixedAmount;

	@SerializedName("is_over_free")
	@OpField(required = false , desc = "是否条件包邮", example= "1")
	private Boolean isOverFree;

	@SerializedName("first_weight_price")
	@OpField(required = false , desc = "首重价格(单位:元) 按重量计价必填 0.00-30.00之间的小数，小数点后两位", example= "1")
	private Double firstWeightPrice;

	@SerializedName("add_num_price")
	@OpField(required = false , desc = "续件价格(单位:元) 按数量计价必填 0.00-30.00之间的小数，小数点后两位", example= "1")
	private Double addNumPrice;

	@SerializedName("over_num")
	@OpField(required = false , desc = "满xx件包邮", example= "1")
	private Long overNum;

	@SerializedName("over_amount")
	@OpField(required = false , desc = "满xx金额包邮 单位：分", example= "1")
	private Long overAmount;

	@SerializedName("delivery_fulfillment_mode")
	@OpField(required = true , desc = "履约模式：1：即配，2：次日达，3：全国送", example= "2")
	private Long deliveryFulfillmentMode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAddWeightPrice(Double addWeightPrice){
		this.addWeightPrice = addWeightPrice;
	}

	
	public Double getAddWeightPrice(){
		return this.addWeightPrice;
	}

	
	public void setAddNum(Long addNum){
		this.addNum = addNum;
	}

	
	public Long getAddNum(){
		return this.addNum;
	}

	
	public void setOverWeight(Double overWeight){
		this.overWeight = overWeight;
	}

	
	public Double getOverWeight(){
		return this.overWeight;
	}

	
	public void setProvinceInfos(List<ProvinceInfosItem> provinceInfos){
		this.provinceInfos = provinceInfos;
	}

	
	public List<ProvinceInfosItem> getProvinceInfos(){
		return this.provinceInfos;
	}

	
	public void setEndTime(Long endTime){
		this.endTime = endTime;
	}

	
	public Long getEndTime(){
		return this.endTime;
	}

	
	public void setFirstNum(Long firstNum){
		this.firstNum = firstNum;
	}

	
	public Long getFirstNum(){
		return this.firstNum;
	}

	
	public void setFirstNumPrice(Double firstNumPrice){
		this.firstNumPrice = firstNumPrice;
	}

	
	public Double getFirstNumPrice(){
		return this.firstNumPrice;
	}

	
	public void setIsDefault(Long isDefault){
		this.isDefault = isDefault;
	}

	
	public Long getIsDefault(){
		return this.isDefault;
	}

	
	public void setIsLimited(Boolean isLimited){
		this.isLimited = isLimited;
	}

	
	public Boolean getIsLimited(){
		return this.isLimited;
	}

	
	public void setMinSkuAmount(Long minSkuAmount){
		this.minSkuAmount = minSkuAmount;
	}

	
	public Long getMinSkuAmount(){
		return this.minSkuAmount;
	}

	
	public void setReason(String reason){
		this.reason = reason;
	}

	
	public String getReason(){
		return this.reason;
	}

	
	public void setCalculateType(Long calculateType){
		this.calculateType = calculateType;
	}

	
	public Long getCalculateType(){
		return this.calculateType;
	}

	
	public void setMaxSkuAmount(Long maxSkuAmount){
		this.maxSkuAmount = maxSkuAmount;
	}

	
	public Long getMaxSkuAmount(){
		return this.maxSkuAmount;
	}

	
	public void setRuleType(Long ruleType){
		this.ruleType = ruleType;
	}

	
	public Long getRuleType(){
		return this.ruleType;
	}

	
	public void setFirstWeight(Double firstWeight){
		this.firstWeight = firstWeight;
	}

	
	public Double getFirstWeight(){
		return this.firstWeight;
	}

	
	public void setAddWeight(Double addWeight){
		this.addWeight = addWeight;
	}

	
	public Double getAddWeight(){
		return this.addWeight;
	}

	
	public void setFixedAmount(Long fixedAmount){
		this.fixedAmount = fixedAmount;
	}

	
	public Long getFixedAmount(){
		return this.fixedAmount;
	}

	
	public void setIsOverFree(Boolean isOverFree){
		this.isOverFree = isOverFree;
	}

	
	public Boolean getIsOverFree(){
		return this.isOverFree;
	}

	
	public void setFirstWeightPrice(Double firstWeightPrice){
		this.firstWeightPrice = firstWeightPrice;
	}

	
	public Double getFirstWeightPrice(){
		return this.firstWeightPrice;
	}

	
	public void setAddNumPrice(Double addNumPrice){
		this.addNumPrice = addNumPrice;
	}

	
	public Double getAddNumPrice(){
		return this.addNumPrice;
	}

	
	public void setOverNum(Long overNum){
		this.overNum = overNum;
	}

	
	public Long getOverNum(){
		return this.overNum;
	}

	
	public void setOverAmount(Long overAmount){
		this.overAmount = overAmount;
	}

	
	public Long getOverAmount(){
		return this.overAmount;
	}

	
	public void setDeliveryFulfillmentMode(Long deliveryFulfillmentMode){
		this.deliveryFulfillmentMode = deliveryFulfillmentMode;
	}

	
	public Long getDeliveryFulfillmentMode(){
		return this.deliveryFulfillmentMode;
	}

}