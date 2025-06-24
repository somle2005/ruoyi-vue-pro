package com.doudian.open.api.buyin_promotionStrategyList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinPromotionStrategyListParam {


	@SerializedName("product_id")
	@OpField(required = false , desc = "商品ID", example= "123456789")
	private String productId;

	@SerializedName("kol_buyin_ids")
	@OpField(required = false , desc = "根据buyin_id搜索", example= "7098765432")
	private List<Long> kolBuyinIds;

	@SerializedName("status")
	@OpField(required = true , desc = "状态 0：全部 1：生效中 2：已结束 3：已失效", example= "0")
	private Long status;

	@SerializedName("valid_kol_filter")
	@OpField(required = false , desc = "生效达人范围 1：全部达人 2：指定达人 3：条件圈选", example= "1")
	private Long validKolFilter;

	@SerializedName("cos_type")
	@OpField(required = false , desc = "佣金规则 1：固定佣金 2：阶梯佣金", example= "1")
	private Integer cosType;

	@SerializedName("end_time_filter")
	@OpField(required = false , desc = "结束时间 1：1天内，2：3天内，3：7天内", example= "1")
	private Long endTimeFilter;

	@SerializedName("cos_range_filter")
	@OpField(required = false , desc = "佣金率范围", example= "")
	private CosRangeFilter cosRangeFilter;

	@SerializedName("strategy_id")
	@OpField(required = false , desc = "策略id", example= "7654321")
	private List<String> strategyId;

	@SerializedName("page")
	@OpField(required = true , desc = "分页", example= "1")
	private Long page;

	@SerializedName("page_size")
	@OpField(required = true , desc = "分页大小", example= "20")
	private Long pageSize;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setKolBuyinIds(List<Long> kolBuyinIds){
		this.kolBuyinIds = kolBuyinIds;
	}

	
	public List<Long> getKolBuyinIds(){
		return this.kolBuyinIds;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setValidKolFilter(Long validKolFilter){
		this.validKolFilter = validKolFilter;
	}

	
	public Long getValidKolFilter(){
		return this.validKolFilter;
	}

	
	public void setCosType(Integer cosType){
		this.cosType = cosType;
	}

	
	public Integer getCosType(){
		return this.cosType;
	}

	
	public void setEndTimeFilter(Long endTimeFilter){
		this.endTimeFilter = endTimeFilter;
	}

	
	public Long getEndTimeFilter(){
		return this.endTimeFilter;
	}

	
	public void setCosRangeFilter(CosRangeFilter cosRangeFilter){
		this.cosRangeFilter = cosRangeFilter;
	}

	
	public CosRangeFilter getCosRangeFilter(){
		return this.cosRangeFilter;
	}

	
	public void setStrategyId(List<String> strategyId){
		this.strategyId = strategyId;
	}

	
	public List<String> getStrategyId(){
		return this.strategyId;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

}