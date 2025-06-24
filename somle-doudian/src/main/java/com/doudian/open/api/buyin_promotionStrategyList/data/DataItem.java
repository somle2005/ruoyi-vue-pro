package com.doudian.open.api.buyin_promotionStrategyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("strategy_id")
	@OpField(desc = "策略id", example = "7654321")
	private String strategyId;

	@SerializedName("status")
	@OpField(desc = "状态 1：生效中 2：已结束 3：已失效", example = "1")
	private Long status;

	@SerializedName("end_time_tip")
	@OpField(desc = "结束时间提示 1：1天内，2：3天内，3：7天内", example = "1")
	private Long endTimeTip;

	@SerializedName("valid_kol_info")
	@OpField(desc = "生效达人信息", example = "")
	private ValidKolInfo validKolInfo;

	@SerializedName("cos_info")
	@OpField(desc = "佣金信息", example = "")
	private CosInfo cosInfo;

	@SerializedName("start_time")
	@OpField(desc = "开始时间 2020-05-19 00:00:00", example = "2020-05-19 00:00:00")
	private String startTime;

	@SerializedName("end_time")
	@OpField(desc = "结束时间 2020-05-19 00:00:00", example = "2020-05-19 00:00:00")
	private String endTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStrategyId(String strategyId){
		this.strategyId = strategyId;
	}

	
	public String getStrategyId(){
		return this.strategyId;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setEndTimeTip(Long endTimeTip){
		this.endTimeTip = endTimeTip;
	}

	
	public Long getEndTimeTip(){
		return this.endTimeTip;
	}

	
	public void setValidKolInfo(ValidKolInfo validKolInfo){
		this.validKolInfo = validKolInfo;
	}

	
	public ValidKolInfo getValidKolInfo(){
		return this.validKolInfo;
	}

	
	public void setCosInfo(CosInfo cosInfo){
		this.cosInfo = cosInfo;
	}

	
	public CosInfo getCosInfo(){
		return this.cosInfo;
	}

	
	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	
	public String getStartTime(){
		return this.startTime;
	}

	
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	
	public String getEndTime(){
		return this.endTime;
	}

}