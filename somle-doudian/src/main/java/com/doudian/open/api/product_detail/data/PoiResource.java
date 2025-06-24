package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PoiResource {


	@SerializedName("poi_lib_id")
	@OpField(desc = "卡券关联的门店库id", example = "3526522")
	private Long poiLibId;

	@SerializedName("notification")
	@OpField(desc = "领取须知", example = "发码后可核销使用")
	private String notification;

	@SerializedName("service_num")
	@OpField(desc = "客服电话", example = "86668888")
	private String serviceNum;

	@SerializedName("valid_days")
	@OpField(desc = "有效期天数", example = "7")
	private Long validDays;

	@SerializedName("condition")
	@OpField(desc = "使用条件", example = "仅可在XXX门店范围使用")
	private String condition;

	@SerializedName("total_can_use_count")
	@OpField(desc = "可使用次数", example = "1")
	private Integer totalCanUseCount;

	@SerializedName("code_type")
	@OpField(desc = "券码生成方式", example = "1")
	private Long codeType;

	@SerializedName("coupon_return_methods")
	@OpField(desc = "1 随时退+过期自动退，2 不支持退", example = "[1]")
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

	
	public void setNotification(String notification){
		this.notification = notification;
	}

	
	public String getNotification(){
		return this.notification;
	}

	
	public void setServiceNum(String serviceNum){
		this.serviceNum = serviceNum;
	}

	
	public String getServiceNum(){
		return this.serviceNum;
	}

	
	public void setValidDays(Long validDays){
		this.validDays = validDays;
	}

	
	public Long getValidDays(){
		return this.validDays;
	}

	
	public void setCondition(String condition){
		this.condition = condition;
	}

	
	public String getCondition(){
		return this.condition;
	}

	
	public void setTotalCanUseCount(Integer totalCanUseCount){
		this.totalCanUseCount = totalCanUseCount;
	}

	
	public Integer getTotalCanUseCount(){
		return this.totalCanUseCount;
	}

	
	public void setCodeType(Long codeType){
		this.codeType = codeType;
	}

	
	public Long getCodeType(){
		return this.codeType;
	}

	
	public void setCouponReturnMethods(List<Long> couponReturnMethods){
		this.couponReturnMethods = couponReturnMethods;
	}

	
	public List<Long> getCouponReturnMethods(){
		return this.couponReturnMethods;
	}

}