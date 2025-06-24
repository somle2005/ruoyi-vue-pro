package com.doudian.open.api.buyin_kolStrategyEdit.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinKolStrategyEditParam {


	@SerializedName("status")
	@OpField(required = true , desc = "1:修改 2关闭 3 策略恢复 4:删除", example= "1")
	private Long status;

	@SerializedName("strategy_id")
	@OpField(required = true , desc = "策略ID", example= "3456782")
	private String strategyId;

	@SerializedName("add_buyin_ids")
	@OpField(required = false , desc = "需要新增的达人百应账号", example= "709876544321")
	private List<Long> addBuyinIds;

	@SerializedName("del_buyin_ids")
	@OpField(required = false , desc = "需要删除的达人百应账号", example= "9876544321")
	private List<Long> delBuyinIds;

	@SerializedName("end_time")
	@OpField(required = false , desc = "结束时间 2020-05-19 00:00:00", example= "2020-05-19 00:00:00")
	private String endTime;

	@SerializedName("long_term")
	@OpField(required = false , desc = "是否长期有效，和end_time互斥；全部达人佣金策略不允许指定该字段", example= "false")
	private Boolean longTerm;

	@SerializedName("cos_ratio")
	@OpField(required = false , desc = "佣金率", example= "50")
	private Long cosRatio;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setStrategyId(String strategyId){
		this.strategyId = strategyId;
	}

	
	public String getStrategyId(){
		return this.strategyId;
	}

	
	public void setAddBuyinIds(List<Long> addBuyinIds){
		this.addBuyinIds = addBuyinIds;
	}

	
	public List<Long> getAddBuyinIds(){
		return this.addBuyinIds;
	}

	
	public void setDelBuyinIds(List<Long> delBuyinIds){
		this.delBuyinIds = delBuyinIds;
	}

	
	public List<Long> getDelBuyinIds(){
		return this.delBuyinIds;
	}

	
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	
	public String getEndTime(){
		return this.endTime;
	}

	
	public void setLongTerm(Boolean longTerm){
		this.longTerm = longTerm;
	}

	
	public Boolean getLongTerm(){
		return this.longTerm;
	}

	
	public void setCosRatio(Long cosRatio){
		this.cosRatio = cosRatio;
	}

	
	public Long getCosRatio(){
		return this.cosRatio;
	}

}