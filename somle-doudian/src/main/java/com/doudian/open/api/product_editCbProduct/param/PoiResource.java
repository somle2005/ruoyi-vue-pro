package com.doudian.open.api.product_editCbProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PoiResource {


	@SerializedName("condition")
	@OpField(required = false , desc = "券码使用条件", example= "1")
	private String condition;

	@SerializedName("valid_days")
	@OpField(required = false , desc = "有效时间段，从领取日开始计算，优先级高于ValidStart-ValidEnd", example= "1")
	private Long validDays;

	@SerializedName("valid_start")
	@OpField(required = false , desc = "卡券有效开始时间，秒单位时间戳", example= "1639216083")
	private Long validStart;

	@SerializedName("valid_end")
	@OpField(required = false , desc = "卡券有效截止时间，秒单位时间戳", example= "1639907283")
	private Long validEnd;

	@SerializedName("service_num")
	@OpField(required = false , desc = "客服电话", example= "13111111111")
	private String serviceNum;

	@SerializedName("notification")
	@OpField(required = false , desc = "领取须知", example= "领取")
	private String notification;

	@SerializedName("code_type")
	@OpField(required = false , desc = "平台产生券码: 1 ; 合作方api实时传入的券码: 4", example= "1")
	private Long codeType;

	@SerializedName("total_can_use_count")
	@OpField(required = true , desc = "可核销总次数", example= "1")
	private Integer totalCanUseCount;

	@SerializedName("coupon_second_exchange")
	@OpField(required = true , desc = "0-不支持二次兑换，1-支持二次兑换", example= "0")
	private Long couponSecondExchange;

	@SerializedName("link")
	@OpField(required = false , desc = "兑换链接", example= "http://xxx.xxxx.xxx")
	private String link;

	@SerializedName("count")
	@OpField(required = false , desc = "券码总量，0/-1表示不限制，平台券时须u003e0", example= "1")
	private Long count;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCondition(String condition){
		this.condition = condition;
	}

	
	public String getCondition(){
		return this.condition;
	}

	
	public void setValidDays(Long validDays){
		this.validDays = validDays;
	}

	
	public Long getValidDays(){
		return this.validDays;
	}

	
	public void setValidStart(Long validStart){
		this.validStart = validStart;
	}

	
	public Long getValidStart(){
		return this.validStart;
	}

	
	public void setValidEnd(Long validEnd){
		this.validEnd = validEnd;
	}

	
	public Long getValidEnd(){
		return this.validEnd;
	}

	
	public void setServiceNum(String serviceNum){
		this.serviceNum = serviceNum;
	}

	
	public String getServiceNum(){
		return this.serviceNum;
	}

	
	public void setNotification(String notification){
		this.notification = notification;
	}

	
	public String getNotification(){
		return this.notification;
	}

	
	public void setCodeType(Long codeType){
		this.codeType = codeType;
	}

	
	public Long getCodeType(){
		return this.codeType;
	}

	
	public void setTotalCanUseCount(Integer totalCanUseCount){
		this.totalCanUseCount = totalCanUseCount;
	}

	
	public Integer getTotalCanUseCount(){
		return this.totalCanUseCount;
	}

	
	public void setCouponSecondExchange(Long couponSecondExchange){
		this.couponSecondExchange = couponSecondExchange;
	}

	
	public Long getCouponSecondExchange(){
		return this.couponSecondExchange;
	}

	
	public void setLink(String link){
		this.link = link;
	}

	
	public String getLink(){
		return this.link;
	}

	
	public void setCount(Long count){
		this.count = count;
	}

	
	public Long getCount(){
		return this.count;
	}

}