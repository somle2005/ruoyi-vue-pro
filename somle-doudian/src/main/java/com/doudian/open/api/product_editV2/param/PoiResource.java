package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PoiResource {


	@SerializedName("poi_lib_id")
	@OpField(required = false , desc = "门店库id", example= "7448856056001954098")
	private Long poiLibId;

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

	@SerializedName("count")
	@OpField(required = false , desc = "券码总量，0/-1表示不限制，平台券时须u003e0", example= "1")
	private Long count;

	@SerializedName("couponSecondExchange")
	@OpField(required = false , desc = "0-不支持二次兑换，1-支持二次兑换", example= "0")
	private Long couponSecondExchange;

	@SerializedName("total_can_use_count")
	@OpField(required = false , desc = "可核销总次数", example= "1")
	private Integer totalCanUseCount;

	@SerializedName("link")
	@OpField(required = false , desc = "兑换链接", example= "http://xxx.xxxx.xxx")
	private String link;

	@SerializedName("condition")
	@OpField(required = false , desc = "券码使用条件", example= "券码使用条件")
	private String condition;

	@SerializedName("coupon_return_methods")
	@OpField(required = false , desc = "数组当前只支持一个元素且只可为 1或2，其中 1 表示随时退+过期自动退，2 表示不支持退", example= "[1]")
	private List<Long> couponReturnMethods;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPoiLibId(Long poiLibId){
		this.poiLibId = poiLibId;
	}

	
	public Long getPoiLibId(){
		return this.poiLibId;
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

	
	public void setCount(Long count){
		this.count = count;
	}

	
	public Long getCount(){
		return this.count;
	}

	
	public void setCouponSecondExchange(Long couponSecondExchange){
		this.couponSecondExchange = couponSecondExchange;
	}

	
	public Long getCouponSecondExchange(){
		return this.couponSecondExchange;
	}

	
	public void setTotalCanUseCount(Integer totalCanUseCount){
		this.totalCanUseCount = totalCanUseCount;
	}

	
	public Integer getTotalCanUseCount(){
		return this.totalCanUseCount;
	}

	
	public void setLink(String link){
		this.link = link;
	}

	
	public String getLink(){
		return this.link;
	}

	
	public void setCondition(String condition){
		this.condition = condition;
	}

	
	public String getCondition(){
		return this.condition;
	}

	
	public void setCouponReturnMethods(List<Long> couponReturnMethods){
		this.couponReturnMethods = couponReturnMethods;
	}

	
	public List<Long> getCouponReturnMethods(){
		return this.couponReturnMethods;
	}

}