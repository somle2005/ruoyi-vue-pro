package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsInfoItem {


	@SerializedName("transit_merge_type")
	@OpField(desc = "包裹是否为合包", example = "merge")
	private String transitMergeType;

	@SerializedName("sp_total_price")
	@OpField(desc = "即时零售订单使用平台运力时的配送应付金额；单位：分", example = "700")
	private Long spTotalPrice;

	@SerializedName("sp_price")
	@OpField(desc = "即时零售订单使用平台运力时的配送实付金额；单位：分", example = "400")
	private Long spPrice;

	@SerializedName("sp_discount_price")
	@OpField(desc = "即时零售订单使用平台运力时的配送优惠金额；单位：分", example = "300")
	private Long spDiscountPrice;

	@SerializedName("tracking_no")
	@OpField(desc = "物流单号", example = "3617355413")
	private String trackingNo;

	@SerializedName("company")
	@OpField(desc = "物流公司", example = "shunfeng")
	private String company;

	@SerializedName("ship_time")
	@OpField(desc = "发货时间，时间戳，秒", example = "1617355413")
	private Long shipTime;

	@SerializedName("delivery_id")
	@OpField(desc = "包裹id", example = "shunfeng_3617355413")
	private String deliveryId;

	@SerializedName("company_name")
	@OpField(desc = "物流公司名称", example = "顺丰")
	private String companyName;

	@SerializedName("product_info")
	@OpField(desc = "商品信息", example = "")
	private List<ProductInfoItem> productInfo;

	@SerializedName("added_services")
	@OpField(desc = "物流增值服务列表", example = "")
	private List<AddedServicesItem> addedServices;

	@SerializedName("hour_up_pickup_code")
	@OpField(desc = "骑手取件码；触发场景①商家：抖超小时达商家通过平台运力发货并选择需要取件码时，该字段有值返回。应用场景①骑手到店后报流水号，门店员工根据流水号【示例值：流水号#1】找到对应包裹。②门店员工与骑手核对取件码，核对无误后交货给骑手；", example = "7198")
	private String hourUpPickupCode;

	@SerializedName("guarantee_amount")
	@OpField(desc = "保价金额，单位：分（小时达业务使用）", example = "300")
	private Long guaranteeAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTransitMergeType(String transitMergeType){
		this.transitMergeType = transitMergeType;
	}

	
	public String getTransitMergeType(){
		return this.transitMergeType;
	}

	
	public void setSpTotalPrice(Long spTotalPrice){
		this.spTotalPrice = spTotalPrice;
	}

	
	public Long getSpTotalPrice(){
		return this.spTotalPrice;
	}

	
	public void setSpPrice(Long spPrice){
		this.spPrice = spPrice;
	}

	
	public Long getSpPrice(){
		return this.spPrice;
	}

	
	public void setSpDiscountPrice(Long spDiscountPrice){
		this.spDiscountPrice = spDiscountPrice;
	}

	
	public Long getSpDiscountPrice(){
		return this.spDiscountPrice;
	}

	
	public void setTrackingNo(String trackingNo){
		this.trackingNo = trackingNo;
	}

	
	public String getTrackingNo(){
		return this.trackingNo;
	}

	
	public void setCompany(String company){
		this.company = company;
	}

	
	public String getCompany(){
		return this.company;
	}

	
	public void setShipTime(Long shipTime){
		this.shipTime = shipTime;
	}

	
	public Long getShipTime(){
		return this.shipTime;
	}

	
	public void setDeliveryId(String deliveryId){
		this.deliveryId = deliveryId;
	}

	
	public String getDeliveryId(){
		return this.deliveryId;
	}

	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	
	public String getCompanyName(){
		return this.companyName;
	}

	
	public void setProductInfo(List<ProductInfoItem> productInfo){
		this.productInfo = productInfo;
	}

	
	public List<ProductInfoItem> getProductInfo(){
		return this.productInfo;
	}

	
	public void setAddedServices(List<AddedServicesItem> addedServices){
		this.addedServices = addedServices;
	}

	
	public List<AddedServicesItem> getAddedServices(){
		return this.addedServices;
	}

	
	public void setHourUpPickupCode(String hourUpPickupCode){
		this.hourUpPickupCode = hourUpPickupCode;
	}

	
	public String getHourUpPickupCode(){
		return this.hourUpPickupCode;
	}

	
	public void setGuaranteeAmount(Long guaranteeAmount){
		this.guaranteeAmount = guaranteeAmount;
	}

	
	public Long getGuaranteeAmount(){
		return this.guaranteeAmount;
	}

}