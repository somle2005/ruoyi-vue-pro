package com.doudian.open.api.buyin_promotionStrategyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FeatureCosRatio {


	@SerializedName("cos_ratio")
	@OpField(desc = "佣金率 如果是阶梯佣金 存第一阶梯的佣金率", example = "39")
	private Long cosRatio;

	@SerializedName("ladder_bar")
	@OpField(desc = "阶梯佣金率门槛 非阶梯为0", example = "45")
	private Long ladderBar;

	@SerializedName("ladder_cos_ratio")
	@OpField(desc = "阶梯佣金率 非阶梯为0", example = "45")
	private Long ladderCosRatio;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCosRatio(Long cosRatio){
		this.cosRatio = cosRatio;
	}

	
	public Long getCosRatio(){
		return this.cosRatio;
	}

	
	public void setLadderBar(Long ladderBar){
		this.ladderBar = ladderBar;
	}

	
	public Long getLadderBar(){
		return this.ladderBar;
	}

	
	public void setLadderCosRatio(Long ladderCosRatio){
		this.ladderCosRatio = ladderCosRatio;
	}

	
	public Long getLadderCosRatio(){
		return this.ladderCosRatio;
	}

}