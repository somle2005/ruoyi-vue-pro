package com.doudian.open.api.buyin_orientKolStrategyCreate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinOrientKolStrategyCreateParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品id", example= "12345678")
	private Long productId;

	@SerializedName("kol_buyin_ids")
	@OpField(required = true , desc = "达人百应ID", example= "7012123456")
	private List<Long> kolBuyinIds;

	@SerializedName("cos_ratio_type")
	@OpField(required = true , desc = "佣金类型：1固定佣金率 2阶梯佣金率", example= "1")
	private Integer cosRatioType;

	@SerializedName("cos_ratio")
	@OpField(required = true , desc = "佣金率", example= "")
	private CosRatio cosRatio;

	@SerializedName("long_term")
	@OpField(required = false , desc = "是否长期有效，和end_time互斥", example= "false")
	private Boolean longTerm;

	@SerializedName("end_time")
	@OpField(required = false , desc = "结束时间 例：2020-05-19 00:00:00", example= "2020-05-19 00:00:00")
	private String endTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setKolBuyinIds(List<Long> kolBuyinIds){
		this.kolBuyinIds = kolBuyinIds;
	}

	
	public List<Long> getKolBuyinIds(){
		return this.kolBuyinIds;
	}

	
	public void setCosRatioType(Integer cosRatioType){
		this.cosRatioType = cosRatioType;
	}

	
	public Integer getCosRatioType(){
		return this.cosRatioType;
	}

	
	public void setCosRatio(CosRatio cosRatio){
		this.cosRatio = cosRatio;
	}

	
	public CosRatio getCosRatio(){
		return this.cosRatio;
	}

	
	public void setLongTerm(Boolean longTerm){
		this.longTerm = longTerm;
	}

	
	public Boolean getLongTerm(){
		return this.longTerm;
	}

	
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	
	public String getEndTime(){
		return this.endTime;
	}

}