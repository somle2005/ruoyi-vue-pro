package com.doudian.open.api.promise_SaveTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TemplateInfo {


	@SerializedName("c_shop_id")
	@OpField(required = false , desc = "传0即可", example= "0")
	private Long cShopId;

	@SerializedName("template_id")
	@OpField(required = false , desc = "模板ID。创建时效规则模板时，该参数不填。修改时效规则模板时，该参数为对应时效规则模板的template_id。", example= "")
	private String templateId;

	@SerializedName("time_type")
	@OpField(required = false , desc = "模板时效类型 1-承诺发货 2-承诺送达", example= "1")
	private Long timeType;

	@SerializedName("is_support_appointment")
	@OpField(required = false , desc = "是否支持预约", example= "true")
	private Boolean isSupportAppointment;

	@SerializedName("is_support_modify_appointment")
	@OpField(required = false , desc = "是否支持修改预约时间", example= "true")
	private Boolean isSupportModifyAppointment;

	@SerializedName("status")
	@OpField(required = false , desc = "状态 1-生效中；2-已停用；3-删除", example= "1")
	private Long status;

	@SerializedName("template_name")
	@OpField(required = true , desc = "模板名称（必填）", example= "大家电预约发货时效模板")
	private String templateName;

	@SerializedName("warehouse_info")
	@OpField(required = false , desc = "仓库信息。warehouse_id和warehouse_name可以同时不填。若不填，则该模板的生效范围为全店生效。如果填写了仓库信息，则该模板的生效范围为按仓生效。", example= "")
	private WarehouseInfo warehouseInfo;

	@SerializedName("support_appoinment_day")
	@OpField(required = false , desc = "允许用户预约的最大天数。目前支持15-90范围内的整数。例如，15表示用户最大可约天数为15天。", example= "15")
	private Long supportAppoinmentDay;

	@SerializedName("shop_name")
	@OpField(required = false , desc = "商家名称", example= "测试店铺")
	private String shopName;

	@SerializedName("biz_tag")
	@OpField(required = false , desc = "业务身份", example= "Home")
	private String bizTag;

	@SerializedName("min_hour_for_modify_appointment")
	@OpField(required = false , desc = "支持修改预约时效的最小buffer时间。目前支持1-72范围内的整数。例如，12表示订单发货的12小时之前，允许用户修改订单发货时间。", example= "12")
	private Long minHourForModifyAppointment;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCShopId(Long cShopId){
		this.cShopId = cShopId;
	}

	
	public Long getCShopId(){
		return this.cShopId;
	}

	
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	
	public String getTemplateId(){
		return this.templateId;
	}

	
	public void setTimeType(Long timeType){
		this.timeType = timeType;
	}

	
	public Long getTimeType(){
		return this.timeType;
	}

	
	public void setIsSupportAppointment(Boolean isSupportAppointment){
		this.isSupportAppointment = isSupportAppointment;
	}

	
	public Boolean getIsSupportAppointment(){
		return this.isSupportAppointment;
	}

	
	public void setIsSupportModifyAppointment(Boolean isSupportModifyAppointment){
		this.isSupportModifyAppointment = isSupportModifyAppointment;
	}

	
	public Boolean getIsSupportModifyAppointment(){
		return this.isSupportModifyAppointment;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
	}

	
	public void setWarehouseInfo(WarehouseInfo warehouseInfo){
		this.warehouseInfo = warehouseInfo;
	}

	
	public WarehouseInfo getWarehouseInfo(){
		return this.warehouseInfo;
	}

	
	public void setSupportAppoinmentDay(Long supportAppoinmentDay){
		this.supportAppoinmentDay = supportAppoinmentDay;
	}

	
	public Long getSupportAppoinmentDay(){
		return this.supportAppoinmentDay;
	}

	
	public void setShopName(String shopName){
		this.shopName = shopName;
	}

	
	public String getShopName(){
		return this.shopName;
	}

	
	public void setBizTag(String bizTag){
		this.bizTag = bizTag;
	}

	
	public String getBizTag(){
		return this.bizTag;
	}

	
	public void setMinHourForModifyAppointment(Long minHourForModifyAppointment){
		this.minHourForModifyAppointment = minHourForModifyAppointment;
	}

	
	public Long getMinHourForModifyAppointment(){
		return this.minHourForModifyAppointment;
	}

}